object question1 extends App{
    def interest_percentage(deposit: Int): Double = x match{
        case x if(deposit <= 20000) => 0.02;
        case x if(deposit <= 200000) => 0.035;
        case x if(deposit <= 2000000) => 0.04;
        case _ => 0.065;
    }

    def interest(deposit: Int): Double = {
        deposit * interest_percentage(deposit);
    }

    print("Enter deposit amount: ");
    var x = scala.io.StdIn.readInt();
    println("Total interest in a year: "+ interest(x));
}