package es.jcyl.ita.balzaga


fun main(args: Array<String>) {
    //    3.- Crea un objeto de la clase Cliente llamado bruno
    val client1 = Cliente()
    //    4.- Rellena los datos de bruno
    client1.nombre = "Bruno José Alzaga de Vega"
    client1.direccion = "Finca Zamadueñas"
    client1.tlf = "983112233"
    client1.email = "alzvegbr@itacyl.es"
    println("Bruno: ${client1.toString()}")
    //    7.- desde el objeto indra, intenta modificar su cotización utilizando el método setCotizacion,
    //    comprueba que se ha modificado el dato
    client1.cotizacion = 9.7
    println("Bruno: ${client1.toString()}")

    //    9.- Inicializa varios objetos de tipo Cliente utilizando distintas llamadas con
    //    distintos parámetros de entrada a sus respectivos constructores,
    //    verifica que tienen los datos que has introducido en los constructores
    val sole = Cliente(
        "María Soledad Espiño Pazos",
        "Finca Zamadueñas", "983114477", "lasole@itacyl.es", 9.7
    )
    println("MSOL: ${sole.toString()}")
    sole.cotizacion = 5.0
    println("MSOL: ${sole.toString()}")
    sole.cotizacion = 5.0
    println("MSOL: ${sole.toString()}")

    //https://aula.cursosdedesarrollo.com/mod/assign/view.php?id=1483
    //    3.- Inicializa un objeto de la clase Persona llamado Paco
    val paco = Persona()
    println(paco)
    //    5.- Crea un objeto llamado reme usando el nuevo contructor <--- en el main de Clases.kt
    val reme = Persona("Reme", "Alameda de Osuna, 5")
    println(reme)

    //    8.- Inicializa un objeto de Empleado llamado ivan con los 4 datos, comprueba que sea correcto
    val ivan = Empleado("Ivan", "Paseo de la Castellana", "Jubilado", 2000.0F)
    println(ivan)

    //    11.- Dar de alta un objeto de la clase Jefe, inicializando sus valores
    val bruno = Jefe(
        "Bruno José Alzaga de Vega",
        "Paseo Zorrilla 10",
        "Programador en Jefe (todos firmes kopòn!!!)",
        115000.0F,
        "Desarrollo de Sotfware"
    )
    println(bruno)

    //    3.- Inicializa un objeto de la clase Persona llamado Paco
    val paco2 = Persona2()
    println(paco2)
    //    5.- Crea un objeto llamado reme usando el nuevo contructor <--- en el main de Clases.kt
    val reme2 = Persona2("Reme2", "Alameda de Osuna, 2")
    println(reme2)

    //    8.- Inicializa un objeto de Empleado llamado ivan con los 4 datos, comprueba que sea correcto
    val ivan2 = Empleado2("Ivan2", "Paseo de la Castellana, 2", "Jubilado2", 2222.22F)
    println(ivan2)

    //    11.- Dar de alta un objeto de la clase Jefe, inicializando sus valores
    val bruno2 = Jefe2(
        "Bruno José Alzaga de Vega2",
        "Paseo Zorrilla 2, 2º B",
        "Programador de 2ª en Jefe (todos firmes kopòn!!!)",
        22222.22F,
        "Desarrollo de Sotfware de segundas partes"
    )
    println(bruno2)

// Luego, crea dos clases llamadas Libro y Revista que implementen esta interfaz.
// El método imprimir() debe imprimir un mensaje que indique si el objeto es un libro o una revista.
    val libro = Libro()
    libro.imprimir()

    val revista = Revista()
    revista.imprimir()

    //Ejercicio 3: Múltiples interfaces
    //Crea dos interfaces llamadas Volador y Nadador con un método volar() y nadar(), respectivamente.
    // Luego, crea una clase llamada AveMarina que implemente ambas interfaces y proporcione
    // implementaciones para los métodos.
    val especie= AveMarina()
    especie.volar()
    especie.nadar()


}