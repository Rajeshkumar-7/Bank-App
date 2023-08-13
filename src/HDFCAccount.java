public class HDFCAccount implements BankAccountInterface{

    String name;

    String accountNo; // It will be Unique(Using UUID)

    String password;

    double balance;

    double rateOfInterest = 7.1;

    String IFSCCode = "HDFC374873";

    // Default Constructor
    public HDFCAccount() {
    }

    // Parameterised Constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your Balance : " + this.balance;
        }
        return "Incorrect Password!!";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Amount added successfully . New Balance : " + this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance < amount){
                return "Insufficient Balance";
            }
            this.balance -= amount;
            return "Amount deducted successfully . New Balance : " + this.balance;
        }
        return "Incorrect Password!!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Password successfullt changed";
        }
        return "Incorrect original Password!!";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance * year * rateOfInterest) / 100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
