package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é
 * par ou ímpar, positivo ou negativo.
 *
 */

fun main() {
    print("Me fale um número: ")
    val input = readLine()?.toIntOrNull()

    if(input != null) {
        if(input > 0 ) {
            println("O número que você passou é positivo $input")
        } else {
            println("O número que você passou é negativo $input")
        }
        if(input %2 == 0) {
            println("O número que você passou é par.")
        } else {
            println("O número que você passou é impar.")
        }
    } else {
        println("Error de Input. Por favor, digite um número inteiro.")
    }
}