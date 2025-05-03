class InsufficientBalance extends Exception{
    public insufficientBalanceexception(String message){
        super(message);
    }
}

class BankAccount{
    private double balance ;
    public BankAccount(double balance){
        thid.balance = balance;
    }
    public void withdrawal(double amount) throws insufficentBalanceException{
        if(amount>balance){
            throw new insufficientBalanceException("Insufficient balance");
        }
        else{
            balance -=amount; 
            System.out.println(balance);
        }
    }
}

public class UserDefinedException{
    
}