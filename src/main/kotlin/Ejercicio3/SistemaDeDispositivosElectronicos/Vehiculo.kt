package org.example.Ejercicio3.SistemaDeDispositivosElectronicos

interface Vehiculo {

    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(kmH: Int)
    fun frenar(kmH: Int)
}