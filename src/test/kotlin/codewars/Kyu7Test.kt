package codewars

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class Kyu7Test {
//    private val kata = Kyu7()

    @Nested
    inner class paperFold {
        @Test
        fun `should return only 1s and 0s` () {
            Kyu7.paperFold()
                .forEach { assertEquals(it == 0 || it == 1, true) }
        }

        @Test
        fun twenty() {
            val gen = Kyu7.paperFold()
            listOf(1,1,0,1,1,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1).iterator().forEach {
                assertEquals(it, gen.next())
            }
        }
    }
}