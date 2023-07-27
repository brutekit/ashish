public interface InterfaceB {
    default void sum(){
        System.out.println("interface B call");
    }
    static void print(){
        System.out.println("interface B static method");
    }
}
