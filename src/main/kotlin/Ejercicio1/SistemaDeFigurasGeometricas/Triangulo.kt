package org.example.Ejercicio1.SistemaDeFigurasGeometricas

class Triangulo(var ladoBase: Double, var lado1: Double, var lado2: Double, var altura: Double, color:String = "Blanco"): Figura(color) {

    override fun area(): Double {
        var area = ladoBase * altura / 2
        return area
    }

    override fun perimetro(): Double {
        var perimetro = ladoBase + lado1 + lado2
        return perimetro
    }
}