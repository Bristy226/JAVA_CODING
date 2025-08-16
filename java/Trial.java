import java.util.*;
//user input

public class trial {
    public static void main(String[] args) {



//permitive
        int year=2025;
        char grade='A';
        double cgpa=3.5;
        boolean forSale=false;

 //non-permoitive
        String name="Toyota";

        System.out.println("The year is "+year);
        System.out.println("hello " +"world");
        System.out.println(cgpa);

//use of boolean
        if(forSale){
            System.out.println("the car "+name + " is available");

        }
        else{
            System.out.println("the car "+name +" isn't available");

        }

 //input object creation
        Scanner scan=new Scanner(System.in);
        System.out.print("scan=");
        int p=scan.nextInt();//for int type
        System.out.println("value for scan is :"+p);


        //double d;
        //String s;
        //int i;
        System.out.print("double d= ");
        double d=scan.nextDouble();
        System.out.println("double value is: "+d);

        //here the compiler will be starting buffer as scanner in jave is single thread
        System.out.print("string s= ");
        String s=scan.nextLine();
        System.out.println("string is: "+s);

        System.out.print("integer i= ");
        int i=scan.nextInt();
        System.out.println("integer is: "+i);

        System.out.print("are you a student?=(true/false) ");
        boolean b=scan.nextBoolean();
        if (b==true){
            System.out.println("yes i'm a student");
        }
        else{
            System.out.println("no i'm not");
        }

       scan.close();//termination for input scanning



    }
}
