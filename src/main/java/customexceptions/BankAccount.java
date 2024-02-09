package customexceptions;

public class BankAccount{
    static Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    static class InsufficientFundsException extends Exception{
        public InsufficientFundsException(String message){
            super(message);
        }
    }
    static class InvalidWithdrawalException extends Exception{
        public InvalidWithdrawalException(String message){
            super(message);
        }
    }

    public static void withdraw(Double amount){
        if (amount < 0) {
            try {
                throw new InvalidWithdrawalException("Enter a valid amount");
            }catch (Exception e){
                System.out.println(e);
            }
            return;
        }
        if (amount>balance){
            try {
                throw new InsufficientFundsException("Insufficient Balance");
            }catch (Exception e){
                System.out.println(e);
            }
            return;
        }
        else {
            balance = balance - amount;
            System.out.println("Transaction Completed Successfully \n Remaining Balance:" + balance);
        }
    }

    public static void main(String[] args){
        BankAccount b = new BankAccount(1000.00);
        withdraw(100.00);
        withdraw(-98.0);
        withdraw(300.0);
    }
}