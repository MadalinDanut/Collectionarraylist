package Constructori;

public class MainClass {
    public static void main(String[] args) {
        Person A =new Person(25, "Madalin");
        Person B = new Person();

        System.out.println("This person "+A.FristName+" has "+A.age+" years old!");

        System.out.println(A);
        System.out.println(B);
    }
}
