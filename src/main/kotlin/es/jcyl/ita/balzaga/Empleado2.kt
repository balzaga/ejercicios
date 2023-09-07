package es.jcyl.ita.balzaga

//    6.- Crea una clase llamada Empleado que herede de Persona, el empleado tendrá un cargo y un sueldo
//    7.- Crea un constructor para Empleado que permita inicializar todos los datos de Empleado (incluidos los de Persona)
//    8.- Inicializa un objeto de Empleado llamado ivan con los 4 datos, comprueba que sea correcto

open class Empleado2 : Persona2 {
    var cargo:String=""
    var sueldo:Float=0.0F

    constructor() : super("",""){
        this.cargo=""
        this.sueldo=0.0F
    }
    constructor(nombre:String,direccion:String, cargo:String="", sueldo:Float=0.0F) : super(nombre,direccion){
        this.cargo=cargo
        this.sueldo=sueldo
    }

    override fun toString(): String {
        return """Empleado2 [
                nombre: $nombre,
                direccion: $direccion,
                cargo: $cargo,
                sueldo: $sueldo                
            ]"""
    }

}