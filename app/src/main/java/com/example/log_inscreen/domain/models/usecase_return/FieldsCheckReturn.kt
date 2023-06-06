package com.example.log_inscreen.domain.models.usecase_return

class FieldsCheckReturn(
    val isEmailFieldEmpty : Boolean,
    val isPasswordFieldEmpty : Boolean,
    val isEmailValid : Boolean,
    val isPasswordValid : Boolean
) {
}