package es.jcyl.ita.balzaga
// Crea una interfaz llamada Calculable con dos métodos abstractos:
// calcularArea() y calcularPerimetro().
// Luego, crea una clase llamada Circulo que implemente esta interfaz y
// proporcione implementaciones para los métodos abstractos.
import es.jcyl.ita.balzaga.interfaces.Calculable

class Circulo : Calculable {
    var radio: Float = 0.0F
    override fun calcularArea() {
        return Math.PI * radio * radio
    }
}