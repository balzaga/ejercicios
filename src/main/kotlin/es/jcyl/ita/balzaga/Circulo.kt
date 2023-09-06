package es.jcyl.ita.balzaga

//Ejercicio 2: Uso de interfaces
// Crea una interfaz llamada Calculable con dos métodos abstractos:
// calcularArea() y calcularPerimetro().
// Luego, crea una clase llamada Circulo que implemente esta interfaz y proporcione implementaciones
// para los métodos abstractos.

import es.jcyl.ita.balzaga.interfaces.Calculable

class Circulo(val radio: Double = 0.0) : Calculable {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }

    override fun calcularPerimetro(): Double {
        return 2 * Math.PI * radio
    }
}

fun main() {
    // Crear una instancia de Circulo y calcular su área y perímetro
    val circulo = Circulo(5.0)
    val area = circulo.calcularArea()
    val perimetro = circulo.calcularPerimetro()

    println("Área del círculo: $area")
    println("Perímetro del círculo: $perimetro")
}