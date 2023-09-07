package es.jcyl.ita.balzaga.ejercicios.colecciones

import es.jcyl.ita.balzaga.Cliente

//1.- Crea un fichero Colecciones que sirva para resolver el resto de ejercicios

fun main() {
    //2.- Define las siguiente variables: una lista de números del 1 al 50,
    var numbers: MutableList<Int> = mutableListOf<Int>()
    for (numero in 1..50) {
        numbers.add(numero)
    }
    println("Lista de los 50 primeros enteros")
    for (num in numbers) {
        print("$num ")
    }
    println()
    //4. Añade tres elementos nuevos a la lista al final y un nuevo campo al mapa: facturacion total
    numbers.add(51)
    numbers.add(52)
    numbers.add(53)
    println("Lista de los 53 primeros enteros")
    for (num in numbers) {
        print("$num ")
    }
    println()

    // un mapa con los datos de un cliente: nombre, dirección, tlf, email
    val bruno = Cliente("Bruno", "Finca Zamadueñas", "983114477", "balzaga@gmail.com", 9.0)
    val msol = Cliente("Msol", "Finca Zamadueñas", "983114478", "sole@gmail.com", 8.0)
    val clientesMutableMap: MutableMap<String, Cliente> = mutableMapOf(
        "Bruno" to bruno, "msol" to
                msol
    )
    println("Contenido del Mapa de clientes:")
    clientesMutableMap.forEach { entry ->
        println("${entry.key} : ${entry.value}")
    }
    println()
    //4. Añade tres elementos nuevos a la lista al final y un nuevo campo al mapa: facturacion total
    clientesMutableMap.put("Facturacion total",Cliente("Facturacion total", "", "", "", 0.0,35000.0))
    println("Contenido del Mapa de clientes con resumen de facturacion:")
    clientesMutableMap.forEach { entry ->
        println("${entry.key} : ${entry.value}")
    }
    println()
    // y un conjunto de números
    val numsMutableSet: MutableSet<Int> =
        mutableSetOf(1, 2, 3, 5, 7)
    println("Conjunto de números")
    for (num in numsMutableSet) {
        print("$num ")
    }
    println()
    numsMutableSet.add(11)
    numsMutableSet.add(13)
    //3.- Recorre las tres variables y vete presentando los datos por pantalla
    //4. Añade tres elementos nuevos a la lista al final y un nuevo campo al mapa: facturacion total
    //5. Vuelve a recorrer el listado y el mapa para ver si están o no los datos introducidos
    println("Conjunto de números")
    for (num in numsMutableSet) {
        print("$num ")
    }
    println()


    //6. Rellena una lista cogiendo los datos de otra lista pero modificando su valor sumandole a cada valor 15
    val numerosMutableList: MutableList<Int> =
        mutableListOf<Int>()
    for (num in numsMutableSet) {
        numerosMutableList.add(num+15)
    }
    println("La lista de números primos + 15 es")
    for (num in numerosMutableList) {
        print("$num ")
    }
    println()
}