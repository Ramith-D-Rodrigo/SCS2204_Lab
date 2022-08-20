object question3 extends App{
    def sum(n: Int, s: Int = 1): Int = s match{
        case x if(x <= n) => sum(n, s+1) + s;
        case _ => 0;
    }

    println(sum(5));
}