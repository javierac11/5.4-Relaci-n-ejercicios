package org.example.Ejercicio2.SistemaDeEmpleadosyDepartamentos

class EmpleadoPorHora(var horasTrabajadasMes: Double, var tarifaHora: Double, nombre: String): Empleado(nombre) {

    override fun calcularSalario(): Double {
        var salario = horasTrabajadasMes * tarifaHora
        return String.format("%.2f", salario).replace(',', '.').toDouble()
    }

}