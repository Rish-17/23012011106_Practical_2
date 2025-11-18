package com.example.mad_23012011106_practical_2

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun showMessage(msg: String){
        Log.i(TAG, "showMessage:$msg ")
        Toast.makeText(this, msg , Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        showMessage("onStart method is called")
        super.onStart()
    }
    override fun onPause() {
        showMessage("onPause method is called")
        super.onPause()
    }
    override fun onResume() {
        showMessage("onResume method is called")
        super.onResume()
    }



    override fun onStop() {
        showMessage("onStop method is called")
        super.onStop()
    }

    override fun onRestart() {
        showMessage("onRestart method is called")
        super.onRestart()
    }

    override fun onDestroy() {
        showMessage("onDestroy method is called")
        super.onDestroy()
    }

}