public class day11{
    public static void swap(int a,int b){
        int temp=a; 
        a=b;
        b=temp;
        System.out.println("a after swap:"+a);
        System.out.println("b after swap:"+b);
    }
    public static void main(String[]args){
        int a=10;
        int b=5;
        swap(a,b);
    }
}

