package Constructori;

public class Person {
    int age;
    String FristName;
    String LastName;

    Person(){
        age = 20;
        FristName = "Unkown";
        LastName = null;
    }
    Person(int age, String Firstname){
        this.age = age;
        this.FristName = Firstname;
    }
    Person(int age, String Firstname, String LastName){
        this.age = age;
        this.FristName = Firstname;
        this.LastName = LastName;
    }

    public String toString() {
        return "This person's name is: "+this.FristName+" "+ this.LastName+" and he/she is "+this.age+" years old!";
    }
}
