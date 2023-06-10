package com.example.log_inscreen.domain.errors

import com.example.log_inscreen.domain.models.errors.ErrorMessageModel


object EMAIL_ERR_MESSAGES {
    val EMAIL_EMPTY_ERROR = ErrorMessageModel("ERR001", "Email cannot be empty")
    val EMAIL_ONLY_ONE_AT = ErrorMessageModel("ERR002", "Email must contain exactly one @ symbol")
    val EMAIL_USERNAME_EMPTY_ERROR = ErrorMessageModel("ERR003", "Username cannot be empty")
    val EMAIL_DOMAIN_EMPTY_ERROR = ErrorMessageModel("ERR004", "Domain cannot be empty")
    val EMAIL_DOMAIN_NO_DOT_ERROR = ErrorMessageModel("ERR005", "Domain must contain a dot")
    val EMAIL_DOMAIN_ENDS_WITH_DOT_ERROR = ErrorMessageModel("ERR006", "Domain cannot end with a dot")
    val EMAIL_DOMAIN_DOES_NOT_EXIST_ERROR = ErrorMessageModel("ERR007", "Domain does not exist")
}