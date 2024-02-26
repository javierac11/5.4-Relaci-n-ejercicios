package org.example.Ejercicio2.SistemaDeEmpleadosyDepartamentos

class EmpleadoFijo(var salarioAnual: Double, var numeroDePagas: Double, nombre: String): Empleado(nombre) {

    override fun calcularSalario(): Double {
        var salario = salarioAnual / numeroDePagas
        return String.format("%.2f", salario).replace(',', '.').toDouble()
    }
}