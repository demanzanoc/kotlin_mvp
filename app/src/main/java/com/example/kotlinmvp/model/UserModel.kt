package com.example.kotlinmvp.model

import android.text.TextUtils
import android.util.Patterns
import com.example.kotlinmvp.entities.User
import com.example.kotlinmvp.interfaces.IUserModel
import com.example.kotlinmvp.interfaces.IUserPresenter
import com.example.kotlinmvp.presenter.UserPresenter

class UserModel (presenter: UserPresenter): IUserModel{

    private val presenter: IUserPresenter = presenter

    override fun login(email: String, password: String) {
        val user = User(email, password)
        if (!TextUtils.isEmpty(user.email) &&
            Patterns.EMAIL_ADDRESS.matcher(user.email).matches() &&
            user.password.length > 6) {
            presenter.showLoginResult("Login is successful")
        } else {
            presenter.showLoginResult("Login is failure")
        }
    }
}
