import kotlin.math.abs

class Day01 {
    fun part1(input: List<String>): Long {
        val (list1Sorted, list2Sorted) = transformToLists(input).let { (list1, list2) ->
            list1.sorted() to list2.sorted()
        }

        return list1Sorted.mapIndexed { index, number1 ->
            val number2 = list2Sorted[index]
            abs(number1 - number2)
        }.sum()
    }

    fun part2(input: List<String>): Long {
        val (list1, list2) = transformToLists(input)
        val list2Counts = list2.groupingBy { it }.eachCount()

        return list1.sumOf { number ->
            number * (list2Counts[number] ?: 0)
        }
    }

    private fun transformToLists(input: List<String>): Pair<List<Long>, List<Long>> =
        input.map { line ->
            val numbers = line.split("\\s+".toRegex()).map { it.toLong() }
            numbers.first() to numbers.last()
        }.unzip()
}