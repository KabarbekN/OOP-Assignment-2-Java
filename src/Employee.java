public class Employee extends Person{
    private String position;
    private double salary;

    public Employee(){

    }

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee: " + super.getId() + ". " + name + " " + surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getPaymentAmount(){
        return getSalary();
    }


}
