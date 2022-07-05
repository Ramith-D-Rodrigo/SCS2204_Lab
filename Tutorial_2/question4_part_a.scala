object question4_a extends App{
    def normal_Pay(hours: Int): Int = { //function to calculate total normal working hour payment
        return hours * 250;
    }
    def OT_Pay(hours: Int): Int = { //function to calculate total OT hour payment
        return hours * 85;
    }
    def tax(normal_hours: Int, ot_hours: Int): Double = { //function to calculate the tax
        return (normal_Pay(normal_hours) + OT_Pay(ot_hours)) * 0.12;
    }
    def takeHome_salary(normal_hours: Int, ot_hours: Int): Double = { //function to calculate total takehome salary
        return normal_Pay(normal_hours) + OT_Pay(ot_hours) - tax(normal_hours, ot_hours);
    }

    println("Takehome Salary: " + takeHome_salary(40, 30));
}