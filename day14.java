public class day14{
    public static boolean palindrome(int n){
        int ori=n;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        if(ori==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        boolean p=palindrome(121);
        if(p==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

