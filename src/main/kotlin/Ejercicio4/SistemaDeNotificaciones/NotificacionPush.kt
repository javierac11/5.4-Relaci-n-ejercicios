package org.example.Ejercicio4.SistemaDeNotificaciones

class NotificacionPush: Notificable {

    override fun enviarNotificacion(): String {
        return "Se ha realizado un push"
    }
}