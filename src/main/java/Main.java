/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        System.out.println("Type out your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String name1 = "Alice";
        String name2 = "Bob";
        if (name.equals(name1) || name.equals(name2)) {
            System.out.println("Hi " + name + ", welcome!");
        } else {
            System.out.println("Name not found");
        }

    }
}
