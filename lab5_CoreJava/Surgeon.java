package JavaObjectOrientedConcepts;
// create a doctor class with method surgery
 class Doctor{
    public void Surgery(){
        System.out.println("Perform a surgery");
    }
    public void medicine(){
        System.out.println("can treat people");
    }

}
class Nurse extends Doctor{
    public void Givemedicine(){
        System.out.println("can give medicine to patients");
    }
    public void Treat(){
        System.out.println("Treat Patient");
    }

}
public class Surgeon extends Doctor{
    //class Surgeon will inherit the method surgery
    public static void main(String[] args) {

    }
}
