package org.example.Ejercicio4.SistemaDeNotificaciones

class MensajeTexto: Notificable {
    override fun enviarNotificacion(): String {
        return "Has recibido un mensaje de texto"
    }
}