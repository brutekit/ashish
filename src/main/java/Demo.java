import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Employee emp = new Employee();
        System.out.println("New : "+emp.hashCode());

        // Create new object using clone method
        try{Employee cloneEmp = (Employee) emp.clone();
        System.out.println("Clone : "+cloneEmp.hashCode());}catch (CloneNotSupportedException c){
            System.out.println("no clone object created ");
        }

        // Create new object using Reflection API
        Class c = Class.forName("Employee");
        Employee reflectionEmp = (Employee) c.newInstance();
        System.out.println("Reflection : "+reflectionEmp.hashCode());

        // Create new object using Deserialization
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\emp.txt"));
        os.writeObject(emp);
        os.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\emp.txt"));
        Employee deserializeEmp = (Employee) in.readObject();
        in.close();
        System.out.println("Deserialization : "+deserializeEmp.hashCode());
    }
}