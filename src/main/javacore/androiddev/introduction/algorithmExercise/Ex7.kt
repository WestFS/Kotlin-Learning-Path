package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são
 * VERDADEIRO ou FALSO.
 */

fun main() {
    print("Digite um valor booleano (true/false): ")
    val valor1 = readLine()?.toBooleanStrictOrNull()
    print("Digite o segundo valor booleano (true/false): ")
    val valor2 = readLine()?.toBooleanStrictOrNull()

    if(valor1 != null && valor2 != null) {
        if (valor1 && valor2) {
            println("Ambos são VERDADEIROS.")
        } else if (!valor1 && !valor2) {
            println("Ambos são FALSOS.")
        } else {
            println("Um é VERDADEIRO e o outro é FALSO.")
        }
    } else {
        println("Erro no input de booleanos")
    }
}