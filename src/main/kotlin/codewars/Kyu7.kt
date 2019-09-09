package codewars

import codewars.attempts.PaperFoldAttempt

class Kyu7 {
    companion object {
        // The PaperFold sequence https://www.codewars.com/kata/5d26721d48430e0016914faa
        fun paperfold() = PaperFoldAttempt.Three()

        //  Even numbers in an list https://www.codewars.com/kata/even-numbers-in-an-array/train/kotlin
        fun evenNumbers(someNumbers: List<Int>, limit: Int): List<Int> {

            // Attempt 1
            return someNumbers.filter { it % 2 == 0 }.takeLast(limit)

            // Attempt 2
            /*var collector: MutableList<Int> = mutableListOf()
            val foo = someNumbers.listIterator(someNumbers.size)
            while(collector.size < limit && foo.hasPrevious()) {
                val i = foo.previous()
                if( i % 2 == 0) { collector.add(i) }
            }
            return collector.reversed().toList()*/


            // Attempt 3. Sequence.filter.any
        }
    }
}

