package org.example.Ejercicio3.SistemaDeDispositivosElectronicos

class Telefono: EncendidoApagado, DispositivoElectronico {

    var estado = "Apagado"

    override fun encender() {
        estado = "Encendido"
    }
    override fun apagar() {
        estado = "Apagado"
    }
    override fun reiniciar() {
        estado = "Reiniciando..."
        Thread.sleep(3000)
        encender()
    }
}