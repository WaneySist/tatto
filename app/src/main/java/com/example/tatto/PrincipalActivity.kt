package com.example.tatto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tatto.AgendaActivity
import com.example.tatto.CalificanosActivity
import com.example.tatto.ExpositoresActivity
import com.example.tatto.LugarActivity
import com.example.tatto.adapter.ExpositoresAdapter
import com.example.tatto.data.ExpositoresD
import kotlinx.android.synthetic.main.activity_expositores.*

class PrincipalActivity : AppCompatActivity()

{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    fun btnAgnda(view: View) {
        startActivity(Intent(this, AgendaActivity::class.java))
    }

    fun btnExpositores(view: View) {
        startActivity(Intent(this, ExpositoresActivity::class.java))
    }
    fun btnLugar(view: View) {
        startActivity(Intent(this, LugarActivity::class.java))
    }
    fun btnCalificanos(view: View) {
        startActivity(Intent(this, CalificanosActivity::class.java))
    }

}