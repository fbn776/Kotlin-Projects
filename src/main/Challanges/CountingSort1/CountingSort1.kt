
fun countingSort(arr: Array<Int>): Array<Int> {
    val e: Array<Int?> = arrayOfNulls(100)
    val indexArr = e as Array<Int>
    for(i in 0..99) {
        indexArr[i] = 0
    }

    for(j in arr) {
        indexArr[j] += 1
    }

    return indexArr
}

fun main() {
    var arr = arrayOf(99,55,32,32,1,23,4,22,2,3,2,0,2,2,4,2,1,3,3,5,6,7,8,9,3,4,3,6,5,8)
    println(countingSort(arr).toList())

}