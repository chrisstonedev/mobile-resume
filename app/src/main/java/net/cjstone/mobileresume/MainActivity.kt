package net.cjstone.mobileresume

import android.content.Intent
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
    }
}
