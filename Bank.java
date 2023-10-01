public class Bank {

    String bankName;
    int balance;
    int years;

    void initializeBank()
    {
        bankName = "SBI";
        balance=10000000;
        years=20;

    }
    
    void displayBank()
    {
        System.out.print("name of bank"+ bankName +"\n");
        System.out.print("Total balance"+ balance +"\n");
        System.out.print("Total working years"+ years+"\n");

    }
public static void main(String[] args) {

    Bank Bk=new Bank();
    Bk.initializeBank();
    Bk.displayBank();

    System.out.print(Bk.balance);

    
}
}


