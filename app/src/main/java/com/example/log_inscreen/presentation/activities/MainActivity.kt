package com.example.log_inscreen.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import com.example.log_inscreen.R
import com.example.log_inscreen.domain.models.common.EmailModel
import com.example.log_inscreen.domain.usecases.email_validation_usecase.EmailValidationUseCase


/*
    TODO:
        1. Write CheckFieldsUseCase()
        DONE - Write EmailValidationUseCase()
        3. Write PasswordValidationUseCase()
        4. Write AutoCompleteUseCase()
        ADD:
            - LiveData for etFields
            - Observer for checking are fields empty
 */

class MainActivity : AppCompatActivity() {
    private lateinit var etEmail : EditText
    private lateinit var twEmailError: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        etEmail = findViewById(R.id.etEmail)
        twEmailError = findViewById(R.id.twEmailError)
        emailTextWatcher(etEmail, twEmailError)
    }
}

private fun emailTextWatcher(etEmail: EditText, twEmailError: TextView) {
    var tempEmailHolder : EmailModel = EmailModel("")
    var err : String? = ""
    val textWatcher = object : TextWatcher  {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //Do nothing
        }

        override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //Do nothing
        }

        override fun afterTextChanged(s: Editable?) {
            Log.d("AAA", s.toString())
            tempEmailHolder.email = s.toString()
            err = EmailValidationUseCase.execute(tempEmailHolder)?.message
            twEmailError.text = err
            Log.d("AAA", "$err")
        }
    }
    etEmail.addTextChangedListener(textWatcher)
}