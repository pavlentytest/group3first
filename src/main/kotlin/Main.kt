import java.util.*

fun sum(a: Int, b: Int) = a+b



fun main() {

    println(sum(100,200))
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    val numbers = 1..10 // range [1,10]

    val arr = arrayOf(1,2,3,4,5)
    val list = listOf("123","123","23123")
    val list2 = mutableListOf<Int>()


    for(i in numbers) {

    }




    val (a,b) = readln().split(" ").map { it.toInt() }
    println("$a $b")

    val result = if(a>b) a else b
    when {
        a>b -> println("asdasd")
        else -> println("234234")
    }
    when(a) {
        1,2,3 -> { println("1 2 3") }
        else -> println("4 5 6")
    }




    val x = 6
    //x = 9
    var y = 100
    y = 200
    println("x=${x+200}, y=${y+100}")
    println("$x $y")
}