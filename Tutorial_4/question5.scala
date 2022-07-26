object question5 extends App{
    def toUpper(x: String): String = {
        x.toUpperCase();
    }

    def toLower(x: String): String = {
        x.toLowerCase();
    }

    def formatNames(name: String, some_func:(String) => String): String = {
        some_func(name);
    }

    println(formatNames("Benny", toUpper));
    println(formatNames("Niroshan", toUpper));
    println(formatNames("Saman", toLower));
    println(formatNames("Kumara", toLower));
}