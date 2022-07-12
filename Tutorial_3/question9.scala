object question9 extends App{
    import scala.io.StdIn._;
    print("Enter first number: ");
    var num1 = readDouble();
    print("Enter second number: ");
    var num2 = readDouble();
    print("Enter operation symbol: ");
    var op: Char = readChar();
    if(op == '+'){
        println("Addition");
        println("result: "+ (num1+num2));
    }
    else if(op == '-'){
        println("Substraction");
        println("result: "+ (num1-num2));
    }
    else if(op == '*'){
        println("Multiplication");
        println("result: "+(num1*num2));
    }
    else if(op == '/'){
        println("Division")
        println("result: "+(num1/num2));
    }
    else{
        println("wrong operator");
    }
}