fun main(args: Array<String>) {
//    for(count in 1..10) {
//        println(count)
//    }

    var chocolatesMutableList : MutableList<String> = mutableListOf("Snickers", "Kit Kats", "Hotel Chocolate")

    for (chocolates in chocolatesMutableList) {
        println(chocolates)
    }

    for (number in 1..10000) {
        if (number > 692) {
            println(number)
        }
    }
}