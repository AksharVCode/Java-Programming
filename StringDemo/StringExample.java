package StringDemo;

public class StringExample {
    public static void main(String[] args) {
        
        String s1="hello";String s2="Aptech";String s3="      Hello";

        System.out.println("length of string "+ s1.length());
         System.out.println("character at index "+ s1.charAt(1));
          System.out.println(s1.concat(s2));
           System.out.println("index of A is"+ s2.indexOf('e'));
            System.out.println("last index of  "+ s2.lastIndexOf('h'));
             System.out.println("replace aptech to kptech"+ s2.replace('A','k'));
              System.out.println("original s3"+ s3);
               System.out.println("after trim s3"+ s3.trim());

    }
    
}
