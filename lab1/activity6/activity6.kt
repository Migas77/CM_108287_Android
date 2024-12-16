fun main() {
    // 2. Print messages
    println("Use the val keyword when the value doesn't change. ")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it. ")
    println("When you call a function, you pass arguments for the parameters.")

    // 3. Fix compile errors
    println("New chat message from a friend")

    // 4. String Templates
    // the variable has to be a var for its value to change -> not val
    // val cannot be reassigned
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)

    // 5. String concatenation
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    val stringCat = numberOfAdults + numberOfKids
    println("The total party size is: $total, not $stringCat ")

    // 6. Message formatting
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    // 7. Implement basic math operations
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println(anotherResult.javaClass.name)


    // 8. Default parameters
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()


    // 9. Pedometer
    val Steps = 4000
    val caloriesBurned = pedometerStepsToCalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")

    // 10. Compare two numbers
    println(spendMoreTimeOnThePhoneTodayThanYesterday(300, 250))
    println(spendMoreTimeOnThePhoneTodayThanYesterday(300, 300))
    println(spendMoreTimeOnThePhoneTodayThanYesterday(200, 220))

    // 11. Move duplicate code into a function
    printCityTemperature("Ankara", 27, 31, 82)
    printCityTemperature("Tokyo", 32, 36, 10)
    printCityTemperature("Cape Town", 59, 64, 2)
    printCityTemperature("Guatemala City", 50, 55, 7)




}

fun add(firstNumber: Number, secondNumber: Number): Double{
    """
    In Kotlin, you can add variables of type Number by converting them to a common type before performing the addition.
    Since Number is an abstract superclass of numeric types like Int, Double, Float, etc., you need to explicitly convert
    the variables to a specific numeric type to perform arithmetic operations.
    
    Number Type Conversion Methods: Number provides methods like .toInt(), .toDouble(), .toFloat(), etc.,
    to convert to specific numeric types.
    """
    // if you don't specify return type it will be Unit
    // even if I specify return type as Number the type will be Double either way
    return firstNumber.toDouble() + secondNumber.toDouble()
}

fun displayAlertMessageWrong(operatingSystem: String, emailId: String){
    // return type of this will be unit
    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")

    // with this would have compile error has it was not specified String as return type
    // return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String{
    // return type of this will be unit
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}


fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun spendMoreTimeOnThePhoneTodayThanYesterday(timeSpentToday: Int, timeSpentYesterday: Int) : Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun printCityTemperature(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int){
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
    // formatting also works for non strings
}

