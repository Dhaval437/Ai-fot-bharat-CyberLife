import java.util.*;
public class day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        for(int i=year;i<=year;i++){
            if((i%400==0 && i%100!=0)||(i%400==0)){
                System.out.println("this is a leap year");
            }
            else{
                System.out.println("this is not a leap year");
            }

        }
    }
}

