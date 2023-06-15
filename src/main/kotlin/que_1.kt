fun main() {
    //An important part of data preparation is to ensure that data
    //strings are uniformly formatted and capitalized. For a given input
    //string, create a function that accepts a string input as well as an
    //argument string that’s either “upper” or “lower.” If “upper,” then
    //the function should convert everything in the string to upper
    //case, while the “lower” argument should return the string with
    //every character in lowercase.To give yourself an added
    //challenge, add the arguments “snake” and “camel” that convert a
    //string of words separated by spaces into snake case or camel
    //case.

    println("Enter a string")
    val input = readln()

//    val upper= input.uppercase()
////    println("In uppercase " + upper)
//
//    val lower = input.lowercase()
////    println("In lowercase " +lower)
//
    val camelcasestring = tocamelcase(input)
    println(camelcasestring)


}
fun tocamelcase(input:String):String{
    val words = input.trim().split("\\s+".toRegex())
    val sb = StringBuilder()

    for(i in words.indices){
        val word = words[i]
        val camelcase = if (i==0){
            word.toLowerCase()
        }
        else{
            word.toLowerCase().capitalize()
        }
        sb.append(camelcase)
    }

    return sb.toString()
}
