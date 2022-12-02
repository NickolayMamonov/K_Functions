import kotlin.math.roundToInt

fun First(){
    val a = readln()
    if(a.length >= 4){
        val b = a.toFloat() / 1000
        println("${b.roundToInt()}K")
    }
    else{
        println(a)
    }
}