package org.example.Ejercicio1.SistemaDeFigurasGeometricas

import java.text.DecimalFormat

class Circulo(var radio: Double, color: String = "Blanco"): Figura(color) {
    override fun area(): Double {
        var area = Math.PI * Math.pow(radio, 2.0)
        return area
    }

    override fun perimetro(): Double {
        var perimetro = 2 * Math.PI * radio
        return perimetro
    }

}