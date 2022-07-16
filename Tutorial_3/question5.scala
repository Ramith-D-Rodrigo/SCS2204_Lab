object question5 extends App{
        def easyPace(dis: Int): Int = {
            dis * 8;
        }
        def tempo(dis: Int): Int = {
            dis * 7;
        }

        def totalDis(epDis: Int, tempoDis: Int): Int = {
            easyPace(epDis) + tempo(tempoDis);
        }

        println("Total running time (min): "+ totalDis(2+2, 3));
}