package br.cicero.brq

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PrincipalActivity : AppCompatActivity() {

    lateinit var btnteladois: Button
    lateinit var textview : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        CarregarOsElementos()
        CarregarOsEventos()
        abrirTerceiraTela()
    }

    fun CarregarOsElementos(){
        btnteladois = findViewById(R.id.button2)
        textview = findViewById(R.id.textView2)
    }
    fun CarregarOsEventos(){
        btnteladois.setOnClickListener {
            abrirTerceiraTela()
        }


    }

    fun abrirTerceiraTela() {
        val intent = Intent(this, TerceiraActivity::class.java)

        startActivity(intent)

    }

    
    
    
    
}