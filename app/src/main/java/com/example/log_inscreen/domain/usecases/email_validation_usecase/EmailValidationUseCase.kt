package com.example.log_inscreen.domain.usecases.email_validation_usecase

import com.example.log_inscreen.domain.models.common.EmailModel
import com.example.log_inscreen.domain.models.errors.ErrorMessageModel
import com.example.log_inscreen.domain.usecases.email_validation_usecase.logic.SyntaxValidation

object EmailValidationUseCase {
    fun execute(email: EmailModel): ErrorMessageModel? {
        return SyntaxValidation.emailSyntaxValidErr(email.email)
    }
}



