public class Main {
    public static void main(String[] args) {

        HDFCAccount VivekAcc = new HDFCAccount("Vivek", "vivek123", 2000);

        System.out.println(VivekAcc); // printed the attricutes via toString

        // fetch balance
        System.out.println(VivekAcc.fetchBalance("random"));  // wrong password
        System.out.println(VivekAcc.fetchBalance("vivek123"));  //correct password

        // add money
        System.out.println(VivekAcc.addMoney(100000));

        // withdraw
        System.out.println(VivekAcc.withdrawMoney(200000,"vivek123"));
        System.out.println(VivekAcc.withdrawMoney(50000,"vivek123"));
        System.out.println(VivekAcc.withdrawMoney(50000,"random"));


        // change Password
        System.out.println(VivekAcc.changePassword("vivek123","vivek"));
        System.out.println(VivekAcc.fetchBalance("vivek"));

        //calculate interest
        System.out.println("Interest for 5 years on current balance will be: " + VivekAcc.calculateInterest(5));
    }
}