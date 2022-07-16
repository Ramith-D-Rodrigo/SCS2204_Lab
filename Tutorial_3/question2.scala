object question2 extends App{
    def tempConv(cel: Int): Double = {
        cel * 1.8000 + 32.00
    }

    println("35 celsius to fahrenheit: "+ tempConv(35));
}