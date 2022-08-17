public class Employee {

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public static int getId() {
        return id;
    }

    public int getDepartament1() {
        return departament1;
    }

    public int getDepartament2() {
        return departament2;
    }

    public int getDepartament3() {
        return departament3;
    }

    public int getDepartament4() {
        return departament4;
    }

    public int getDepartament5() {
        return departament5;
    }

    public Employee(String surname, String firstName, String lastName, double salary) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    private String  surname;
    private String  firstName;
    private String  lastName;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
    private static int id;

    public void setDepartament1(int departament1) {
        this.departament1 = departament1;
    }

    public void setDepartament2(int departament2) {
        this.departament2 = departament2;
    }

    public void setDepartament3(int departament3) {
        this.departament3 = departament3;
    }

    public void setDepartament4(int departament4) {
        this.departament4 = departament4;
    }

    public void setDepartament5(int departament5) {
        this.departament5 = departament5;
    }

    private int departament1;
    private int departament2;
    private int departament3;
    private int departament4;
    private int departament5;


}
