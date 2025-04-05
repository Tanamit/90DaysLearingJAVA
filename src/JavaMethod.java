public class JavaMethod {
    public static void main(String[] args) {

//        เรียกใช้ method
        sayHello();
        greetUser("Tanamit");
        System.out.println(add(5,10));
    }

//    Method ต่างๆ
    public static void sayHello(){
        System.out.println("Hello!");
    }

    public static void greetUser(String name) {
        System.out.println("Hi, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
