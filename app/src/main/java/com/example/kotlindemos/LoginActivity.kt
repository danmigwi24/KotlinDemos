package com.example.kotlindemos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlindemos.db.DataBasehelper
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.loginasregister.*
import kotlinx.android.synthetic.main.loginasuser.*

class LoginActivity : AppCompatActivity() {

    lateinit var databasehelper: DataBasehelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        databasehelper = DataBasehelper(this)

        showHome()

        btnlogin.setOnClickListener {
            showLogin()
        }
        btnregister.setOnClickListener {
            showRegistration()
        }

        btn_register_db.setOnClickListener {
            databasehelper.insertUserdata(
                edtname_register.text.toString(),
                edtemail_register.text.toString(),
                edtpassword_register.text.toString()
            )
            Toast.makeText(this, "Data Successfully Inserted to Database", Toast.LENGTH_LONG).show()
            showHome()
        }

        btn_login_db.setOnClickListener {
            if (databasehelper.userPresent(edtloginname.text.toString(), edtloginpassword.text.toString())) {
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Invalid User", Toast.LENGTH_LONG)
                    .show()
            }
        }


    }

    private fun showRegistration() {
        registration_layout.visibility = View.VISIBLE
        login_layout.visibility = View.GONE
        home_l1.visibility = View.GONE
    }

    private fun showLogin() {
        registration_layout.visibility = View.GONE
        login_layout.visibility = View.VISIBLE
        home_l1.visibility = View.GONE
    }

    private fun showHome() {
        registration_layout.visibility = View.GONE
        login_layout.visibility = View.GONE
        home_l1.visibility = View.VISIBLE
    }
}
