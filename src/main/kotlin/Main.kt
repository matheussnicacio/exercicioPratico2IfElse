fun main() {

//    2 - Faça um algoritmo para receber um número qualquer
//            e imprimir na tela se o número é par ou ímpar,
//    positivo ou negativo.


    println("Escreva um número qualquer")
    val number = readln().toFloat()

    if (number > 0) {
        println("Numero $number é Positivo")
    } else {
        println("Numero $number é Negativo")
    }


    if (number % 2.0 == 0.0) {
        println("Numero $number é Par")
    } else {
        println("Numero $number é Impar")
    }


}