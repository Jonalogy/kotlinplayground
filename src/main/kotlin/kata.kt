import kotlinx.coroutines.yield
import kotlin.math.abs

class Kata {
    // Return Negative https://www.codewars.com/kata/55685cd7ad70877c23000102
    fun makeNegative(x: Int): Int = -abs(x)

    // Century from year https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
    /* Note: If typed as int, any result will be rounded down to the nearest integer! */
    fun century(number: Int) = (number + 99) / 100

    // The PaperFold sequence https://www.codewars.com/kata/5d26721d48430e0016914faa
    fun paperFold(): Iterator<Int> {

        return sequence {
            yield(1)
        }.iterator()

        /* example
        sequence {
            yieldAll(generateSequence(1) { it + 1 })
        }.take(10).iterator()
        */
    }
}