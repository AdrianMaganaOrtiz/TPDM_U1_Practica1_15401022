package mx.edu.ittepic.tpdm_u1_practica1_15401022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    var img1 : ImageButton ?= null
    var img2 : ImageButton ?= null
    var img3 : ImageButton ?= null
    var img4 : ImageButton ?= null
    var img5 : ImageButton ?= null
    var img6 : ImageButton ?= null
    var img7 : ImageButton ?= null
    var img8 : ImageButton ?= null
    var img9 : ImageButton ?= null
    var img10 : ImageButton ?= null
    var img11 : ImageButton ?= null
    var img12 : ImageButton ?= null
    var img13 : ImageButton ?= null
    var img14 : ImageButton ?= null
    var img15 : ImageButton ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img1 = findViewById(R.id.imagen1)
        img2 = findViewById(R.id.imagen2)
        img3 = findViewById(R.id.imagen3)
        img4 = findViewById(R.id.imagen4)
        img5 = findViewById(R.id.imagen5)
        img6 = findViewById(R.id.imagen6)
        img7 = findViewById(R.id.imagen7)
        img8 = findViewById(R.id.imagen8)
        img9 = findViewById(R.id.imagen9)
        img10 = findViewById(R.id.imagen10)
        img11 = findViewById(R.id.imagen11)
        img12 = findViewById(R.id.imagen12)
        img13 = findViewById(R.id.imagen13)
        img14 = findViewById(R.id.imagen14)
        img15 = findViewById(R.id.imagen15)

        img1?.setOnClickListener {
            var activity2 = Intent(this, Main1Activity::class.java)
            startActivity(activity2)
        }
        img2?.setOnClickListener {
            var activity2 = Intent(this, Main2Activity::class.java)
            startActivity(activity2)
        }
        img3?.setOnClickListener {
            var activity2 = Intent(this, Main3Activity::class.java)
            startActivity(activity2)
        }
        img4?.setOnClickListener {
            var activity2 = Intent(this, Main4Activity::class.java)
            startActivity(activity2)
        }
        img5?.setOnClickListener {
            var activity2 = Intent(this, Main15Activity::class.java)
            startActivity(activity2)
        }
        img6?.setOnClickListener {
            var activity2 = Intent(this, Main6Activity::class.java)
            startActivity(activity2)
        }
        img7?.setOnClickListener {
            var activity2 = Intent(this, Main7Activity::class.java)
            startActivity(activity2)
        }
        img8?.setOnClickListener {
            var activity2 = Intent(this, Main8Activity::class.java)
            startActivity(activity2)
        }
        img9?.setOnClickListener {
            var activity2 = Intent(this, Main9Activity::class.java)
            startActivity(activity2)
        }
        img10?.setOnClickListener {
            var activity2 = Intent(this, Main10Activity::class.java)
            startActivity(activity2)
        }
        img11?.setOnClickListener {
            var activity2 = Intent(this, Main11Activity::class.java)
            startActivity(activity2)
        }
        img12?.setOnClickListener {
            var activity2 = Intent(this, Main12Activity::class.java)
            startActivity(activity2)
        }
        img13?.setOnClickListener {
            var activity2 = Intent(this, Main13Activity::class.java)
            startActivity(activity2)
        }
        img14?.setOnClickListener {
            var activity2 = Intent(this, Main14Activity::class.java)
            startActivity(activity2)
        }
        img15?.setOnClickListener {
            var activity2 = Intent(this, Main15Activity::class.java)
            startActivity(activity2)
        }
    }
}
