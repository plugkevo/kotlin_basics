fun main() {
    var fruits = arrayOf<String>("mango", "apple", "oranges", "guavas", "bananas","pawpaw", "passion", "peaches ", "coconut")
    var data = arrayOf(1, "f", "ds", true, 1.33 )
    println(fruits[3])

    //usimg the getter function
    println(fruits.get(2))

    //looping through an array
    var months = arrayOf("jan","feb", "mar", "apr", "may", "june", "july", "aug", "sep", "ovr", "nov", "dec" )
         for (i in months)
        println(i)


    months.set(2, "june")
    for (i in months)
        println(i)

 if("jan" in months) {
     println("exists")
 }
     else {
    println("does not")
     }

 }

}