package com.reagent.moneytalks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.read
import android.util.Log
import android.widget.TextView
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import okhttp3.*
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}