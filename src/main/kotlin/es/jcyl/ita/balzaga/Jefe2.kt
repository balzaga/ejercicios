package es.jcyl.ita.balzaga

//    9. Crea una clase Jefe que herede de empleado, pero que tenga un atributo que sea nombreDepartamento
//    10.- crea un constructor que permita rellenar todos los datos de Jefe
//    11.- Dar de alta un objeto de la clase Jefe, inicializando sus valores

class Jefe2 : Empleado2 {
    var nombreDepartamento: String = ""


    constructor() : super() {
        this.nombreDepartamento = ""
    }

    constructor(
        nombre: String,
        direccion: String,
        cargo: String = "",
        sueldo: Float = 0.0F,
        nombreDepartamento: String = ""
    ) : super(nombre, direccion, cargo, sueldo) {
        this.nombreDepartamento = nombreDepartamento
    }

    override fun toString(): String {
        return """Jefe2 [
                nombre: $nombre,
                direccion: $direccion,
                cargo: $cargo,
                sueldo: $sueldo,
                nombreDepartamento: $nombreDepartamento
            ]"""
    }

}