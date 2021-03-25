package com.gcr.hilt01.di.pc_basic_inject

import javax.inject.Inject

class Ordenador @Inject constructor(private val cableConnection: CableConnection) {
    fun tengoUnPC(): String {
        return "${cableConnection.tengoEnergia()} y la pc funciona"
    }
}