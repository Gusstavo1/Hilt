package com.gcr.hilt01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gcr.hilt01.network.ApiService
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    @Inject
    lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}