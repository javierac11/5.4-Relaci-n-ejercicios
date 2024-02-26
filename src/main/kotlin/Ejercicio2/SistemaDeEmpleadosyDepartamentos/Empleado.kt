package org.example.Ejercicio2.SistemaDeEmpleadosyDepartamentos

/**
 *
 * En el main crea una instancia de Departamento, agrega varios empleados, recorre la lista de los empleados mostrando
 * su información
 * "Nombre con ID-0001 tiene un salario de 28697.96 al mes."
 *
 * ¿Se te ocurre alguna restricción lógica que podríamos introducir a las propiedades?
 *
 */

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