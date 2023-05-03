//Implementation
fun lonelyInteger(a: Array<Int>): Int {
    var unique: Int = -1
    //Contains items that are already checked for.
    val flags = arrayListOf<Int>()
    for(i in 0..(a.size-1)) {
        var isUnique: Boolean = true
        //If its the last element, then thats the unique number
        if(i == (a.size-1)){
            unique = a[i]
            break
        }
        //If the item is alerady checked for, then skip it.
        if(a[i] in flags) {
            continue
        }
        for(j in (i+1)..(a.size-1)) {
            if(a[i] == a[j]) {
                isUnique = false
                flags.add(a[i])
                break
            }
        }
        if(isUnique) {
            unique = a[i]
            break
        }
    }
    return unique
}

fun main() {
    val a = arrayOf<Int>(1,2,3,3,4,2,1)
    val unique = lonelyInteger(a)
    println("Array: ${a.toList()}")
    println("Unique element: $unique")
}