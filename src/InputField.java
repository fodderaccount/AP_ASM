
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class InputField {
    private static Scanner sc = new Scanner(System.in);

    
    public String inputString(String temp) {
        System.out.print("Enter "+ temp+" :" );
        return sc.nextLine();
    }
    public double inputDouble(String temp){
        
        boolean check = true;
        double temp1 = 0;
        do {
            
            System.out.print("Enter "+ temp+" :" );
            try {
                temp1 = sc.nextDouble();
                check = false;
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("please enter correct input");
                sc.nextLine();
            }
        } while (check);

        return temp1;
        
        
    }
    public LocalDate inputDate(String temp){
        System.out.print("Enter "+ temp+" :" );
        String date ="";
        date =sc.next().trim();
        LocalDate parsedDate=LocalDate.parse(date);
        return parsedDate;
        
    }
}

    
