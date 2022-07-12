import scala.compiletime.ops.float
object question6_a extends App{
    import scala.io.StdIn._;
    print("Enter average marks: ");
    var avg: Float = readFloat();
    if(avg >= 0){
        if(avg > 39.0){
            if(avg > 54.0){
                if(avg > 69.0){
                    println("Very Good");
                }
                else{
                    println("Good");
                }
            }
            else{
                println("Pass");
            }
        }
        else{
            println("Fail");
        }
    }
    else{
        println("Invalid Marks");
    }
}