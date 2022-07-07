object question3 extends App{
    var a: Int = 2;
    var b: Int = 3;
    var c: Int = 4;
    var d: Int = 5;

    var k: Float = 4.3f;
    //println(--b * a + c * d--);
    b = b - 1;
    println(b*a + c*d);
    d -= 1;
    //println(a++);
    println(a);
    a += 1;
    //println(-2 * (g - k) + c); g is not declared
    
    //println(c=c++);
    println(c);
    var temp : Int = c; //make sure c is not changed according to Java code
    c += 1;
    c = temp;
    
    //println(c=++c*a++);
    c = c+1;
    println(c*a);
    a+=1;
}