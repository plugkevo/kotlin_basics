fun main() {
  /* Write a function called &quot;calculateDiscountedPrice&quot; that takes two
    parameters: &quot;price&quot; (a Double) and &quot;discountPercentage&quot; (an

            Int). The function should calculate and return the discounted
            price after applying the discount percentage. For example, if the
    price is 100.0 and the discount percentage is 20, the function
    should return 80.0 (which is 20% off the original price. Test your
            function by calling it with different price and discount percentage
            values and printing the result .Note: The discount percentage
    should be a whole number (e.g., 20 for 20%), and the function
    should handle percentages greater than 100 as well (e.g., 150
    for 150% discount).*/

    println("Enter the price")
    var price= readln().toInt()
    var discount: Double =0.2
    var totaldis = discount

   println(calculateDiscountedPrice(price, totaldis))



}

fun calculateDiscountedPrice(input:Int, discountPercentage: Double):Double {
     var discount = input * discountPercentage
    val total = input - discount




return total.toDouble()

}





