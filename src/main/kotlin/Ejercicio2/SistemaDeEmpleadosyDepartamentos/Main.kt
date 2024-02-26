package org.example.Ejercicio2.SistemaDeEmpleadosyDepartamentos

fun main() {
    val departamento = Departamento()
    val empleado = EmpleadoFijo(35000.0, 14, "Juan")
    val empleado2 = EmpleadoPorHora(90.0, 12.5, "Pepe")
    val empleado3 = EmpleadoPorHora(110.0, 13.5, "Rosa")
    val empleado4 = EmpleadoFijo(16000.0, 14, "Juan Antonio")
    departamento.addEmpleado(empleado)
    departamento.addEmpleado(empleado2)
    departamento.addEmpleado(empleado3)
    departamento.addEmpleado(empleado4)

    departamento.listaEmpleados.forEach(){
        println("${it.nombre} con ${it.id} tiene un salario de ${it.calcularSalario()} al mes")
    }

}