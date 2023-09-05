package es.jcyl.ita.balzaga

fun main(args: Array<String>) {

//1.- Define una cadena de caracteres larga (loren ipsum)
    var cadenaLarga = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae molestie urna, ut iaculis dui. Donec accumsan lorem sit amet ante porta, 
        et ultrices elit tristique. Duis vulputate suscipit ipsum. Sed porta ac est vitae consectetur. Ut commodo scelerisque vestibulum. 
        Quisque turpis lorem, consectetur ultricies tellus ut, euismod venenatis erat. 
    """

//2.- Recorre la cadena para presentar todas la letras que la conforman y decir al final el número de
// letras que contiene, verifica que es el número correcto
    var i=0
    for (ch in cadenaLarga.iterator()) {
        print(ch)
        i++
    }
    println()
    println("la longitud es $i o tambien ${cadenaLarga.length}")
    println("El calculo de la  longitud está bien  ${i== cadenaLarga.length}")


//3.- Realiza una búsqueda en la cadena para ver si contiene la palabra "ipsum" se con minúscula o mayúscula, imprime el resultado
    println("La cadena contiene 'ipsum'  ${cadenaLarga.contains("ipsum")}")
    println("La cadena contiene 'IPSUM'  ${cadenaLarga.contains("IPSUM",true)}")

//4.- Define un array de 20 posiciones, rellenalo con 0
    var arrayI= Array(20, {0})

//5.- Recorre el array y presentalo por pantalla
    for (i in arrayI.indices){
        println("el array tiene en la posicion $i el valor ${arrayI[i]}")
    }
    println()

//6.- Modifica el cuarto valor e imprimelo por pantalla
    arrayI[3] = 4
    println("el array tiene en la posicion 4 el valor ${arrayI[3]}")
}