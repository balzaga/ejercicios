package es.jcyl.ita.balzaga

//    6.- Crea una clase llamada Empleado que herede de Persona, el empleado tendrá un cargo y un sueldo
//    7.- Crea un constructor para Empleado que permita inicializar todos los datos de Empleado (incluidos los de Persona)
//    8.- Inicializa un objeto de Empleado llamado ivan con los 4 datos, comprueba que sea correcto
//    9. Crea una clase Jefe que herede de empleado, pero que tenga un atributo que sea nombreDepartamento
//    10.- crea un constructor que permita rellenar todos los datos de Jefe
//    11.- Dar de alta un objeto de la clase Jefe, inicializando sus valores
open class Empleado( nombre: String = "",  direccion: String = "", var cargo:String="", var sueldo:Float=0.0F) : Persona(nombre, direccion) {
    override fun toString(): String {
        return """Empleado [
                nombre: $nombre,
                direccion: $direccion,
                cargo: $cargo,
                sueldo: $sueldo                
            ]"""
    }
}