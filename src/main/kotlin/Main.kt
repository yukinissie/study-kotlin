fun main(args: Array<String>) {
    println("Hello World!")
    println(max(10, 100))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

// def max(a, b) a > b ? a : b end
fun max(a: Int, b: Int) = if (a > b) a else b
