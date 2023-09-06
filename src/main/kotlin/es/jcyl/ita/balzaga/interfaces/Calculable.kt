package es.jcyl.ita.balzaga.interfaces

//Ejercicio 2: Uso de interfaces

// Crea una interfaz llamada Calculable con dos métodos abstractos:
// calcularArea() y calcularPerimetro().
// Luego, crea una clase llamada Circulo que implemente esta interfaz y proporcione implementaciones
// para los métodos abstractos.

interface Calculable {
    fun calcularArea():Double

    fun calcularPerimetro():Double

}
