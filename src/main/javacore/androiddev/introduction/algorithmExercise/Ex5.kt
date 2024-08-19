package main.javacore.androiddev.introduction.algorithmExercise

/**
 * 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 * calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base
 * para o Salário mínimo R$ 1.293,20)
 */

fun main() {
    val salarioMinimo = 1293.20
    print("Digite o salário do usuário: R$ ")
    val salarioUsuario = readLine()?.toDoubleOrNull() ?: return println("Entrada inválida.")

    val quantidadeSalariosMinimos = salarioUsuario / salarioMinimo
    println("O usuário ganha R$ $salarioUsuario, que equivale a ${quantidadeSalariosMinimos.toFixed(2)} salários mínimos.")
}

fun Double.toFixed(i: Int): String {
    val format = "%.${i}f"
    return format.format(this)
}
