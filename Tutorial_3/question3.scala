object question3 extends App{
    def volumeSphere(r: Int): Double = {
        4.0/3.0 * Math.PI * Math.pow(r, 3);
    }
    println("Volume: "+ volumeSphere(5));
}