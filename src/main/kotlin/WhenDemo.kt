fun main(){
    println(whenDemo(1))
    println(whenDemo(5))
    println(whenDemo(19))
    println(whenDemo(35))
    println(whenDemo(50))

    println(whenAsString("Sankar"))
    println(whenAsString(2))
}

/**
 * 'when' is not only the statement, It is an expression.
 */
fun whenDemo(age: Any) = when(age){
        in 1..2 -> "Babies"
        in 3..16 -> "Children"
        in 17..30 -> "Young adult"
        in 31..45 -> "Middle-aged Adult"
        else -> "Old Adults"
}

fun whenAsString(name: Any) = when(name){
    is String -> "Got String  ${name.length}"
    else -> "No value"
}