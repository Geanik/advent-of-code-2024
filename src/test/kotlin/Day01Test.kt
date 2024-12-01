import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day01Test {

    private val day01 = Day01()

    @Test
    fun part1Test() {
        val input = readTestInput("day01")
        val result = day01.part1(input)

        assertEquals(11, result)
    }

    @Test
    fun part1() {
        val input = readInput("day01")
        day01.part1(input).also { result ->
            println(result)
        }
    }

    @Test
    fun part2Test() {
        val input = readTestInput("day01")
        val result = day01.part2(input)

        assertEquals(31, result)
    }

    @Test
    fun part2() {
        val input = readInput("day01")
        day01.part2(input).also { result ->
            println(result)
        }
    }
}