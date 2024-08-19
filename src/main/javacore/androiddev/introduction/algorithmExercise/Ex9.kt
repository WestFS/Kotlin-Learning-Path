package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o
 * seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
 * Fórmula do IMC = peso / (altura) ²
 * Tabela Condições IMC
 * Abaixo de 18,5 | Abaixo do peso
 * Entre 18,6 e 24,9 | Peso ideal (parabéns)
 * Entre 25,0 e 29,9 | Levemente acima do peso
 * Entre 30,0 e 34,9 | Obesidade grau I
 * Entre 35,0 e 39,9 | Obesidade grau II (severa)
 * Maior ou igual a 40 | Obesidade grau III (mórbida)
 */

fun main() {
    print("Digite seu peso (em kg): ")
    val peso = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")
    print("Digite sua altura (em metros): ")
    val altura = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    val imc = peso / (altura * altura)
    val condicao = when {
        imc < 18.5 -> "Abaixo do peso"
        imc in 18.5..24.9 -> "Peso ideal (parabéns)"
        imc in 25.0..29.9 -> "Levemente acima do peso"
        imc in 30.0..34.9 -> "Obesidade grau I"
        imc in 35.0..39.9 -> "Obesidade grau II (severa)"
        else -> "Obesidade grau III (mórbida)"
    }
    println("Seu IMC é $imc Condição: $condicao")
}
