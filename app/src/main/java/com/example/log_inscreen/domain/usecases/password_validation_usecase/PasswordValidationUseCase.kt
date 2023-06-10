package com.example.log_inscreen.domain.usecases.password_validation_usecase

import com.example.log_inscreen.domain.models.common.PasswordModel
import com.example.log_inscreen.domain.models.errors.ErrorMessageModel
import com.example.log_inscreen.domain.usecases.password_validation_usecase.logic.PasswordValidation.validatePassword

object PasswordValidationUseCase {
    fun execute(password : PasswordModel) : ErrorMessageModel? {
        return validatePassword(password.password)
    }
}