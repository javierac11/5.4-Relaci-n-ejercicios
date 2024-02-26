package org.example.Ejercicio1.SistemaDeFigurasGeometricas

class Rectangulo(var ladoCorto: Double, var ladoLargo: Double, color: String = "Blanco"): Figura(color) {
    override fun area(): Double {
        var area = ladoCorto * ladoLargo
        return area
    }

    override fun perimetro(): Double {
        var perimetro = 2 * ladoLargo + 2 * ladoCorto
        return perimetro
    }

}
