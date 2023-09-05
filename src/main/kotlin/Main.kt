fun main(/*args: Array<String>*/) {


    //Define las siguiente variables: un número entero, un número largo, un double
    val entero: Int = 7
    var largo: Long = 5
    val doble: Double = 3.5
    //4.- Presenta por pantalla los datos
    println("entero: $entero")
    println("largo: $largo")
    println("doble: $doble")

    //5.- Define una viable inmutable de tipo cadena y otra mutable, imprimelas por pantalla
    val noModificable = "ni se te ocurra cambiarme el valor"
    println("noModificable: $noModificable")

    var modificable = "venga va, si quieres cambiarme el valor te dejo, pero que no sirva de precedente"
    println("modificable: $modificable")
    modificable = "pos ya estas cambiada"
    println("modificable: $modificable")

}