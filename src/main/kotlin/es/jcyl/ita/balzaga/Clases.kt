package es.jcyl.ita.balzaga

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
    private var cotizacion: Double = 0.0

    //    10.- Declara una propiedad nueva en la clase llamada total cotizaciones
    private var totalCotizaciones: Double = 0.0

    //    8.- Modifica el constructor de la clase Cliente para que se le puedan pasar los
    //    parámetros todos los datos que pueda almacenar la clase, de manera opcional
    constructor(
        nombre: String = "",
        direccion: String = "",
        tlf: String = "",
        email: String = "",
        cotizacion: Double = 0.0
    ) {
        this.nombre = nombre
        this.direccion = direccion
        this.tlf = tlf
        this.email = email
        this.cotizacion = cotizacion
        this.totalCotizaciones += cotizacion
    }


    //    6.- Crea un nuevo método que permita modificar la cotización de un Cliente
    //    llamado setCotizacion, y el dato que quieras guardar
    fun setCotizacion(cotizacion: Double): Unit {
        this.cotizacion = cotizacion
        //    11. Cada vez que se modifique una cotización se deberá incrementar el valor
        //    del total de cotizaciones
        this.totalCotizaciones += cotizacion
    }

    fun getCotizacion(): Double {
        return this.cotizacion
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

fun main(args: Array<String>) {
    //    3.- Crea un objeto de la clase Cliente llamado bruno
    val bruno = Cliente()
    //    4.- Rellena los datos de bruno
    bruno.nombre = "Bruno José Alzaga de Vega"
    bruno.direccion = "Finca Zamadueñas"
    bruno.tlf = "983112233"
    bruno.email = "alzvegbr@itacyl.es"
    println("Bruno: ${bruno.toString()}")
    //    7.- desde el objeto indra, intenta modificar su cotización utilizando el método setCotizacion,
    //    comprueba que se ha modificado el dato
    bruno.setCotizacion(9.7)
    println("Bruno: ${bruno.toString()}")

    //    9.- Inicializa varios objetos de tipo Cliente utilizando distintas llamadas con
    //    distintos parámetros de entrada a sus respectivos constructores,
    //    verifica que tienen los datos que has introducido en los constructores
    val sole = Cliente(
        "María Soledad Espiño Pazos",
        "Finca Zamadueñas", "983114477", "lasole@itacyl.es", 9.7
    )
    println("MSOL: ${sole.toString()}")
    sole.setCotizacion(5.0)
    println("MSOL: ${sole.toString()}")
    sole.setCotizacion(5.0)
    println("MSOL: ${sole.toString()}")

}