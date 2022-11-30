import java.time.LocalDate;
import java.time.Period;

public class Intern extends Person {

    
    public Intern(LocalDate endOfContract) {
        EndOfContract = endOfContract;
    }
    
    private LocalDate EndOfContract;
    public Intern() {
    }
    
    public Intern(String name, String id, String email, String status, LocalDate endOfContract) {
        super(name, id, email, status);
        EndOfContract = endOfContract;
    }
    public LocalDate getEndOfContract() {
        return EndOfContract;
    }

    public void setEndOfContract(LocalDate endOfContract) {
        EndOfContract = endOfContract;
    }
    public Period getPeriod(LocalDate EndOfContract){
        this.EndOfContract= EndOfContract;
        LocalDate td = LocalDate.now();
        Period p= Period.between(td, EndOfContract);
        return p;
    }

}
