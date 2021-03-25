package com.gcr.hilt01.di.pc_basic_inject

import javax.inject.Inject

class Energy @Inject constructor() {
    fun electric(): String {
        return "Energizando el pc..."
    }
}