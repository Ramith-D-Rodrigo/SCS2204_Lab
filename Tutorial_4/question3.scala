object question3 extends App{
    import scala.language.implicitConversions;
    case class Car(name: String, price: Double);

    implicit def uui_method(car: Car): CarUUID = {
        new CarUUID(car);
    }

    class CarUUID(car: Car) {
        var uuid: String = "car uuid = " +car.name+  " - "+ car.name.hashCode(); 
    }

    var obj1 = Car("bmw 3 series", 20000);
    var obj2 = Car("bmw 5 series", 50000);
    var obj3 = Car("vw passat", 10000);
    var obj4 = Car("vw golf", 12000);
    var obj5 = Car("mazda 3", 15000);

    var car_list = List(obj1, obj2, obj3, obj4, obj5);
    car_list.foreach(i => println(i.uuid));
}