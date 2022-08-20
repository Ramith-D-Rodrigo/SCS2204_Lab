object question1 extends App{

    def prime(n: Int, s: Int = 2): Boolean = s match{
        case x if(n == x) => true;
        case x if(n % x == 0) => false;
        case x => prime(n, x+1);
    }

    println(prime(5));
    println(prime(8));
}