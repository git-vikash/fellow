import java.util.Scanner;

/**
 * Basic1
 */
public class Basic1 {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length;
        String note="Hello <<UserName>>, How are you?";
        String name="";
        do{
            System.out.println("Enter your name:");
            name=sc.next();
            length=name.length();
        }while(length<3);
        String welcomeNote=note.replace("<<UserName>>",name);
        System.out.println(welcomeNote);
        sc.close();
    }
}