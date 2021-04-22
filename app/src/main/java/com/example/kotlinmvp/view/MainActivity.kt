package com.example.kotlinmvp.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kotlinmvp.R
import com.example.kotlinmvp.interfaces.IUserPresenter
import com.example.kotlinmvp.interfaces.IUserView
import com.example.kotlinmvp.presenter.UserPresenter
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity(), IUserView {

    private lateinit var presenter : IUserPresenter
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btLogin: Button
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initElements()
        onLoginClick()
    }

    private fun initElements() {
        presenter = UserPresenter(this)
        context = applicationContext
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btLogin = findViewById(R.id.btLogin)
    }

    private fun onLoginClick() {
        btLogin.setOnClickListener {
            presenter.login(etEmail.text.toString(), etPassword.text.toString())
        }
    }

    override fun showLoginResult(message: String) {
        Toasty.info(context, message, Toast.LENGTH_LONG).show()
    }
}
