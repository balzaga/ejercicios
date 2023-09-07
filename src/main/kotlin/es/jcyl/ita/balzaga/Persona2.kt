package es.jcyl.ita.balzaga

//    1.- Sobre el proyecto anterior realizar el resto de ejercicios
//    2.- Declara una clase Persona que tenga los siguientes atributos de instancia: nombre, dirección

open class Persona2 {
    var nombre: String = ""
    var direccion: String = ""

    //    4.- Crea un constructor que permita inicializar todos los atributos de Persona
    constructor() {
        this.nombre = ""
        this.direccion = ""
    }

    constructor(nombre: String = "", direccion: String = "") {
        this.nombre = nombre
        this.direccion = direccion
    }

    override fun toString(): String {
        return """Persona2 [
                nombre: $nombre,
                direccion: $direccion          
            ]"""
    }

}