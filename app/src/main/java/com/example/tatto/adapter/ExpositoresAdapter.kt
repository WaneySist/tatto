package com.example.tatto.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tatto.R
import com.example.tatto.data.ExpositoresD
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.view.*

class ExpositoresAdapter(
    val expositoreD:List<ExpositoresD>):RecyclerView.Adapter<ExpositoresAdapter.ExpoHolder>(){


        class ExpoHolder(val view:View):RecyclerView.ViewHolder(view){
            fun render(expositoresD: ExpositoresD){
                view.nameExpositor.text=expositoresD.name
                view.aliasExpositor.text=expositoresD.alias
                view.PaisExpositor.text=expositoresD.pais
                Picasso.get().load(expositoresD.img)
                Picasso.get().load(expositoresD.bandera)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpoHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return ExpoHolder(layoutInflater.inflate(R.layout.activity_expositores,parent,false))
    }

    override fun onBindViewHolder(holder: ExpoHolder, position: Int) {
       holder.render(expositoreD[position])
    }

    override fun getItemCount(): Int = expositoreD.size


}