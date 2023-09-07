package es.jcyl.ita.balzaga

//    1.- Sobre el proyecto anterior realizar el resto de ejercicios
//    2.- Declara una clase Persona que tenga los siguientes atributos de instancia: nombre, dirección

open class Persona(var nombre: String = "", var direccion: String = "") {

    //    3.- Inicializa un objeto de la clase Persona llamado Paco  <--- en el main de Clases.kt
//    4.- Crea un constructor que permita inicializar todos los atributos de Persona

//    5.- Crea un objeto llamado reme usando el nuevo contructor <--- en el main de Clases.kt

//    6.- Crea una clase llamada Empleado que herede de Persona, el empleado tendrá un cargo y un sueldo

//    7.- Crea un constructor para Empleado que permita inicializar todos los datos de Empleado (incluidos los de Persona)

//    8.- Inicializa un objeto de Empleado llamado ivan con los 4 datos, comprueba que sea correcto

    override fun toString(): String {
        return """Persona [
                nombre: $nombre,
                direccion: $direccion          
            ]"""
    }

}