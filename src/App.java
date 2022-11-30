import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        EmployeeManagement empM =new EmployeeManagement();
        InternManagement internM= new InternManagement();
        int option = 0;
        do {
            mainmenu();
            option = option();
            switch (option) {
                case 1:
                do {
                    submenu("Employee");
                    option = option();
                    switch (option) {
                        case 1:
                        empM.view();
                        System.out.println("");

                            break;
                        case 2:
                        empM.search();
                        System.out.println("");
                            break;
                        case 3:
                        empM.add();
                        System.out.println("");
                            break;
                        case 4:
                        empM.edit();
                        System.out.println("");
                            break;
                        case 5:
                        empM.delete();
                        System.out.println("");
                            break;
                        case 0:
                        
                        default:
                        System.out.println("Please enter the number of the function!");
                        System.out.println("-----------------------------------------------");
                        System.out.println("");
                            break;

                    }
                } while (option != 0);
                    
                    break;
                case 2:
                do {
                    submenu("Intern");

                    option = option();
                    switch (option) {
                        case 1:
                        internM.view();
                        System.out.println("");
                            break;
                        case 2:
                        internM.search();
                        System.out.println("");
                            break;
                        case 3:
                        internM.add();
                        System.out.println("");
                            break;
                        case 4:
                        internM.edit();
                        System.out.println("");
                            break;
                        case 5:
                        internM.delete();
                        System.out.println("");
                            break;
                        default:
                        System.out.println("Please enter the number of the function!");
                System.out.println("-----------------------------------------------");
                System.out.println("");
                            break;

                    }
                    break;
                
                } while (option != 0);
                    

            }

        } while (option != 0);

    }

    public static void mainmenu() {
        System.out.println("Management Dashboard");
        System.out.println("--------------------------");
        System.out.println("1. Employee Management");
        System.out.println("2. Intern Management");
        System.out.println("0. Exit");
        System.out.println("");
    }

    public static void submenu(String temp) {
        System.out.println(temp + " Management");
        System.out.println("--------------------------");
        System.out.println("1. Show All " + temp);
        System.out.println("2. Search " + temp);
        System.out.println("3. Add " + temp);
        System.out.println("4. Edit " + temp);
        System.out.println("5. Delete " + temp);
    }

    public static int option() {
        boolean check = true;
        int temp = 0;
        do {
            System.out.println("Select option: ");
            
            try {
                temp = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("please enter correct input");
                sc.nextLine();
            }
        } while (check);

        return temp;
    }
}