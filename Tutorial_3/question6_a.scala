import scala.compiletime.ops.float
object question6_a extends App{
    import scala.io.StdIn._;
    print("Enter average marks: ");
    var avg: Float = readFloat();
    if(avg > 69.0){
        println("Very Good");
    }
    else if(avg > 54.0){
        println("Good");
    }
    else if(avg > 39.0){
        println("Pass");
    }
    else if(avg >= 0){
        println("Fail");
    }
    else{
        println("Invalid Marks");
    }
}