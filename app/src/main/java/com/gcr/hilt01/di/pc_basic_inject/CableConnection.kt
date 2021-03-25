package com.gcr.hilt01.di.pc_basic_inject

import javax.inject.Inject

class CableConnection @Inject constructor(private val energy: Energy) {
    fun tengoEnergia(): String{
        return "${energy.electric()}, electricidad"
    }
}