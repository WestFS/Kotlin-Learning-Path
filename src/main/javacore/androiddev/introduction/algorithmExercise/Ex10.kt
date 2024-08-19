package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 10 - Faça um algoritmo que leia três notas obtidas por aluno, e imprima na tela a média das notas
 *
 */

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")
    print("Digite a segunda nota: ")
    val nota2 = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")
    print("Digite a terceira nota: ")
    val nota3 = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    val media = (nota1 + nota2 + nota3) / 3
    println("A média das notas é $media")

}