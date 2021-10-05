package masum;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.print("Enter your section:");
      String section=sc.nextLine();

      //importing class

        Info info =new Info();   //info class
        Hobby hobby=new Hobby();  //hobby class
        //print out all the data
        System.out.println("My section is "+section);
        System.out.println("My name is "+info.name);
        System.out.println("ID: "+info.id+" and");
        System.out.println("My hobby is "+hobby.hobbyName);


    }
}
