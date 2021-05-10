package br.cicero.brq

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.cicero.brq.Model.Pessoa
import br.cicero.brq.Model.Users

class LoginActivity : AppCompatActivity() {

    lateinit var btnlogin: Button
    lateinit var tituloView: TextView
    lateinit var imag: ImageView
    lateinit var editTextEmail: EditText
    lateinit var editTextSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        CarregarElementos()
        CarregarEventos()



    }

    fun CarregarElementos() {

        btnlogin = findViewById<Button>(R.id.button)
        tituloView = findViewById<TextView>(R.id.textView1)
        imag = findViewById(R.id.imag)
        editTextEmail = findViewById(R.id.EditTextEmail)
        editTextSenha = findViewById(R.id.EditTextSenha)
    }

    fun CarregarEventos() {
        btnlogin.setOnClickListener {



            val email = editTextEmail.text.toString()
            val senha = editTextSenha.text.toString()






            fun abrirSegundaTela() {

                val intent = Intent(this, PrincipalActivity::class.java)
                startActivity(intent)
            }
        }
    }

}






















//            override fun onStart() {
//                super.onStart()
//            }
//
//            override fun onResume() {
//                super.onResume()
//
//
//            }
//
//            override fun onRestart() {
//                super.onRestart()
//
//
//            }
//
//            override fun onPause() {
//                super.onPause()
//
//            }
//
//            override fun onStop() {
//                super.onStop()
//
//            }
//
//            override fun onDestroy() {
//                super.onDestroy()
//
//            }
//        }
//    }
//
//}



