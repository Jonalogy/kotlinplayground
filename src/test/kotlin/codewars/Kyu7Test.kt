package codewars

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class Kyu7Test {
//    private val kata = Kyu7()

    @Nested
    inner class paperFold {
        @Test
        fun twenty() {
            val gen = Kyu7.paperfold()
            listOf(1,1,0,1,1,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1).iterator().forEach {
                assertEquals(it, gen.next())
            }
        }

        @Test
        fun foo() {
            val gen = Kyu7.paperfold()
            gen.asSequence().take(1000000).toList()
        }
    }
}