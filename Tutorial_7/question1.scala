object question1 extends App{
    class Rational(x: Int, y: Int){
        def numerator = x;
        def denominator = y;
    
        def neg(): Rational = {
            Rational(-this.numerator, this.denominator);
        }

        override def toString(): String = numerator.toString() + "/" + denominator.toString();

    }

    var x = new Rational(5,6);

    println("x : " + x.toString());
    println("x negative: " + x.neg().toString());

}