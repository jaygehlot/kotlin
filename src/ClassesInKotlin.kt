fun main(args: Array<String>) {




    class Dog(name: String, age: Int, furColor: String, isMale: Boolean, weight:Double) {
        var name = name
        var age = age
        var furColor = furColor
        var isMale = isMale
        var weight = weight

        fun info() {
            println("$name is $age years old, has $furColor and weighs $weight lbs")
        }

        fun getName(){
            var age = 33
            println(age)
            println(this.age)
        }

        fun clear() {
            this.name = ""
            this.age = 0
            this.furColor = ""
            this.weight = 0.0
        }
    }

//    var myDog = Dog()
//    myDog.age = 6
//    myDog.name = "Brian"
//    myDog.furColor = "Brown"
//
//    print(myDog.name)

    var myDog = Dog("Brian", 21, "Brown", true, 30.8)
    myDog.info()

    var otherDog = Dog("Sara", 17, "White", false, 20.8)

    println(otherDog.age)

    otherDog.info()
    otherDog.getName()
}