package es.jcyl.ita.balzaga

import es.jcyl.ita.balzaga.interfaces.Imprimible

// Luego, crea dos clases llamadas Libro y Revista que implementen esta interfaz.
// El método imprimir() debe imprimir un mensaje que indique si el objeto es un libro o una revista.
class Revista : Imprimible {
    override fun imprimir() {
        println("Soy una revista")
    }
}