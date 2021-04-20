package com.example.kotlinmvp.presenter

import com.example.kotlinmvp.interfaces.IUserPresenter
import com.example.kotlinmvp.interfaces.IUserView
import com.example.kotlinmvp.model.UserModel
import com.example.kotlinmvp.view.MainActivity

class UserPresenter (view: MainActivity): IUserPresenter{

    private val view: IUserView = view
    private val model = UserModel(this)

    override fun showLoginResult(message: String) {
        view.showLoginResult(message)
    }

    override fun login(email: String, password: String) {
        model.login(email, password)
    }

}
