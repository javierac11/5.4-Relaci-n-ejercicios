package org.example.Ejercicio4.SistemaDeNotificaciones

fun main() {
    val notificaciones = listOf<Notificable>(CorreoElectronico(), MensajeTexto(), NotificacionPush())
    notificaciones.forEach(){
        it.enviarNotificacion()
    }
}