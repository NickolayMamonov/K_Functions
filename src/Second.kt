fun Second(){
    val a = readln().toInt()
    if(a > 0){
        when(a){
            1 -> println("${a} год")
            in 2..4 -> println("${a} года")
            else -> println("${a} лет")
        }
    }
}