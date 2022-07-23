package com.example.tatto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tatto.adapter.ExpositoresAdapter
import com.example.tatto.data.ExpositoresD
import kotlinx.android.synthetic.main.activity_expositores.*


class ExpositoresActivity : AppCompatActivity()     {

    val ExpositoresD= listOf<ExpositoresD>(
        ExpositoresD("victor murillo","Dolar","bolivia","sads","asaasa")



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expositores)
        initRecycler()

    }
    fun initRecycler(){
        recyclerExpositores.layoutManager= LinearLayoutManager(this)
        val adapter= ExpositoresAdapter(ExpositoresD)
        recyclerExpositores.adapter=adapter
    }
}