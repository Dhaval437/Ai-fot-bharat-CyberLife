import java.util.*;
public class day8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int oddsum=0;
        int evensum=0;
        do{
            System.out.println("Enter the number:");
            number=sc.nextInt();
            if(number%2==0){
                evensum+=number;
            }
            else{
                oddsum+=number;
            }
            System.out.println("do you want to continue? press 1 for continue and 0 for stop:");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("sumof even number is:"+evensum);
        System.out.println("sum of odd number is:"+oddsum);
    }
}

