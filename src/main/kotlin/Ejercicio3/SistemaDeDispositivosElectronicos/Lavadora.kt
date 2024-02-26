package org.example.Ejercicio3.SistemaDeDispositivosElectronicos

class Lavadora: EncendidoApagado {
    var estado = "Parada"
    override fun encender() {
        estado = "Lavando"
    }

    override fun apagar() {
        estado = "Parada"
    }
}