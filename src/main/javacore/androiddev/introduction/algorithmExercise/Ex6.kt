package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
 */

fun main() {
    print("Digite um valor: R$ ")
    val valor = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    val reajuste = valor * 1.05
    println("O valor com reajuste de 5% é R$ $reajuste")

}
