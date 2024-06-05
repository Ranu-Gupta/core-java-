package lab_30_5_24;
import java.util.Scanner;

public class PiglatinWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();
        int len = word.length();

        word=word.toUpperCase();
        String piglatin="";
        int flag=0;
        
        for(int i = 0; i < len; i++)
        {
            char x = word.charAt(i);
            if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
            {
                piglatin=word.substring(i) + word.substring(0,i) + "AY";
                flag=1;
                break;
            }
        }
        
        if(flag == 0)
        {
            piglatin = word + "AY";
        }
        System.out.println(word + " in Piglatin format is " + piglatin);
    }

		

	}


