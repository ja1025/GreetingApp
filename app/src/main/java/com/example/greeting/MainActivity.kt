package com.example.greeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createGreetingCard(view: View) {

        val name = nameIp.text.toString()

        val intent = Intent(this, GreetingActivity::class.java)
        intent.putExtra(GreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }


}