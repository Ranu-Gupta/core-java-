package JavaObjectOrientedConcepts;

class Person{
    String Firstname = "Pranav";
    String Lastname ="Mali";

    public String getFirstname() {
        return Firstname;
    }
    public String getLastname() {
        return Lastname;
    }
}
class Employee3 extends Person{
    int Salary;

    public int getSalary() {
        return Salary;
    }
}
class Manager extends Employee3{
    String post ="Manager";

    public String getPost() {
        return post;
    }
}
class Citizen extends Person{
    String Citizenship="Indian";

    public String getCitizenship() {
        return Citizenship;
    }
}

public class ClassQuestion {
    public static void main(String[] args) {

    }
}
