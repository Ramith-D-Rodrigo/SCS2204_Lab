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
            var fixedcharset = scala.collection.mutable.Map[Int, String]();
            for(i <- change){   //changing the cases of certain characters
                var result = some_func(name.charAt(i).toString());
                fixedcharset += (i -> result);
            }
            var final_string = "";
            for(i <- 0 until name.length){ //creating the final string
                if(fixedcharset.keySet.contains(i)){
                    final_string = final_string + fixedcharset(i);
                }
                else{
                    final_string = final_string + name.charAt(i).toString();
                }
            }
            final_string;
        }
    }

    println(formatNames("Benny", toUpper, List(-1)));
    println(formatNames("Niroshan", toUpper, List(1)));
    println(formatNames("Saman", toLower, List(-1)));
    println(formatNames("Kumara", toUpper, List(5)));
}