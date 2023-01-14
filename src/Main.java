import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Abay", "Kunanbayev", "author", 12354);
        System.out.println(employee);
        Employee employee1 = new Employee("Iren", "Adler", "unknown", 456000);
        System.out.println(employee1.getPosition());

        Student student1 = new Student("John", "Lennon", 3.64);
        Student student2 = new Student("Abraham", "Lincoln", 3.79);
        Student student3 = new Student("John", "Kennedy", 2.45);
        Student student4 = new Student("Merry", "Weather", 2.48);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(employee);
        persons.add(student1);
        persons.add(student2);
        persons.add(employee1);
        persons.add(student3);
        persons.add(student4);

        System.out.println("Before sorting");
        printData(persons);

        System.out.println("Do you want to sort by ascending or descending order? 1/2");
        Scanner scanner = new Scanner(System.in);
        int ordering = scanner.nextInt();
        if (ordering == 1) {
            Collections.sort(persons);
            System.out.println("After ascending sorting");
        }
        else if (ordering == 2){
            Collections.sort(persons);
            Collections.reverse(persons);
            System.out.println("After descending sorting");
        }
        else{
            System.out.println("There no such type of ordering");
        }
        printData(persons);
    }

    public static void printData(Iterable<Person> persons){
        for (Person person : persons){
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}