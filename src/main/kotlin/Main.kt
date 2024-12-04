fun main() {
    val input = """xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"""
    
    println("Total: ${calculateTotal(input)}")
}

fun calculateTotal(input: String): Int {
    val pattern = """mul\((\d{1,3}),(\d{1,3})\)""".toRegex()
    
    return pattern.findAll(input)
        .map { matchResult ->
            val (num1, num2) = matchResult.destructured
            num1.toInt() * num2.toInt()
        }
        .sum()
}