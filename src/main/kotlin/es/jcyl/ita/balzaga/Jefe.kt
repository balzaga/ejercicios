package es.jcyl.ita.balzaga

//    9. Crea una clase Jefe que herede de empleado, pero que tenga un atributo que sea nombreDepartamento
//    10.- crea un constructor que permita rellenar todos los datos de Jefe
//    11.- Dar de alta un objeto de la clase Jefe, inicializando sus valores

class Jefe(nombre: String = "",  direccion: String = "",  cargo:String="", sueldo:Float=0.0F,var nombreDepartamento: String ="") :Empleado(nombre,  direccion,  cargo, sueldo){

    override fun toString(): String {
        return """Jefe [
                nombre: $nombre,
                direccion: $direccion,
                cargo: $cargo,
                sueldo: $sueldo,
                nombreDepartamento: $nombreDepartamento
            ]"""
    }

}