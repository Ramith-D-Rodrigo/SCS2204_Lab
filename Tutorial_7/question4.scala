object question4 extends App{
    class Account(x: Int, y: String, z: Double){
        var accountNo = x;
        var accountOwner = y;
        var accountBalance = z;

        def negBalance(): Boolean = x match{
            case x if(this.accountBalance < 0) => true;
            case _ => false;
        }

        private def interest(): Double = {
            if(this.negBalance()){  //overdraft intereset
                this.accountBalance * 0.1;

            }
            else{   //deposit interest
                this.accountBalance * 0.05;
            }
        }

        def balanceWithInterest(): Double = {
            this.accountBalance + this.interest();
        }

        override def toString(): String = "Acc Number: " + accountNo.toString() + " , Acc Owner: " +  accountOwner + " , Balance: "+ accountBalance.toString();
    }


    def negAccounts(account: List[Account]): List[Account] = {  //get the accounts with negative balance
        account.filter(i => i.negBalance());
    }

    def sumBalance(account: List[Account]): Double = {  //get the total balance of all the accounts
        account.map(_.accountBalance).reduce((x, y) => x + y);
    }

    def finalBalance(account: List[Account]): List[Double] = {  //get the final balances of all the accounts including the interest
        account.map(_.balanceWithInterest());
    }

    var Bank = List(new Account(1, "Ramith", 30000), new Account(2, "Dulsara", -24000), new Account(3, "Rodrigo", -10000), new Account(3, "John", 36000));
    var negativeBalances = negAccounts(Bank);
    var sumAllAccountBalances = sumBalance(Bank);
    var finalBalances = finalBalance(Bank);

    println("Accounts with negative balances: " + negativeBalances +"\n");
    println("Sum of all account balances : "+ sumAllAccountBalances +"\n");
    println("Final balances of all accounts: " + finalBalances +"\n");
}