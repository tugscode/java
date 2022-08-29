public class Account {
    private String number;
    private double balance;
    private  String customerName;
    private  String customerEmail;
    private  String customerPhone;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" made. New balance is "+this.balance);
    }

    public void withDraw(double withdrawalAmount){
        if(balance - withdrawalAmount <= 0){
            System.out.println("Only "+this.balance+" available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" processed. Remaining balance = "+this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
