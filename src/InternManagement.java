import java.util.ArrayList;
import java.util.Scanner;

public class InternManagement extends InputField implements Management {

    private ArrayList<Intern> internList = new ArrayList<Intern>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void view() {
        // TODO Auto-generated method stub
        for (Intern intern : internList) {
            System.out.println("Intern ID         :" + intern.getId());
            System.out.println("Intern Email          :" + intern.getEmail());
            System.out.println("Intern Name           :" + intern.getName());
            System.out.println("Intern Period        :" + intern.getPeriod(intern.getEndOfContract()));
            System.out.println("Intern End Date         :" + intern.getEndOfContract());
            System.out.println("Intern Availability   :" + intern.getStatus());
            
        }

    }

    @Override
    public void search() {
        System.out.println("Enter Intern ID:");
        String n = sc.nextLine();

        // TODO Auto-generated method stub
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getId().equalsIgnoreCase(n)) {
               System.out.println(internList.get(i).toString());
                return;
            }
        }
        System.out.println("Intern doesn't exist");

    }

    @Override
    public void add() {
        // TODO Auto-generated method stub
        try {
            System.out.println("Add New Intern:");
            String temp = inputString("ID");
            for (int i = 0; i < internList.size(); i++) {
                if (internList.get(i).getId().equals(temp)) {
                    System.out.println("ID already used!");
                    System.out.println("-----------------------------------------------");
                    return;
                }
            }
            try {
                Intern tempintern = new Intern();
                tempintern.setId(temp);
                tempintern.setName(inputString("Name"));
                tempintern.setEmail(inputString("Email"));
                
                tempintern.setStatus(inputString("Status"));
                tempintern.setEndOfContract(inputDate("EndDate"));
                internList.add(tempintern);
            } catch (NumberFormatException e) {
                System.out.println("Check your input");
            }
        } catch (Exception e) {
            System.out.println("Please enter the field!");
        }
    }

    @Override
    public void edit() {
        System.out.println("Enter Intern ID: ");
        // TODO Auto-generated method stub
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getId().equalsIgnoreCase(sc.next())) {
                System.out.println("Edit " + internList.get(i).getName() + " information");
                try {
                    internList.get(i).setName(inputString("Name"));
                    internList.get(i).setEmail(inputString("Email"));
                    internList.get(i).setEndOfContract(inputDate("EndDate"));
                    internList.get(i).setStatus(inputString("Status"));

                } catch (NumberFormatException e) {
                    System.out.println("please enter correct input!");
                    return;
                }
                System.out.println("Edit Successfully");
                return;
            }
        }
        System.out.println("Intern doesn't exist");

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        System.out.println("Enter Intern ID:");
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getId().equalsIgnoreCase(sc.next())) {
                internList.remove(internList.get(i));
                System.out.println("Intern Deleted");
                return;
            }

        }
        System.out.println("Intern doesn't exist");
    }
    
}
