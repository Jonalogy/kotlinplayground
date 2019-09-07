package codewars.attempts

class PaperFoldAttempt {

    class One {
        private var prev = listOf(1)
        private var count = 0

        private fun flip(prev: List<Int>): List<Int> {
            return prev.reversed().map { if (it == 1) 0 else 1 }
        }

        fun next(): Int {
            val lastVal = prev[count]
            count = count + 1
            prev = prev.plus(listOf(1).plus(flip(prev)))
            return lastVal
        }
    }

    class Two {
        private var prev = mutableListOf<Int>(1)
        private var count = 0

        private fun flip(prev: List<Int>): Sequence<Int> {
            return prev.reversed().asSequence().map { if (it == 1) 0 else 1 }
        }

        fun next(): Int {
            val lastVal = prev[count]
            count = count + 1
            prev.addAll(sequenceOf(1).plus(flip(prev)).toMutableList())
            return lastVal
        }
    }

    companion object {
        fun one() = One()
        fun two() = Two()
        fun Three(): Iterator<Int> = sequence {
            yieldAll(generateSequence(1) { it + 1 })
        }.iterator()
    }
}