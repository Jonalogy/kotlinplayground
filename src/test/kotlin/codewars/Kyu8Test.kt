package codewars

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested

internal class Kyu8Test {
    @Nested
    inner class makeNegative {
        @Test
        fun `should return the negative given a positive input`() {
            assertEquals(Kyu8.makeNegative(1), -1)
        }

        @Test
        fun `should return not inverse if input is positive`() {
            assertEquals(Kyu8.makeNegative(-1), -1)
        }
    }

    @Nested
    inner class Century {
        @Test
        fun `should return century number by dividing by 100`() {
            assertEquals(Kyu8.century(1), 1)
            assertEquals(Kyu8.century(1000), 10)
        }

        @Test
        fun `should return the rounded up century number`() {
            assertEquals(Kyu8.century(1001), 11)
        }

        @Test
        fun `sample test cases`() {
            assertEquals(Kyu8.century(1705), 18)
            assertEquals(Kyu8.century(1900), 19)
            assertEquals(Kyu8.century(1601), 17)
            assertEquals(Kyu8.century(2000), 20)
            assertEquals(Kyu8.century(89), 1)/**/
        }
    }
}