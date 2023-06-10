package com.example.log_inscreen.domain.usecases.password_validation_usecase.logic

import com.example.log_inscreen.domain.errors.PASSWORD_ERR_MESSAGES
import com.example.log_inscreen.domain.models.errors.ErrorMessageModel

object PasswordValidation {
    fun validatePassword(password : String): ErrorMessageModel? {
        if (password.isEmpty())
            return PASSWORD_ERR_MESSAGES.PASSWORD_EMPTY_ERROR
        if (password.length < 6 || password.length > 12)
            return PASSWORD_ERR_MESSAGES.PASSWORD_LENGTH_ERROR
        return null
    }
}