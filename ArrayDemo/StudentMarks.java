package ArrayDemo;

public class StudentMarks {


    int subMarks[]=new int[5];
    void storeMarks()
    {  subMarks[0]=100;
        subMarks[1]=100;
        subMarks[2]=100;
        subMarks[3]=100;
        subMarks[4]=100;

        


    }

     void displayMarks()
    {
        for (int i=0;i<=4;i++)
        {
            System.out.println("subject Marks= "+ subMarks[i]);

        }


    }

    public static void main(String[] args) {
        
        StudentMarks sm=new StudentMarks();

        sm.storeMarks();
        sm.displayMarks();
    }


}

    

