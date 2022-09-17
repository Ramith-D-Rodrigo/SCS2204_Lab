import scala.collection.mutable.Map;

object Question extends App{
    case class Point(coordinates: Map[Char, Double]){

        require(coordinates.contains('x') && coordinates.contains('y'), "Wrong coordinate characters"); //coordinate requirements

        def +(that: Point): Point = {   //add operation
            Point(Map('x'-> (this.coordinates('x') + that.coordinates('x')), 'y'-> (this.coordinates('y') + that.coordinates('y'))));
        }

        def distance(that: Point): Double = {   //distance between 2 points
            Math.sqrt(Math.pow((this.coordinates('x') - that.coordinates('x')), 2) + Math.pow((this.coordinates('y') - that.coordinates('y')), 2));
        } 
        
        def move(dx: Double, dy: Double): Unit = {  //move the point by given values
            this.coordinates.update('x', (this.getX() + dx));
            this.coordinates.update('y', (this.getY() + dy));
        }
        def getX(): Double = {  //get x coordinate
            this.coordinates('x');
        }
        def getY(): Double = {  //get y coordinate
            this.coordinates('y');
        }

        def invert(): Unit = {  //invert the coordinates
            var temp = this.getX();
            this.coordinates.update('x', this.getY());
            this.coordinates.update('y', temp);
        }
    }

    var p1 = Point(Map('x' -> 6, 'y' -> 5));
    var p2 = Point(Map('x' -> 10, 'y' -> 4));

    println("Point 1 : " + p1);

    println("Point 2 : " + p2);

    println("\nDistance between Point 1 and Point 2 : " + p1.distance(p2));

    println("\nAdding Point 1 and Point 2 : " + (p1 + p2));

    var dx: Double = 5;
    var dy: Double = 7;

    println("\nMoving Point 1 by " + dx.toString() + " in X coordinate and " + dy.toString() + " in Y coordinate");
    p1.move(dx, dy);
    println("After moving, Point 1 : " + p1); 

    println("\nInverting Point 2...");
    p2.invert();
    println("After inverting Point 2: " + p2);
}