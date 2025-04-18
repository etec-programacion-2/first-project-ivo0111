/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    val mensaje: String = "Mi edad es: "
    var numero = 16
    println("$mensaje")
    println("${numero + 1}")
    if (numero === 16) {println("Soy menor de edad")}
    when (numero) {
        in 0..12 -> println("Niño")
        in 13..17 -> println("Adolescente")
        in 18..64 -> println("Adulto")
        else -> println("Adulto mayor")
    }
    println("\nCuenta...")
    for (i in 1..10) {
        println("$i")
    }
    println("\nNumeros multiplos de 10 hasta el 100...")
    for (i in 0..100 step 10) {
        println("$i")
    }
    println("\n\nContador con while...")
    var contador = 0
    while (contador <= 10) {
        println("$contador")
        contador++
    }
    val numeros = arrayOf(3,7,8,41,1)
    val frutas = listOf("Manzana", "Banan", "Naranja")
}
/*fun main() {                
    
    // 5. Arrays y Listas
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val frutas = listOf("Manzana", "Banana", "Naranja")
    
    println("\nElementos del array:")
    for (num in numeros) {
        print("$num ")
    }
    
    println("\n\nFrutas:")
    frutas.forEach { fruta -> println(fruta) }
    
    // 6. Funciones básicas
    fun saludar(nombre: String): String {
        return "¡Hola, $nombre!"
    }
    
    // Función de una sola línea
    fun sumar(a: Int, b: Int) = a + b
    
    println("\n${saludar("Mundo")}")
    println("2 + 3 = ${sumar(2, 3)}")
    
    // 7. Null Safety
    var nombreNulo: String? = null
    println("\nLongitud del nombre: ${nombreNulo?.length ?: "Nombre es nulo"}")
    
    // 8. Clases básicas
    data class Persona(val nombre: String, val edad: Int)
    val persona = Persona("Juan", 30)
    println("\nPersona: $persona")
}*/