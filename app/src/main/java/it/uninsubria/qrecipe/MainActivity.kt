package it.uninsubria.qrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun logClient (view: View){
        val i = Intent (applicationContext, Login_cliente:: class .java)
        startActivity(i)
    }

    fun Registry (view: View){
        val i = Intent (applicationContext, Registrazione:: class .java)
        startActivity(i)
    }


}
