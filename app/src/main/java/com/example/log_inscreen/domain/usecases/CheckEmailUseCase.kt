package com.example.log_inscreen.domain.usecases

import com.example.log_inscreen.domain.errors.EmailErrorMessages
import com.example.log_inscreen.domain.models.errors.ErrorMessageModel

class CheckEmailUseCase {
}

private fun isEmailValid(email: String): ErrorMessageModel? {
    if (email.isEmpty())
        return EmailErrorMessages.EMAIL_EMPTY_ERROR
    if (email.count { it == '@' } != 1)
        return EmailErrorMessages.EMAIL_ONLY_ONE_AT
    val userName = email.split("@")[0]
    if (userName.isEmpty())
        return EmailErrorMessages.EMAIL_USERNAME_EMPTY_ERROR
    val domain = email.split("@")[1]
    if (domain.isEmpty())
        return EmailErrorMessages.EMAIL_DOMAIN_EMPTY_ERROR
    if (!domain.contains("."))
        return EmailErrorMessages.EMAIL_DOMAIN_NO_DOT_ERROR
    if (domain.endsWith("."))
        return EmailErrorMessages.EMAIL_DOMAIN_ENDS_WITH_DOT_ERROR
    if (!doesDomainExist(domain))
        return EmailErrorMessages.EMAIL_DOMAIN_DOES_NOT_EXIST_ERROR
    return null
}

private fun doesDomainExist(domain: String) : Boolean {
    return true
    // TODO: Implement domain dns checking
}


