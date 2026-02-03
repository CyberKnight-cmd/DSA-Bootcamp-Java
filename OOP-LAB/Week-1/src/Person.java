import java.util.Scanner;

public class Person {

    String name;
    Person(Scanner sc){
        System.out.println("Enter your name : ");
        name = sc.nextLine();
    }

    String getName(){
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person a = new Person(sc);
        System.out.println(a.getName());
    }
}
