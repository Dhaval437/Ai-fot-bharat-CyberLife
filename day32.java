public class day32 {
    public static int armstrong(int n){
        int lastdigit=0;
        int b=0;
        int num=0;
        while(n>0){
            lastdigit=n%10;
            num=(int)Math.pow(lastdigit,3);
            b=b+num;
            n=n/10;
        }
        return b;
    }
    public static void main(String[] args) {
        int n=153;
        int s=armstrong(n);
        if(s==n){
            System.out.println("the number is armstrong number");
        }
        else{
            System.out.println("the number is not armstrong number");
        }
    }
}

