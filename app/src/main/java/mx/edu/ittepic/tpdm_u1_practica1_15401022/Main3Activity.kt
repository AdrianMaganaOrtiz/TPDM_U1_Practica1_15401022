package mx.edu.ittepic.tpdm_u1_practica1_15401022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main3Activity : AppCompatActivity() {

    var boton: Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        boton = findViewById(R.id.btnreg)
        boton?.setOnClickListener{
            finish()
        }
    }
}
