object question2 extends App{
    case class shopping_cart_item(name: String, price: Double, quantity: Int);

    var item1 = shopping_cart_item("vanilla ice cream", 3.99, 13);
    var item2 = shopping_cart_item("chocolate biscuits", 4, 6);
    var item3 = shopping_cart_item("cupcakes", 7.77, 7);

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



    def vanilla_and_others_print(cart: shopping_cart_item): Unit = cart match{
        case (shopping_cart_item("vanilla ice cream",x,y)) => println(y + " vanilla ice cream at Rs"+x+" each");
        case _ => println("Found another item");
    }

    def print_helpList(cart: List[shopping_cart_item]): Unit = {
        if(cart.isEmpty){
            return;
        }
        else{
            vanilla_and_others_print(cart.head);
            print_helpList(cart.tail);
        }
    }
    println();
    print_helpList(shopping_cart);
}