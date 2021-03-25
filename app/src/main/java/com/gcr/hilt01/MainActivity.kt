package com.gcr.hilt01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import com.gcr.hilt01.di.user_module_inject.UserService
import com.gcr.hilt01.di.user_module_inject.UserServiceDos
import com.gcr.hilt01.di.pc_basic_inject.Ordenador
import com.gcr.hilt01.model.UserResponse
import com.gcr.hilt01.network.ApiService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Response
import javax.inject.Inject
import javax.security.auth.callback.Callback

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var ordenador: Ordenador
    @UserServiceDos
    @Inject lateinit var userService: UserService
    @Inject lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Main", "onCreate: ${ordenador.tengoUnPC()}")
        Log.d("Main", "onCreate: ${userService.helloWorld()}")

        btnActivity.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

        val call = apiService.getData();
        call.enqueue(object : retrofit2.Callback<List<UserResponse>> {
            override fun onResponse(
                call: retrofit2.Call<List<UserResponse>>,
                response: Response<List<UserResponse>>
            ) {
                Log.d("Main", "onResponse: ${response.isSuccessful}")
                response.body()?.forEachIndexed { index, userResponse ->
                    Log.d("Main", "onResponse: ${userResponse.title}")
                }
            }
            override fun onFailure(call: retrofit2.Call<List<UserResponse>>, t: Throwable) {
                Log.d("Main", "onResponse: error !${t.message}")
            }

        })
    }
}