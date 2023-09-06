package es.jcyl.ita.balzaga
//  https://aula.cursosdedesarrollo.com/mod/assign/view.php?id=1483
//    1.- Crea un nuevo fichero con el nombre Clases

//  2.- Define una clase Cliente que tenga los siguientes atributos: nombre, direccion, tlf, email
class Cliente {

    var nombre: String = ""
        get() = field
        set(value) {
            field = value
        }
    var direccion: String = ""
        get() = field
        set(value) {
            field = value
        }

    var tlf: String = ""
        get() = field
        set(value) {
            field = value
        }


    var email: String = ""
        get() = field
        set(value) {
            field = value
        }

    //    5.- Introduce un nuevo dato dentro de la clase Cliente, llamado cotizacion
    var cotizacion: Double = 0.0
        get() = field
        set(value) {
            field = value
            //    11. Cada vez que se modifique una cotización se deberá incrementar el valor
            //    del total de cotizaciones
            this.totalCotizaciones += value

        }

    //    10.- Declara una propiedad nueva en la clase llamada total cotizaciones
    var totalCotizaciones: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    //    8.- Modifica el constructor de la clase Cliente para que se le puedan pasar los
    //    parámetros todos los datos que pueda almacenar la clase, de manera opcional
    constructor(
         nombre: String = "",
         direccion: String = "",
         tlf: String = "",
         email: String = "",
         cotizacion: Double = 0.0) {
        this.nombre = nombre
        this.direccion = direccion
        this.tlf = tlf
        this.email = email
        this.cotizacion = cotizacion
        this.totalCotizaciones += cotizacion
    }


    //    6.- Crea un nuevo método que permita modificar la cotización de un Cliente
    //    llamado setCotizacion, y el dato que quieras guardar
//    fun setCotizacion(cotizacion: Double): Unit {
 //   }

/*
    override fun toString(): String {
        return "Cliente(nombre='$nombre', direccion='$direccion', tlf='$tlf', email='$email', cotizacion=$cotizacion, totalCotizaciones=$totalCotizaciones)"
    }
*/

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cliente

        if (nombre != other.nombre) return false
        if (direccion != other.direccion) return false
        if (tlf != other.tlf) return false
        if (email != other.email) return false
        if (cotizacion != other.cotizacion) return false
        if (totalCotizaciones != other.totalCotizaciones) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + direccion.hashCode()
        result = 31 * result + tlf.hashCode()
        result = 31 * result + email.hashCode()
        result = 31 * result + cotizacion.hashCode()
        result = 31 * result + totalCotizaciones.hashCode()
        return result
    }

        override fun toString(): String {
            return """
                    Cliente [
                        nombre: ${this.nombre}
                        direccion: ${this.direccion}
                        teléfono : ${this.tlf}
                        email : ${this.email}
                        cotización : ${this.cotizacion}
                        total cotizacionesn : ${this.totalCotizaciones}
                    ]
                """.trimIndent()
        }

}
