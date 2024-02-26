package org.example.Ejercicio1.SistemaDeFigurasGeometricas

/**
 *
 * como Circulo, Rectangulo, y Triangulo, proporcionando la implementación específica de estos métodos.
 * La clase Figura podría tener propiedades comunes como el color, que se inicializarán a través del constructor.
 *
 * El valor de PI lo conseguimos con Math.PI
 *
 * Objetivos:
 *
 *     Practicar la creación de clases abstractas y métodos abstractos.
 *     Entender cómo las subclases proporcionan implementaciones concretas de métodos abstractos.
 *     Familiarizarse con los conceptos básicos de geometría y cómo se pueden aplicar en la programación orientada a objetos.
 *
 */

abstract class Figura(var color: String = "Blanco") {
    abstract fun area(): Double

    abstract fun perimetro(): Double

}