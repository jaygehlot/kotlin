import java.time.DayOfWeek
import java.time.DayOfWeek.SATURDAY
import java.time.DayOfWeek.SUNDAY
import java.time.LocalDate

fun main(args: Array<String>) {

    var age : Int = 28
    var weight : Double = 37.9
    var candy : String = "Snickers"

    var isHot : Boolean = true

    var ageLimitOk : Boolean = age > 18

    print(!ageLimitOk)

    if (ageLimitOk) {
        println("\n"+"Enjoy the ride")
    }

    var localDate : LocalDate = LocalDate.now();
    var currentDay : DayOfWeek =  localDate.dayOfWeek

    println(currentDay)

    if (currentDay == SATURDAY || currentDay == SUNDAY) {
        println("Its the weekend!")
    }

}