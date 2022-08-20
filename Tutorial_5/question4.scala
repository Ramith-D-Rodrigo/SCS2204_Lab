object question4 extends App{
    def isEven(n: Int): Boolean = n % 2 match{
        case 0 => true;
        case _ => false;
    }

    println(isEven(4));
    println(isEven(5));
    println(!isEven(9));
    println(!isEven(8));
}