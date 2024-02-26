package org.example.Ejercicio3.SistemaDeDispositivosElectronicos

class Coche: EncendidoApagado, Vehiculo {
    override var motorEncendido: Boolean = false
    override var kmHora: Int = 0

    override fun encender() {
        motorEncendido = true
    }
    override fun apagar() {
        motorEncendido = false
    }
    override fun acelerar(kmH: Int) {
        if (motorEncendido)
            kmHora += kmH
    }
    override fun frenar(kmH: Int) {
        if (motorEncendido)
            kmHora -= kmH
            if (kmHora > 0)
                kmHora = 0
    }
}