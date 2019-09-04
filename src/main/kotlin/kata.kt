import kotlin.math.abs
import kotlin.math.ceil

class Kata {
    fun makeNegative(x: Int): Int = -abs(x)

    // Note: If typed as int, any result will be rounded down to the nearest integer!
    fun century(number: Int) = (number + 99)/100
}