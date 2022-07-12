object question1_b extends App{
    def absVal(a:Int): Int = {
        if(a < 0){
            -a;
        }
        else{
            a;
        }
    }
    println("Absolute value of 50: "+ absVal(50));
    println("Absolute value of -34: "+ absVal(-34));
}