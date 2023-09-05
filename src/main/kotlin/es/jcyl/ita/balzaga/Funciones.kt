package es.jcyl.ita.balzaga


/**1.- Crea un nuevo fichero llamado Funciones
 * donde se resolverán el resto de ejercicios*/

/**2.- Crea una función llamada cuenta que sea
 *  capaz de imprimir por pantalla la suma de dos números*/

fun cuenta (x:Int, y:Int):Unit = println("la suma de $x y $y es ${x+y}")

/** 3.- Crea una función llamada divide que sea capaz de
 * dividir dos números y devolver el resultado,
 * comprueba con dos variables que funciona correctamente */
fun divide(numerador:Int, denominador:Int): Float {
    if (denominador==0){
        println("ERROR: división por 0!!!!!")
        return -1F;
    }
    return numerador.toFloat() / denominador.toFloat()
}

/** 4.- Haz que los dos argumentos de la función divide sean opcionales,
 *  comprueba que se puede llamar a la función con todas las
 *  posibles combinaciones de parámetros de entrada */
fun divide2(numerador: Int? =0, denominador:Int?=1): Float {
    if (denominador==0){
        println("ERROR: división por 0!!!!!")
        return -1F;
    }
    println()
    return (numerador ?: 0).toFloat() / (denominador?:1).toFloat()
}


fun main(args : Array<String>) {
    println(" 4 entre 2 es ${divide2(4,2)}")
    println(" 8 entre 3 es ${divide2(4,2)}")
    println(" divide2(4) es ${divide2(4)}")
    println(" divide2(null,4) es ${divide2(null,2)}")
    println(" divide2(null,null) es ${divide2(null,null)}")
    println(" divide2(null,0) es ${divide2(null,null)}")
    println(" divide2(8,0) es ${divide2(8,0)}")
}

