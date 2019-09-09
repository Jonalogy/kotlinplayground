package codewars

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class Kyu7Test {

    @Nested
    inner class evenNumbers {
        @Test
        fun basicTests() {
            assertEquals(
                listOf(4, 6, 8),
                Kyu7.evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3)
            )
            assertEquals(
                listOf(-8, 26),
                Kyu7.evenNumbers(listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26), 2)
            )
            assertEquals(
                listOf(6),
                Kyu7.evenNumbers(listOf(6, -25, 3, 7, 5, 5, 7, -3, 23), 1)
            )
        }
    }

    @Disabled
    @Nested
    inner class paperFold {
        @Test
        fun twenty() {
            val gen = Kyu7.paperfold()
            listOf(1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1).iterator().forEach {
                assertEquals(it, gen.next())
            }
        }

        @Test
        fun `Matching the first first 1,000,000 numbers`() {
            val gen = Kyu7.paperfold()
            gen.asSequence().take(1000000).toList()
        }
    }
}