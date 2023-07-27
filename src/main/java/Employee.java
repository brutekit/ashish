import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

public class Employee implements Comparable<Employee>,Cloneable, Serializable {


    private  String name;
    private  int salary;
    private  int age;

    private String department;
    private List<Long> phoneNumber;

    public Employee(String name, int salary, int age, String department, List<Long> phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Long> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Long> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getAge() - o.getAge() ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("no clone object created ") ;
    }


    //    @Override
//    public int compareTo(Employee o) {
//        return this.getSalary() - o.getSalary();
//        if(this.getSalary() > o.getSalary()) return 1;
//        else if(this.getSalary() < o.getSalary()) return -1;
//        else return this.getAge() - o.getAge();
//    }
}
