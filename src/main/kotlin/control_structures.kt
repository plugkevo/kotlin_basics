fun main() {
    //control statements
    //Iteration or loop structures

    /*
    Contorol statements-if , if else , if else if, nestes if, when
     */

    var age = 45
    if (age>30){
        println("has a family")
    }

    //if else

    if (age>30){
        println("has a family")
    }
    else{
        println("still children")
    }
    //if else if

    if (age<20) {
        println("youth")
    }
    else if (age >20 && age<30){
        println("parent")
        }
    else{
        println("old")
    }

    //when - returns a value
    var num= 5
    var day = when(num){
        1->"monday"
        2->"tuesday"
        3->"wednesday"
        4->"thursday"
        5->"friday"
        6->"saturday"
        7->"sunday"
        else-> "non existent"

    }
    println("your day is " + day)

    //when statement without expression
    when(num){
        1->"monday"
        2->"tuesday"
        3->"wednesday"
        4->"thursday"
        5->"friday"
        6->"saturday"
        7->"sunday"
        else-> "non existent"

    }
    println("your day is " + num)


    }


