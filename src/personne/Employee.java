package personne;

public class Employee extends Personne {

    int salary;

    public Employee(String nm, int sl) {
        super(nm);
        this.salary = sl;
        Employee developer = new Employee("fathi", 2500);
        System.out.println("name of Enployee:" + developer.name);

        System.out.println("salary of Employee:" + developer.salary);


    }


}
