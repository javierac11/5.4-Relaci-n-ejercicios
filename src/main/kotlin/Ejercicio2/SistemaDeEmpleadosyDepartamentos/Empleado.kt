package org.example.Ejercicio2.SistemaDeEmpleadosyDepartamentos

abstract class Empleado(var nombre: String) {

    var id = generarId()

    companion object{
        var numeroId = 0
        fun generarId(): String{
            var id = "ID-${String.format("%04d", numeroId)}"
            numeroId++
            return id
        }
    }

    abstract fun calcularSalario(): Double

}