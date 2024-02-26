package org.example.Ejercicio2.SistemaDeEmpleadosyDepartamentos

fun main() {
    var empleado = EmpleadoFijo(45.0, 56.0, "dsa")
    var empleado2 = EmpleadoPorHora(45.0, 56.0, "dsa")
    println(empleado.calcularSalario())
    println(empleado2.calcularSalario())
}