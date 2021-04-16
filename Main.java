package com.example;
import java.util.regex.*;
import java.util.Scanner;
class regex
{
    static boolean valid=false;
    public static void isValid(String checkingValue,String regex)
    {
        for(int i = 0; !valid; i++) {

            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(checkingValue);
            valid= m.matches();
            if (valid) {
                System.out.println("string is acceptable");
            }else {
                Scanner sc=new Scanner(System.in);
                System.out.println("String is not acceptable");
                System.out.println("Re-enter the value...");
                checkingValue=sc.nextLine();
            }
        }
    }
    public static void firstName() {
        String regex = "^[A-Z][a-z]{2,10}$";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name");
        System.out.println("1.First letter should be capital\n2.Name should contain minimum of 3 letters");
        String firstName = sc.nextLine();
        isValid(firstName,regex);
        valid=false;
    }
    public static void secondName() {
        String regex = "^[A-Z][a-z]{2,10}$";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the second name");
        System.out.println("1.First letter should be capital\n2.Name should contain minimum of 3 letters");
        String secondName = sc.nextLine();
        isValid(secondName,regex);
        valid=false;
    }
    public static void emailId() {
        String regex = "^abc.[A-Za-z0-9]+@bl.co[A-Za-z0-9.]$";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email id");
        String emailId = sc.nextLine();
        isValid(emailId,regex);
        valid=false;
    }
    public static void main(String[] args)
    {
       firstName();
       secondName();
       emailId();
    }
}
