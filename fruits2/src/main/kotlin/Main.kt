fun main() {

    println("Enter number of vegetables")
    val vCount = readLine()!!.toInt()
    println("Enter number of fruits")
    val fCount = readLine()!!.toInt()

    val vegetables = mutableListOf<String>()
    val fruits = mutableListOf<String>()

    var i = 0
    while (i < vCount) {
        println("Enter vegetable name")
        val nextV = readLine()!!.lowercase()
        if (vegetables.contains(nextV)) println("Duplicate")
        else {
            vegetables.add(nextV)
            i++
        }
    }

    var j = 0
    while (j < fCount) {
        println("Enter fruit name")
        val nextF = readLine()!!.lowercase()
/*
        if (fruits.contains(nextF)) println("Duplicate")
        else if (vegetables.contains(nextF)) println("Already a vegetable")
        else {
            fruits.add(nextF)
            i++
        }
*/


        when {
            fruits.contains(nextF) -> println("Duplicate")
            vegetables.contains(nextF) -> println("Already a vegetable")
            else -> {
                fruits.add(nextF)
                j++
            }
        }

    }

    var input = ""
    while (input != "end") {
        println("Enter next object")
        input = readLine()!!.lowercase()
        when {
            vegetables.contains(input) -> println("Vegetable")
            fruits.contains(input) -> println("Fruit")
            else -> println("Neither a vegetable or a fruit")
        }
    }
}