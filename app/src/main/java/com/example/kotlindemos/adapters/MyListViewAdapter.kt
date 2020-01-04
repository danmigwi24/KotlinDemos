package com.example.kotlindemos.adapters

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView
import com.example.kotlindemos.R
import com.example.kotlindemos.models.Model

class MyListViewAdapter(var cxt: Context, var resource: Int, var items: List<Model>) : ArrayAdapter<Model>(cxt, resource, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater= LayoutInflater.from(cxt)
        val view:View=layoutInflater.inflate(resource,null)

        val imageView:ImageView=view.findViewById(R.id.imageviewlist)
        val titleTv: TextView =view.findViewById(R.id.titleTxt)
        val descriptionTV:TextView=view.findViewById(R.id.descriptionTxt)

        var mitem:Model=items[position]

        imageView.setImageDrawable(cxt.resources.getDrawable(mitem.imageurl))
        titleTv.text=mitem.title
        descriptionTV.text=mitem.description

        return view
    }
}
