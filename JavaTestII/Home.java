package JavaTestII;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Manager manager=new Manager();
        Scanner scanner=new Scanner(System.in);
        while (true){
            menu();
            System.out.println("Enter choice:");
            int ch=scanner.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter your Name:");
                    String name=scanner.next();
                    System.out.println("Enter your Email:");
                    String email=scanner.next();
                    System.out.println("Enter your Phone:");
                    String phone=scanner.next();
                    manager.addCustomer(name,email,phone);
                    break;
                case 2:
                    System.out.println("--Search By name--");
                    System.out.println("Enter your name:");
                    name=scanner.next();
                    manager.findByName(name);
                    break;
                case 3:
                    manager.displayAll();
                    break;
                case 4:return;
                default:break;
            }
        }
    }
    public static void menu(){
        System.out.println("\tCRM");
        System.out.println("1.Add new customer");
        System.out.println("2.Find by name");
        System.out.println("3.Display all");
        System.out.println("4.Exit");
    }
}
