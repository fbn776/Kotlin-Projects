import kotlin.math.sqrt

fun main() {
    try{
        println("Prints primes numbers between 1 and n")
        print("Enter n: ")
        val n: Int = readln().toInt()
        if(n <= 0)
            throw Exception("num <= 0")

        val primes = arrayListOf<Int>()

        for(i in 2..n) {
            var isPrime = true
            val root: Int = sqrt(i.toDouble()).toInt()
            for(j in 2..root) {
                if(i % j == 0) {
                    isPrime = false
                    break
                }
            }
            //If it's a prime number add to the `primes` list
            if(isPrime) {
                primes.add(i)
            }

        }

        if(primes.size > 0) {
            println("Primes are: $primes")
            println("There are ${primes.size} between 1 and $n")
        } else
            println("No primes")

    }catch(e: NumberFormatException) {
        println("The number should be of the Integer type")
    } catch (_: Exception) {
        println("The number should be greater than 0")
    }
}