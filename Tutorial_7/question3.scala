object question3 extends App{
    class Account(x: Int, y: String, z: Double){
        var accountNo = x;
        var accountOwner = y;
        var accountBalance = z;

        private def amountValidity(amount: Double): Boolean = amount match{ //valid amount (not negative)
            case x if(x < 0) => {println("Invalid amount"); false;}
            case _ => true;
        }

        def deposit(amount: Double): Boolean = {
            if(amountValidity(amount) == true){
                accountBalance = accountBalance + amount;
                true;
            }
            else{
                false;
            }
        }

        def withdraw(amount: Double): Boolean = {
            if(amountValidity(amount) == true){ 
                if(amount > accountBalance){   // not enough balance
                    println("No enough to withdraw");
                    false;
                }
                else{
                    accountBalance = accountBalance - amount;
                    true;
                }                
            }
            else{
                false;
            }
        }

        def transfer(that: Account, amount: Double): Unit = {
            if(this.withdraw(amount)){
                that.deposit(amount);
            }
            else{
                println("Unable to transfer");
            }
        }

        override def toString(): String = "Acc Number: " + accountNo.toString() + " , Acc Owner: " +  accountOwner + " , Balance: "+ accountBalance.toString();
    }

    var accOne = new Account(1, "Ramith", 50000);
    var accTwo = new Account(2, "Rodrigo", 45000);

    println("Before transfer: ");
    println(accOne.toString());
    println(accTwo.toString());

    var transferAmount = -90000;
    println("\nTransferring " + transferAmount.toString() + " account 1 to account 2....");
    accOne.transfer(accTwo, transferAmount);

    println("\nAfter transfer: ");
    println(accOne.toString());
    println(accTwo.toString());

}