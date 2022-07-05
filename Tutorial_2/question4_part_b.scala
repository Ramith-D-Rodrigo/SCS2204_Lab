object question4_part_b extends App{
    //15 price -> 120 people
    //-5 price -> +20 people
    //+5 price -> -20 people
    //attendee cost = 3
    //performance cost = 500
    import scala.io.StdIn._;
    def attendance(ticket_price: Int): Int = { //function to calculate attendance
        return (((15 - ticket_price)  / 5) * 20) + 120;
    }

    def profit(ticket_price: Int): Int = { //function to calculate total profit
        return (attendance(ticket_price) * ticket_price) - ((attendance(ticket_price) * 3) + 500);
    }

    print("Enter the ticket price: ");
    var ticket = readInt();
    println("Profit: " + profit(ticket));
}