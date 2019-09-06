package codewars

class Kyu7 {
    companion object {
        // The PaperFold sequence https://www.codewars.com/kata/5d26721d48430e0016914faa
        fun paperFold(): Iterator<Int> = sequence {
            yieldAll(generateSequence(1) { println(it); it + 1 })
        }.iterator()
    }
}