fun main(args: Array<String>) {
    println("Hi Jay")

    var age=5

    age = 21

    val text = "I am final because val is used instead of var"

    val weather = "Sunny"
    println(weather)

    println(age)

    println(text)

    var integer : Int = 23
    var string = "Try to use val instead of var, if the var won't be modified \n"
    println(integer)
    print(string)

    var str : String = "The : String enforces that str is a String"
    println(str)

    var candy : String   //this is possible but don't really need to put the assignment on a different line
    candy = "Snickers"
    print(candy)


    var a : String? = "abc"
    a = null  //allows a to be null because of the ? after String
}