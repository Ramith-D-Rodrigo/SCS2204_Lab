object question4 extends App{
    print("Enter a number: ");
    var input = scala.io.StdIn.readInt();

    def even_odd(x: Int): Unit = x match{
        case x if(x > 0 && x % 2 == 0) => println("Even");
        case x if(x > 0 && x % 2 != 0) => println("Odd");
        case _ => println("Negative/Zero"); 
    }

    even_odd(input);
}