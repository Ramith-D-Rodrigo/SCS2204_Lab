object question2 extends App{
    case class shopping_cart_item(name: String, price: Double, quantity: Int);

    var item1 = shopping_cart_item("Vanilla ice cream", 3.99, 13);
    var item2 = shopping_cart_item("Chocolate biscuits", 4, 6);
    var item3 = shopping_cart_item("Cupcakes", 7.77, 7);

    var shopping_cart = List(item1, item2, item3);

    def print_items(cart: List[shopping_cart_item]): Unit = {
        if(cart.isEmpty) {
            return;
        }       
        else{
            println(cart.head.quantity + " "+ cart.head.name +" at Rs"+cart.head.price+" each");
            print_items(cart.tail)
        }

    }
    print_items(shopping_cart);

}