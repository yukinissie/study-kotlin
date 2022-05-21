fun main(args: Array<String>) {
    val question = "The Question"
    val answer = 20
    println("Question: ${question}\nAnswer: $answer")
}

// def max(a, b) a > b ? a : b end
fun max(a: Int, b: Int) = if (a > b) a else b
