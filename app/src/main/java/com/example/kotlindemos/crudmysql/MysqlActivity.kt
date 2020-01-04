package com.example.kotlindemos.crudmysql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import com.example.kotlindemos.R
import kotlinx.android.synthetic.main.activity_mysql.*
import okhttp3.*
import okhttp3.HttpUrl.*
import java.io.IOException


class MysqlActivity : AppCompatActivity() {

   /* var txtInfo: TextView? = null
    var txtPID: EditText? = null
    var txtPName:EditText? = null
    var txtPrice:EditText? = null
    var btnCreate: Button? = null
    var btnRead:Button? = null
    var btnUpdate:Button? = null
    var btnDelete:Button? = null*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysql)

        btnCreate.setOnClickListener{
            //fun onClick(view: View) {

                try {
                    val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
                    StrictMode.setThreadPolicy(policy)

                    val client = OkHttpClient()

                    val urlBuilder =
                        parse("http://192.168.43.29/danphp/crudapi/create.php")!!.newBuilder()
                    urlBuilder.addQueryParameter("PName", txtPName.getText().toString())
                    urlBuilder.addQueryParameter("Price", txtPrice.getText().toString())

                    val url = urlBuilder.build().toString()

                    val request = Request.Builder()
                        .url(url)
                        .build()

                    client.newCall(request).enqueue(object : Callback {
                        override fun onFailure(call: Call, e: IOException) {

                        }

                        @Throws(IOException::class)
                        override fun onResponse(call: Call, response: Response) {

                            runOnUiThread {
                                try {
                                    txtInfo.setText(response.body()!!.string())
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                            }
                        }
                    })
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
    }
//}
