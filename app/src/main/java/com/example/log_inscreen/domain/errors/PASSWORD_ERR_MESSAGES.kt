package com.example.log_inscreen.domain.errors

import com.example.log_inscreen.domain.models.errors.ErrorMessageModel

object PASSWORD_ERR_MESSAGES {
    val PASSWORD_EMPTY_ERROR = ErrorMessageModel("ERR002", "Password field cannot be empty")
    val PASSWORD_LENGTH_ERROR = ErrorMessageModel("ERR003", "Password must be between 6 and 12 characters")
}