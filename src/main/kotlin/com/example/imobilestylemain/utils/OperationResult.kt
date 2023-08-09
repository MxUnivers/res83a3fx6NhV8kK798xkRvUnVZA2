package com.example.imobileappapi.utils

class OperationResult<T>(val data: T?,
                         val errors: MutableMap<String, String>? = null) {

    val isSuccess: Boolean = errors == null || errors.isEmpty()
}