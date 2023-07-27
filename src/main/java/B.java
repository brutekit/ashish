import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class B {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

//        Person pp = new Employee("ashish", 55000, 29);
        Person ppp = new Person();
        Class ref = Class.forName("Person");
        Person rp = (Person) ref.newInstance();

        Person lcp = (Person) ref.getClassLoader().loadClass("Person").newInstance();

//        Person obp = (Person) pp.clone();


        LocalDate birthday = LocalDate.of(1993,3,4);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday,today);

        System.out.printf("Your Age is  : %d,%d,%d\n\n",p.getYears(),p.getMonths(),p.getDays());

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("ashish", 40000, 26, "IT",List.of(546464646546546451L,3164654654L)));
        emp.add(new Employee("vishal", 50000, 28, "IT",List.of(941114656654654646L,892457993L,56624896L)));
        emp.add(new Employee("arun", 35000, 34, "HR",List.of(9411146647L,892457993L,56624896L)));
        emp.add(new Employee("kalpana", 20000, 18, "IT",List.of(692457993L)));
        emp.add(new Employee("aisha", 65000, 32, "HR",List.of(89249346465L,8779789765L)));

        System.out.println( emp.stream().filter(employee -> employee.getName().startsWith("a")).collect(Collectors.toList()) );

        System.out.println(emp.stream().collect(Collectors.toMap(Employee::getAge,employee -> p)));

        System.out.println(emp.stream().collect(Collectors.averagingLong(Employee::getSalary)));

//        Collections.sort(emp, (o1, o2) ->  o2.getSalary() - o1.getSalary());
//        emp.forEach(System.out::println);
//        System.out.println("*********************************************************************");
//        Collections.sort(emp, (o1,o2)-> o1.getAge() - o2.getAge());
//        System.out.println("*********************************************************************");


//        List<Employee> e1 =emp.stream().filter(e -> e.getName().charAt(0)=='a'?true:false).collect(Collectors.toList());
//        Employee maxSalary = emp.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
//        System.out.println(maxSalary);
//        System.out.println(emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(2).findFirst());
//        System.out.println(e1);
//        emp.sort(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getSalary));
//        e1.forEach(System.out::println);
    }


}
