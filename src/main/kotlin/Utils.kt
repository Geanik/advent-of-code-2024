import kotlin.io.path.Path
import kotlin.io.path.readLines

fun readInput(name: String) =
    Path("src/test/resources/$name/input.txt").readLines()

fun readTestInput(name: String) =
    Path("src/test/resources/$name/test_input.txt").readLines()
