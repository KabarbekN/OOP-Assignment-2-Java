public class Student extends Person{

    final double stipend = 36660;
    private double gpa;

    public Student(){

    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public String toString() {
        return "Student: " + getId() + ". " + name + " " + surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    @Override
    public double getPaymentAmount() {
        if (getGpa() > 2.67){
            return stipend;
        }
        else{
            return 0;
        }
    }


}
