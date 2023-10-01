public class Emp {



    String empName;
    int empAge;
//defult constructor 
    Emp()
    {
        System.out.println("invoking default constructor");
        empAge=30;
        empName="someone";

    }
//parameterized constructor 

Emp(int age ,String name)
{   
    System.out.println(" i am in parameterized constructor");
    empName=name;
    empAge=age;

}



    void displayEmp()
    {
        System.out.println("name is "+empName);
        System.out.println("Age is "+empAge);

    }
    
}
