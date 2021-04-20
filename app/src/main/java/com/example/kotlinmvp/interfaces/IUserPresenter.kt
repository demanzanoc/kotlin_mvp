package com.example.kotlinmvp.interfaces

interface IUserPresenter {
    fun showLoginResult(message: String)
    fun login(email: String, password: String)
}
