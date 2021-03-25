package com.gcr.hilt01.di.user_module_inject

import com.gcr.hilt01.di.user_module_inject.UserService
import javax.inject.Inject

class UserServiceImp @Inject constructor() : UserService {
    override fun helloWorld(): String {
        return "Hola Gustavo"
    }
}