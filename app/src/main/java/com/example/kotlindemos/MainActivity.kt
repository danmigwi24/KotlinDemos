package com.example.kotlindemos

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.kotlindemos.Firebaseapp.FbloginActivity
import com.example.kotlindemos.crudmysql.MysqlActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Exit")
        builder.setMessage("Do you really want to exit ?")
        builder.setPositiveButton("Yes") { dialog: DialogInterface?, which: Int ->
            finish()
        }
        builder.setNegativeButton("No", { dialog: DialogInterface?, which: Int -> })
        builder.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun Listview(view: View) {
        val intent = Intent(applicationContext, ListviewActivity::class.java)
        startActivity(intent)
    }

    fun Robotwalk(view: View) {
        val intent = Intent(applicationContext, RobotwalkActivity::class.java)
        startActivity(intent)
    }

    fun Login(view: View) {
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }
    fun Firebase(view: View){
        val intent=Intent(applicationContext,FbloginActivity::class.java)
        startActivity(intent)
    }
    fun mysql(view: View){
        val intent=Intent(applicationContext,MysqlActivity::class.java)
        startActivity(intent)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_resourcelayout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.actionexit) {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Exit")
            builder.setMessage("Do you really want to exit ?")
            builder.setPositiveButton("Yes") { dialog: DialogInterface?, which: Int ->
                finish()
            }
            builder.setNegativeButton("No", { dialog: DialogInterface?, which: Int -> })
            builder.show()
        }
        return super.onOptionsItemSelected(item)
    }


}



