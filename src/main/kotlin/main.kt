import codewars.Kyu7
//import codewars.paperfold

fun main() {
    println("TADA")

    val gen = Kyu7.paperfold()
    for (i in 1..20) {
        println(gen.next())
    }
}