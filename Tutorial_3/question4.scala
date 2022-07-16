object question4 extends App{
    def wholesale_cost(no_of_copies: Int): Double = {
        total_book_price(no_of_copies) - discount(no_of_copies) + shipping_cost(no_of_copies);
    }
    def shipping_cost(no_of_copies: Int): Double = no_of_copies match{
        case x if x >= 50 => (3 * 50) + ((no_of_copies - 50) * 0.75);
        case x if x < 50 => 3 * no_of_copies;
    }
    def total_book_price(no_of_copies: Int): Double = {
        no_of_copies * 24.95;
    }
    def discount(no_of_copies: Int): Double = {
        total_book_price(no_of_copies) * 0.40;
    }

    println("Wholesale cost of 60 copies: "+ wholesale_cost(60));
}