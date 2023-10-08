package ArrayDemo;

public class TwoDimCon {

    public static void main(String[] args) {
        
         int[][] student={
            {101,200,305},{403,500,606},{700,809,900}
        };


        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                if(student[i][j]%2==0)
                {
                System.out.print(student[i][j]+"even");
                System.out.print("\t");
                }
                else
                {
                    System.out.print(student[i][j]+"odd");
                    System.out.print("\t");
                                    
                }

            }
            System.out.print("\n");

        }
    }

   
    
}
