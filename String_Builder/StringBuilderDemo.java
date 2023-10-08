package String_Builder;
    
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder("ABC");
        System.out.println(strb.append("cd"));
        System.out.println(strb.insert(2, 35));
        System.out.println(strb.delete(2, 3));


    }


    
}
