package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
 * iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de
 * qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor
 * na tela.
 *
 */

fun main() {
    print("Me fale um número para var A: ")
    val inputA = readLine()?.toIntOrNull()

    print("Me fale um número para var B: ")
    val inputB = readLine()?.toIntOrNull()

    if (inputA != null && inputB != null) {
        if (inputA == inputB) {
            var sumC = inputA + inputB
            println("Como A e B são iguais sendo eles $inputA e $inputB = $sumC")
        } else if (inputB != inputA) {
            var sumC = inputB * inputA
            println("Como A e B são diferentes sendo eles $inputA e $inputB  a multiplicação entre eles é = $sumC")
        }
    } else {
        println("Error de Input. Por favor, digite um número inteiro.")
    }
}