package com.example.kotlinmvp.presenter

import com.example.kotlinmvp.interfaces.IUserPresenter
import com.example.kotlinmvp.interfaces.IUserView
import com.example.kotlinmvp.model.interactor.UserModel
import com.example.kotlinmvp.view.MainActivity

class UserPresenter(view: MainActivity) : IUserPresenter {

    private val view: IUserView = view
    private val model = UserModel(this)

    override fun showSuccessLogin(message: String) {
        view.showSuccessLogin(message)
    }

    override fun showFailedLogin(message: String) {
        view.showFailedLogin(message)
    }

    override fun login(email: String, password: String) {
        model.login(email, password)
    }

}
