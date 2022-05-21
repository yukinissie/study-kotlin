import geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    val question = "The Question"
    val answer = 20
    println("Question: $question\nAnswer: $answer")

    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
    person.isMarried = false
    println(person.isMarried)

    println(createRandomRectangle().isSquare)
}

// def max(a, b) a > b ? a : b end
fun max(a: Int, b: Int) = if (a > b) a else b

class Person(
    val name: String,
    var isMarried: Boolean
)