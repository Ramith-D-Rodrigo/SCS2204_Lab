object question6 extends App{
    def fibNum(n: Int): Int = n match{
        case 0 => 0;
        case 1 => 1;
        case _ => fibNum(n-1) + fibNum(n-2);
    }


    def fibSeq(n: Int): Any = {
        if(n > 0){
            fibSeq(n - 1);
        }
        print(fibNum(n) + " ");
    }

    fibSeq(9);
}