public class CustomerDetail {

    public static void main(String[] args) {
        
        Customer cust =new Customer();
        System.out.print("before address change \n");
        cust.display();
        System.out.print("after Address change \n");
        cust.changeAddress("vashi");
        cust.display();

    }
    
}
