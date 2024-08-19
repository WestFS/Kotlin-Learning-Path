package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
 *     entre A e B e mostre se a soma é menor que C
 */

fun main() {
    val numA = 10
    val numB = 60
    val numC = 50

    val sumAB = numA + numB
    if (sumAB < numC) {
        println("A soma entre A + B ($sumAB) é menor que C $numC")
    } else {
        println("A soma de A + B é $sumAB que é maior que $numC")
    }

}