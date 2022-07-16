import scala.compiletime.ops.int
object question8 extends App{

    println("1) Celsius to Fahrenheit");
    println("2) Fahrenheit to Celsius");
    print("Choose choice: ");
    var choice: Int = scala.io.StdIn.readInt();
    if(choice == 1){
        print("Enter temperature in celcius: ");
        var temp: Int = scala.io.StdIn.readInt();
        var fh: Double = (temp*9/5.0) + 32;
        println("Fahrenheit: "+ fh);
    }else if(choice == 2){
        print("Enter temperature in Fahrenheit: ");
        var temp: Int = scala.io.StdIn.readInt();
        var c: Double = (temp-32)*5/9.0;
        println("Celsius: "+ c);
    }
    else{
        println("Incorrect choice");
    }
}