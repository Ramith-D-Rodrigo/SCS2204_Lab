object question5 extends App{
    def toUpper(x: String): String = {
        x.toUpperCase();
    }

    def toLower(x: String): String = {
        x.toLowerCase();
    }

    
    def formatNames(name: String, some_func:(String) => String, change: List[Int]): String = {
        if(change.head == -1){
            some_func(name);
        }
        else{
            var temp: Char = name.charAt(change.head);
            name.replace(change.head) = some_func(temp.toString()).toCharArray()[0];
            name;
        }
    }

    println(formatNames("Benny", toUpper, List(-1)));
    println(formatNames("Niroshan", toUpper, List(0,1)));
    println(formatNames("Saman", toLower, List(-1)));
    println(formatNames("Kumara", toUpper, List(0,5)));
}