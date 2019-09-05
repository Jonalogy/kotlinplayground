import jdk.nashorn.internal.ir.annotations.Ignore
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*

class KataTest {
    private val kata = Kata()

    @Disabled
    @Nested
    inner class makeNegative {
        @Test
        fun `should return the negative given a positive input`() {
            assertEquals(kata.makeNegative(1), -1)
        }

        @Test
        fun `should return not inverse if input is positive`() {
            assertEquals(kata.makeNegative(-1), -1)
        }
    }

    @Disabled
    @Nested
    inner class Century {
        @Test
        fun `should return century number by dividing by 100`() {
            assertEquals(kata.century(1), 1)
            assertEquals(kata.century(1000), 10)
        }

        @Test
        fun `should return the rounded up century number`() {
            assertEquals(kata.century(1001), 11)
        }

        @Test
        fun `sample test cases`() {
            assertEquals(kata.century(1705), 18)
            assertEquals(kata.century(1900), 19)
            assertEquals(kata.century(1601), 17)
            assertEquals(kata.century(2000), 20)
            assertEquals(kata.century(89), 1)
        }
    }

    @Nested
    inner class paperFold {
        @Test
        fun `should return only 1s and 0s` () {
            kata.paperFold()
                .forEach { assertEquals(it == 0 || it == 1, true) }
        }

        @Disabled
        @Test
        fun twenty() {
            val gen = kata.paperFold()
            listOf(1,1,0,1,1,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1).iterator().forEach {
                assertEquals(it, gen.next())
            }
        }
    }
}