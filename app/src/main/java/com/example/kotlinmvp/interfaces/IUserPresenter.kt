package com.example.kotlinmvp.interfaces

interface IUserPresenter {
    fun showSuccessLogin(message: String)

    fun showFailedLogin(message: String)

    fun login(email: String, password: String)
}
