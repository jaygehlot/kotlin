fun main(args: Array<String>) {

    var chocolatesList : List<String> = listOf("Snickers", "Kit Kats", "Hotel Chocolate")
    var chocolatesArray : Array<String> = arrayOf("Snickers", "Kit Kats", "Hotel Chocolate")

    println(chocolatesList.last())

    chocolatesArray[0] = "someNewChoc"

    print(chocolatesArray[0]) //cannot do this in a list, unless using MutableList
    println("\n" + chocolatesList)

    var chocolatesMutableList : MutableList<String> = mutableListOf("Snickers", "Kit Kats", "Hotel Chocolate")

    chocolatesMutableList[0] = "newChoc" //can change element in mutableList
    chocolatesMutableList.add("anotherNewChoc")
    chocolatesMutableList.add(0, "firstChoc")


    println("\n" + chocolatesMutableList)

    var luckyNums : Array<Int> = arrayOf(28, 12, 15, 9)
    println(luckyNums.last())

}