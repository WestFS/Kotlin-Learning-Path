package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores
 * em ordem decrescente
 */

fun main() {
    print("Digite o primeiro valor inteiro: ")
    val valor1 = readLine()?.toIntOrNull()
    print("Digite o segundo valor inteiro: ")
    val valor2 = readLine()?.toIntOrNull()
    print("Digite o terceiro valor inteiro: ")
    val valor3 = readLine()?.toIntOrNull()

    if (valor1 != null && valor2 != null && valor3 != null) {
        val valores = listOf(valor1, valor2, valor3).sortedDescending()
        println("Valores em ordem decrescente: ${valores.joinToString(", ")}")
    } else {
        println("Error nos input de valores")
    }
}