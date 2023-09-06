package es.jcyl.ita.balzaga

import es.jcyl.ita.balzaga.interfaces.Nadador
import es.jcyl.ita.balzaga.interfaces.Volador

//Ejercicio 3: Múltiples interfaces
//Crea dos interfaces llamadas Volador y Nadador con un método volar() y nadar(), respectivamente.
// Luego, crea una clase llamada AveMarina que implemente ambas interfaces y proporcione
// implementaciones para los métodos.

class AveMarina : Volador, Nadador {
    override fun nadar() {
        println("Mira como nado")
    }

    override fun volar() {
        println("Mira como vuelo")
    }
}