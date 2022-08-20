object question5 extends App{
    def add_even(n: Int, s: Int = 2): Int = s match{
        case x if(x % 2 == 0 && x < n) => add_even(n, s + 1) + s;
        case x if(x < n) => add_even(n, s + 1);
        case _ => 0;
    }

    println(add_even(12));
}