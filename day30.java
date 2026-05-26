public class day30{
    public static int addnumbers(int num){
        if(num!=0){
            return num + addnumbers(num-1);
        }
        else{
            return num;
        }
    }
    public static void main(String[]args){
        int number=20;
        int sum=addnumbers(number);
        System.out.println("Sum:"+sum);
    } 
}

