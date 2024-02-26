package org.example.Ejercicio2.SistemaDeEmpleadosyDepartamentos

class Departamento(var listaEmpleados: MutableList<Empleado> = mutableListOf()) {

    fun addEmpleado(empleado: Empleado){
        listaEmpleados.add(empleado)
    }

    fun calcularSalarioTotal(): Double{
        var salario = 0.0
        listaEmpleados.forEach(){
            salario += it.calcularSalario()
        }
        return salario
    }

}