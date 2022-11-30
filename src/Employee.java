public class Employee extends Person {

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String id, String email, String status, double salary) {
        super(name, id, email, status);
        this.salary = salary;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", id='" + getId() + "'" +
                ", email='" + getEmail() + "'" +
                ", status='" + getStatus() + "'" +
                " payment='" + getSalary() + "'" +
                "}";

    }

}
