object question7 extends App{
    print("Enter month number: ");
    var mon = scala.io.StdIn.readInt();
    if(mon == 12 || mon == 1 || mon == 2){
        println("Winter");
    }
    else if(mon == 3 || mon == 4 || mon == 5){
        println("Spring");
    }
    else if(mon == 6 || mon == 7 || mon == 8){
        println("Summer");
    }
    else if(mon == 9 || mon == 10 || mon == 11){
        println("Autumn");
    }
    else{
        println("Bogus month");
    }
}