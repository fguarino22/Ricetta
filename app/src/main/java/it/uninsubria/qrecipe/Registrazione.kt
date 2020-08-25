package it.uninsubria.qrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registrazione : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrazione)
    }

    fun annulla (view: View){
        val i = Intent (applicationContext, MainActivity:: class .java)
        startActivity(i)
    }

   // fun conferma (view: View){
     //   val i = Intent (applicationContext, suspense :: class .java)
     //   startActivity(i)
   // }
}
