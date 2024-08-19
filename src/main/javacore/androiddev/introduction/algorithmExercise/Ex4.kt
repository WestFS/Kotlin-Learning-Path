package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o
 * seu sucessor.
 *
 */

fun main() {
    print("Me fale um número: ")
    var input = readLine()?.toIntOrNull()

    if (input != null) {
        val antecessor = input - 1
        val sucessor = input + 1
        println("O numero sucessor de $input é $sucessor e o antecessor $antecessor")
    } else {
        println("Error de Input. Por favor, digite um número inteiro.")
    }
}