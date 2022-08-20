object question2 extends App{

    def prime(n: Int, s: Int = 2): Boolean = s match{
        case x if(n == x) => true;
        case x if(n % x == 0) => false;
        case x => prime(n, x+1);
    }
    def primeSeq(n: Int, s: Int = 2): Any = {
        if(s < n){
            if(prime(s))
                print(s + ", ");
        }
        primeSeq(n, s+1);
    }

    primeSeq(100);
}