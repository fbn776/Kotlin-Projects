fun diagonalDifference(arr: Array<Array<Int>>): Int {
    //Gets the primary diagonal and returns it as Array of Int
    fun getPrimaryDiagonals(arr: Array<Array<Int>>): Array<Int?> {
        val n = arr.size
        val elms = arrayOfNulls<Int>(n)
        for (i in 0 until n) {
            elms[i] = arr[i][i]
        }
        return elms
    }
    //Gets the secondary diagonal and returns it as an array of Int
    fun getSecondaryDiagonals(arr: Array<Array<Int>>): Array<Int?> {
        val n = arr.size
        val elms = arrayOfNulls<Int>(n)
        for (i in 0 until n) {
            elms[i] = arr[i][n - i - 1]
        }
        return elms
    }

    fun sumOf(a: Array<Int?>): Int {
        var sum = 0
        a.forEach { v: Int? ->
            sum += v!!
        }
        return sum
    }

    val primarySum = sumOf(getPrimaryDiagonals(arr))
    val secondarySum = sumOf(getSecondaryDiagonals(arr))

    return Math.abs(primarySum - secondarySum)
}

fun main() {
    val arr = arrayOf(
        arrayOf(3, 12, 53),
        arrayOf(5, 23, 13),
        arrayOf(21, 2, 23),
    )
    println(diagonalDifference(arr))
}