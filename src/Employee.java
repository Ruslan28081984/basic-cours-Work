public class Employee {


    private final int id;
   private String name;
   private int departament;
   private double salary;
   private static int counter;

    public Employee(String name, int departament, double salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Работник " +
                "id=" + id + ", имя ='" + name + '\'' + ", отдел =" +
                departament + ", зарплата =" + salary;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
