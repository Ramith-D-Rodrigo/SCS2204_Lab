object question4 extends App{
    import scala.io.StdIn._;
    print("Enter a whole number: ");
    var x: Int = readInt();
    if(x % 2 == 0){
        println("Even");
    }
    else{
        println("Odd");
    }
}