package com.example.kotlindemos.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBasehelper(context: Context):SQLiteOpenHelper(context,dbname,factory,version ) {
    companion object{
        internal val dbname="userdb"
        internal val factory= null
        internal val version=1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE user (id integer primary key autoincrement, name varchar(30), email varchar(100), password varchar20)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
    fun insertUserdata(name:String,email:String,password:String){
        val db:SQLiteDatabase=writableDatabase
        val values= ContentValues()

        values.put("name",name)
        values.put("email",email)
        values.put("password",password)

        db.insert("user",null,values)
        db.close()
    }
    fun userPresent(name:String,password:String):Boolean{
        val db=writableDatabase
        val query="SELECT * FROM user WHERE name='$name' and password='$password'"

        val cursor=db.rawQuery(query,null)
        if (cursor.count<=0)
        {
            cursor.close()
            return false
        }
        cursor.close()
        return true
    }
}