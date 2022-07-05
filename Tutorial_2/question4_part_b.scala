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

    def income(ticket_price: Int): Int = { //function to calculate total income
        return attendance(ticket_price) * ticket_price;
    }

    def cost(ticket_price: Int): Int = {    //function to calculate cost
        return attendance(ticket_price) * 3 + 500;
    }
    def profit(ticket_price: Int): Int = { //function to calculate total profit
        return income(ticket_price) - cost(ticket);
    }

    print("Enter the ticket price: ");
    var ticket = readInt();
    println("Profit: " + profit(ticket));
}