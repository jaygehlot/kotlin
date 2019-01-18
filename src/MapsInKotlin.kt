fun main(args: Array<String>) {

    val peoplesAge = mapOf<String, Int>("Jay" to 36, "Ansh" to 30, "Nidhi" to 31)

    println(peoplesAge["Ansh"])

    val jaysMap = mapOf("Key1" to "Value1", "Key2" to "Value2", "Key3" to "Value3")

    println(jaysMap)

    for(item in jaysMap) {
        println(item)
    }

//    for (entry in jaysMap.entries) {
//        val key = entry.key
//        val value = entry.value
//        if (key.equals("Key2")) {
//            println(value)
//        }
//    }
}