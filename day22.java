import java.util.*;
public class day22{
    public static int findGCD(int n1,int n2){
        if(n2==0){
            return n1;
        }
        return findGCD(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=sc.nextInt();
        System.out.println("Enter seound number:");
        int n2=sc.nextInt();
        int gdc=findGCD(n1,n2);
        int lcm=(n1*n2)/gdc;
        System.out.println("LCM of given nubers are:"+lcm);
    }
}

