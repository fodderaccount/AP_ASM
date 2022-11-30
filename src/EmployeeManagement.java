import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement extends InputField implements Management {
    private ArrayList<Employee> empList = new ArrayList<Employee>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void view() {
        // TODO Auto-generated method stub
        for (Employee emp : empList) {
            System.out.println("Employee ID             :" + emp.getId());
            System.out.println("Employee Email          :" + emp.getEmail());
            System.out.println("Employee Name           :" + emp.getName());
            System.out.println("Employee Salary         :" + emp.getSalary());
            System.out.println("Employee Availability   :" + emp.getStatus());
        }

    }

    @Override
    public void search() {
        System.out.println("Enter Employee ID:");
        String n = sc.nextLine();
        // TODO Auto-generated method stub
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println(empList.get(i).toString());
                return;
            }
        }

        System.out.println("Employee doesn't exist");

    }

    @Override
    public void add() {
        // TODO Auto-generated method stub
        try {
            System.out.println("Add New Employee:");
            String temp = inputString("ID");

            for (int i = 0; i < empList.size(); i++) {
                if (empList.get(i).getId().equals(temp)) {
                    System.out.println("ID already used or Employee exist!");
                    System.out.println("-----------------------------------------------");
                    return;
                }

            }
            try {

                Employee emptemp = new Employee();
                emptemp.setId(temp);
                emptemp.setName(inputString("Name"));
                emptemp.setEmail(inputString("Email"));
                emptemp.setStatus(inputString("Status"));
                emptemp.setSalary(inputDouble("Salary"));
                empList.add(emptemp);
            } catch (NumberFormatException e) {
                System.out.println("please enter correct input!");
            }

        } catch (Exception e) {
            System.out.println("Please enter the field!");
        }
    }

    

    @Override
    public void edit() {
        System.out.println("Enter Employee ID: ");
        // TODO Auto-generated method stub
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getId().equalsIgnoreCase(sc.next())) {
                System.out.println("Edit " + empList.get(i).getName() + " information");
                try {
                    empList.get(i).setName(inputString("Name"));
                    empList.get(i).setEmail(inputString("Email"));
                    empList.get(i).setStatus(inputString("Status"));
                    empList.get(i).setSalary(inputDouble("Salary"));

                } catch (NumberFormatException e) {
                    System.out.println("please enter correct input!");
                    return;
                }
                System.out.println("Edit Successfully");
                return;
            }
        }
        System.out.println("Employee doesn't exist");

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        System.out.println("Enter Employee ID:");
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getId().equalsIgnoreCase(sc.next())) {
                empList.remove(empList.get(i));
                System.out.println("Employee Deleted");
                return;
            }

        }
        System.out.println("Employee doesn't exist");
    }

}
