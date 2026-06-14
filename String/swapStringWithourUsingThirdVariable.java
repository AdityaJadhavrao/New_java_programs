package String;

public class swapStringWithourUsingThirdVariable {
    
    public static void main(String[] args) {
        
        String a = "hello";
        String b = "world";

        a = a+b; //helloworld
        b = a.substring(0,a.length()-b.length()); //hello
        a = a.substring(b.length()); //world

        System.out.println("After swapping the String");
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }
}
