public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen = 1;
    protected String name;
    protected String surname;

    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getPaymentAmount() > o.getPaymentAmount()){
            return 1;
        }
        else if(this.getPaymentAmount() < o.getPaymentAmount()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
