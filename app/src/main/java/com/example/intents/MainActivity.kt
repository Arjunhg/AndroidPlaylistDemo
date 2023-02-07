package com.example.intents
// Intents are used to jump from one screen to another
/* Are of two types
* Explicit :- Jumping from one screen to another within app
* Implicit :- Jumping from one application to another */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent = findViewById<Button>(R.id.button)

         // Now we need to perform some action by clicking this button
        btnIntent.setOnClickListener{ // Code for jumping from one screen to another. yha se click krne ke baad kya hoga
            //Open a new activity
            intent = Intent(applicationContext, SecondActivity::class.java) // intent is a In_Build Method and we passed two parameters
            startActivity(intent)

        }
    }
}