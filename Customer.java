public class Customer {

    String custName="Google";
    String custAddress="Banglore";

    void changeAddress(String add)
    {
        custAddress=add;


    }
    
    void display()
    {
        System.out.println("name is "+ custName +"\n");
        System.out.println("Address is "+ custAddress+ "\n");
    }
}
