package main.javacore.androiddev.introduction.challenger.beginner.challengerThree

import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner


fun readerTxt() { // Provavelmente vai ter que colocar outro caminho de arquivo txt
    val fileTxt = File("src/main/javacore/androiddev/introduction/challenger/beginner/challengerThree/MiscellaneousProduct.txt")

    try {
        Scanner(fileTxt).use { scanTxt ->
            var product: String? = null
            var quantity: Float? = null
            var quantityUnit: String? = null
            var carbonEmission: Float? = null
            var totalCarbon: Float = 0.0f
            var quantity1:Float? = null

            while (scanTxt.hasNext()) {
                val lineTxt = scanTxt.nextLine()

                when {
                    lineTxt.startsWith("Product:") -> {

                        product = lineTxt.substringAfter("Product:").trim()
                        carbonEmission = when (product) { // Valor de emissao dos produtos
                            "Arroz" -> 2.0f
                            "Feijão" -> 1.75f
                            else -> 0.3f
                        }
                    }
                    lineTxt.startsWith("Quantity:") -> {
                       val quantityString = lineTxt.substringAfter("Quantity:").trim()

                        if(quantityString.endsWith("g")) {
                            quantityUnit = "g"
                            quantity = quantityString.removeSuffix("g").trim().toFloatOrNull()
                                quantity1 = quantity
                                quantity = quantity?.div(1000)
                        }else if(quantityString.endsWith("kg")) {
                            quantityUnit = "kg"
                            quantity = quantityString.removeSuffix("kg").trim().toFloatOrNull()
                        } else {
                            println("Error with unity quantity")
                            quantity = quantityString.toFloatOrNull()
                        }
                    }
                }

                if (product != null && quantity != null && quantityUnit != null && carbonEmission != null) {
                    val totalCarbonForProduct = carbonEmission * quantity
                    totalCarbon += totalCarbonForProduct

                    println("Product: $product")
                    println("Quantity: $quantity1$quantityUnit")
                    println("Carbon Emission: $totalCarbonForProduct kg CO₂")
                    println("------")

                    quantity = null

                }
            }
            println("Total Carbon Emission: $totalCarbon kg CO₂")
        }
    } catch (e: FileNotFoundException) {
        println("Error: File not found, path error")
    } catch (e: Exception) {
        println("An unexpected error occurred: ${e.message}")
    }
}

fun main() {
    readerTxt()
}