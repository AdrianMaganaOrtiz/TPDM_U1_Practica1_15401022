package mx.edu.ittepic.tpdm_u1_practica1_15401022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main11Activity : AppCompatActivity() {

    var boton: Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
        boton = findViewById(R.id.btnreg)
        boton?.setOnClickListener{
            finish()
        }
    }
}
