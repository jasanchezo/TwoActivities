package com.mtw.josealejandrosanchezortega.twoactivities

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    // private val LOG_TAG = MainActivity::class.java.simpleName

    // SENTENCIA QUE SIRVE PARA DECLARAR VARIABLES ETSTATICAS FINALES EN KOTLIN
    companion object {
        val EXTRA_REPLY : String = "com.mtw.josealejandrosanchezortega.twoactivities.extra.REPLY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // SE RECUPERA EL DATO DE LA LLAVE
        text_message.text = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
    }

    fun returnReply(view : View) {
        val replyIntent = Intent()
        val replyMessage= editText_second.text.toString()

        // PASAR DATOS ADICIONALES A UN INTENT
        replyIntent.putExtra(EXTRA_REPLY, replyMessage)

        setResult(Activity.RESULT_OK, replyIntent)

        finish()
    }
}
