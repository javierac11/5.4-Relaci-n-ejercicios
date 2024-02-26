package org.example.Ejercicio4.SistemaDeNotificaciones

class CorreoElectronico: Notificable {
    override fun enviarNotificacion(): String {
        return "Has recivido un correo electronico"
    }
}