package com.example.log_inscreen.domain.usecases.email_validation_usecase.logic

import com.example.log_inscreen.domain.errors.EMAIL_ERR_MESSAGES
import com.example.log_inscreen.domain.models.common.EmailModel
import com.example.log_inscreen.domain.models.errors.ErrorMessageModel


object SyntaxValidation {
    fun emailSyntaxValidErr(email: String): ErrorMessageModel? {
        var domain = ""
        var userName = ""

        if (email.isEmpty())
            return EMAIL_ERR_MESSAGES.EMAIL_EMPTY_ERROR
        if (email.count { it == '@' } != 1)
            return EMAIL_ERR_MESSAGES.EMAIL_ONLY_ONE_AT
        userName = email.substringBefore("@")
        if (userName.isEmpty())
            return EMAIL_ERR_MESSAGES.EMAIL_USERNAME_EMPTY_ERROR
        domain = email.substringAfter("@")
        if (domain.isEmpty())
            return EMAIL_ERR_MESSAGES.EMAIL_DOMAIN_EMPTY_ERROR
        if (!domain.contains("."))
            return EMAIL_ERR_MESSAGES.EMAIL_DOMAIN_NO_DOT_ERROR
        if (domain.endsWith("."))
            return EMAIL_ERR_MESSAGES.EMAIL_DOMAIN_ENDS_WITH_DOT_ERROR
        return null
    }
}