package JavaObjectOrientedConcepts;

public class Perimeter {
    public int perimeter(int s){
        return 4*s;
    }
    public int perimeter(int l,int b){
        return 2*(l+b);
    }
    public int perimeter(double r){
        return 2*(int)(22/7)*(int)r;
    }
    //method overloading only be done by changing the ammount of parameter or the datatype of parameter
    //cant done method overloading by changing return type it will show error;

}
class Main{
    public static void main(String[] args) {

    }
}