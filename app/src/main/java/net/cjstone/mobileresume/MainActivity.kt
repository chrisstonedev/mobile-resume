package net.cjstone.mobileresume

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHistory = findViewById<Button>(R.id.work_history)
        workHistory.setOnClickListener {
            val moveToWorkHistory = Intent(applicationContext, WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        val call = findViewById<Button>(R.id.call)
        call.setOnClickListener {
            // Not committing my actual phone number here.
            val phoneUri = Uri.parse("tel:15555555555")
            val callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }

        val email = findViewById<Button>(R.id.email)
        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.type = "plain/text"
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("christopher@closetoeuphoria.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contact through Mobile Resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello,\n\n" +
                    "I saw your resume and would like to get in touch.\n\n")
            startActivity(emailIntent)
        }
    }
}
