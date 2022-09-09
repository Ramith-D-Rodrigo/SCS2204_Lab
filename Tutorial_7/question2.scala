object question2 extends App{
    class Rational(x: Int, y: Int){
        def numerator = x;
        def denominator = y;

        def -(that: Rational): Rational = {
            Rational(this.numerator * that.denominator - that.numerator * this.denominator, this.denominator * that.denominator);
        }

        override def toString(): String = numerator.toString() + "/" + denominator.toString();
    }

    var x = new Rational(3,4);
    var y = new Rational(5,8);
    var z = new Rational(2,7);
    var ans = x-y-z;

    println(ans.toString());
}