public class day24 {
    public static int largestnum(int arr[]){
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
             large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[]args){
        int arr[]={2,3,4,45,12,14};
        int result=largestnum(arr);
        System.out.println("largest number is:"+result);
    }
}

