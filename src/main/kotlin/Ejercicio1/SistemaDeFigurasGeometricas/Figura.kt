package org.example.Ejercicio1.SistemaDeFigurasGeometricas

abstract class Figura(var color: String = "Blanco") {
    abstract fun area(): Double

    abstract fun perimetro(): Double

}