fun main() {

//For a given input string of words, create a function that returns
//the longest word in the string. For example, for the input phrase
//“I love Coding,” the output should be “Coding.” For an added
//challenge, you can create an output that lists the longest word
//along with the number of characters in the word. So, for the
//string “I love Coding,” the output would look something like,
//“word: Coding count: 6.”

    println("Enter a sentence")
    val input = readln()



    val longestword = longestword(input)
    val letters = longestword.count()

    println("Word: $longestword Count: $letters")

}

fun longestword(input:String):String{
    val words = input.trim().split("\\s+".toRegex())
    var longest =""
    for(word in words){
        if (word.length>longest.length){
            longest=word
        }
    }
    return longest
}