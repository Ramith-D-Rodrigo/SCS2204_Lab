object question4 extends App{
    def isEven(n: Int): Boolean = n match{
        case x if(x == 0) => true;
        case _ => isOdd(n-1);
    }

    def isOdd(n: Int): Boolean = {
        !isEven(n);
    }

    println(isEven(4));
    println(isEven(5));
    println(isOdd(9));
    println(isOdd(8));
}