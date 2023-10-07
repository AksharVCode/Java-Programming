package ArrayDemo;

public class TwoDim {

    public static void main(String[] args) {
        
         int[][] student={
            {100,200,300},{400,500,600},{700,800,900}
        };


        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print(student[i][j]);
                System.out.print("\t");

            }
            System.out.print("\n");

        }
    }

   
    
}
