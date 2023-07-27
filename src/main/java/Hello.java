
import java.util.*;

public class Hello {

    public static void main(String... args) {
//        List<Employee> emp = new ArrayList<>();
//        emp.add(new Employee("ashish", 40000, 26, "IT",List.of(546464646546546451L,3164654654L)));
//        emp.add(new Employee("vishal", 50000, 28, "IT",List.of(941114656654654646L,892457993L,56624896L)));
//        emp.add(new Employee("arun", 35000, 34, "HR",List.of(9411146647L,892457993L,56624896L)));
//        emp.add(new Employee("kalpana", 20000, 18, "IT",List.of(692457993L)));
//        emp.add(new Employee("aisha", 65000, 32, "HR",List.of(89249346465L,8779789765L)));
//
//        Map<Object, Long> employe = emp.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.counting()));
//        System.out.println(employe);
//        System.out.println( "maximum salary : "+emp.stream().max((o1, o2) -> o1.getSalary()-o2.getSalary()).get());
//        System.out.println( "minimum salary : "+emp.stream().min(Comparator.comparingInt(Employee::getSalary)).get());
//
//        System.out.println( "Employee working in each department : "
//                +emp.stream().collect(Collectors.groupingBy(Employee::getDepartment)));
//        System.out.println( "Count Employee working in each department : "
//                +emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

//        String s1 = " ashish rana";
//        System.out.println(s1.strip());
//        System.out.println(s1.lines().toString());
//        System.out.println(s1.isBlank());
//        System.out.println(s1.repeat(4));


//        System.out.println( emp.stream().map(Employee::getPhoneNumber).collect(Collectors.toList()));
//        System.out.println( emp.stream().flatMap(employee -> employee.getPhoneNumber().stream()).collect(Collectors.toList()));

//        Thread t1 = new Thread(() -> System.out.println("Thread");
//        t1.start();

// Find Second Largest element of Array without sorting
//        int[] arr = {2, 4, 6, 1, 5, 8, 3};
//        int max = arr[0], secondMax = 0;
//
//        for(int i=0 ; i < arr.length; i++){
//            if(arr[i]>max){
//                secondMax = max;
//                max = arr[i];
//            }
//        }
//        System.out.println(secondMax);





//    Arrays.sort(arr);
//    System.out.println(arr[arr.length - 2]);

// bubble sort - shifting largest element at the end
//    for(int i=0; i < arr.length - 1; i++){
//        for(int j=0; j < arr.length - 1 -i ; j++){
//            if(arr[j] > arr[j+1]){
//                //swap elements
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//    }

        // selection sort - shifting smallest number at the front
//        for(int i=0 ; i <arr.length-1 ; i++){
//            int smallest = i ;
//            for(int j=i+1; j < arr.length ; j++) {
//                if (arr[i] > arr[j]) {
//                    smallest = j;
//                }
//            }
//                int temp = arr[smallest];
//                arr[smallest] = arr[i];
//                arr[i] = temp;
//        }
//
//        for(int i=0; i < arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }


        // Print n natural numbers without loop

//        print(10);

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,6,8,3));
        System.out.println(list.get(list.size()/2));

        String s3 = "";
        String s1 = 1+"a";
        String s2 = 1 + "9";
        System.out.println(s1 + s2 + s3);
    }

//    public static void print(int n){
//        if(n>0) {
//            print(n - 1);
//            System.out.println(n+" ");
//        }
//    }
}