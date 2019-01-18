fun main(args: Array<String>) {

    fun aMethod() {
        println("Hello")
    }

    aMethod()

    fun addAndPrint(number1: Int=4, number2: Int=2): Int {
        return number1 + number2
    }

    println(addAndPrint(100, 100))
    println(addAndPrint(8)) //2 is the default
    println(addAndPrint()) //because of defaults
    println(addAndPrint(number1 = 3)) //specify just one argument


    var sum : Int = addAndPrint(1, 1)

    fun dogsName(name: String, age: Int) :String {
        return "Name is $name and age is $age"
    }

    println(dogsName("Fido", 10))

}