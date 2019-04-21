package session_02;

import java.util.Scanner;

public class Human {
    public int age;
    public String name;
    public String country;

    public void inPutInTo() {

        Scanner scanner = new Scanner(System.in);
       System.out.println("Ten:");

        name = scanner.nextLine();

        System.out.println("Tuoi:");

        age = scanner.nextInt();

        System.out.println("Dat nuoc:");

        country = scanner.nextLine();

    }
    public void showInfo(){
        System.out.println("Name:" +name);
        System.out.println("Tuoi:" +age);
        System.out.println("Country:" +country);

    }
}




