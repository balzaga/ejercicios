package es.jcyl.ita.balzaga

fun main(args: Array<String>) {


//    1.- Crea un nuevo proyecto llamado ejercicios

//    2.- Crea un fichero Kotlin llamado Datos que sirva para resolver el resto de ejercicios

//    3.- Define las siguiente variables: un número entero, un número largo, un double
    var entero: Int = 2

    var largo: Long = 7

    var pi: Double = 3.1415927


//    4.- Presenta por pantalla los datos
    println("entero tiene el valor $entero")
    println("largo  tiene el valor $largo")
    println("pi de tipo doble  tiene el valor $pi")

//    5.- Define una viable inmutable de tipo cadena y otra mutable, imprimelas por pantalla
    val noMidificable = "cambiame si te atreves"
    println("noMidificable es $noMidificable")
    var modificable = "buenooo, vale, te dejo que me cambies pero que no sirva de precedente"
    println("modificable es $modificable")

//    6.- Cambia la variable mutable e imprimela por pantalla
    modificable = "ale, te cambié por otra"
    println("modificable ahora  es $modificable")

}