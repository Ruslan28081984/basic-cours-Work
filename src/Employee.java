public class Employee {

    private String name;
    public Employee(int salary) {
        this.salary = salary;
    }

    private int salary;

    private int departament;
    private   int id ;
    public Employee(String name, int salary, int departament) {
        this.name = name;
        this.salary = salary;
        this.departament = departament;
        id ++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public String toString() {
        return "имя: " + this.name + " Зарплата: " + this.salary + " Отдел: " + this.departament;
    }
}
