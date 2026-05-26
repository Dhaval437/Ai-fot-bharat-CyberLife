public class day18{
    public static int linearsearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;
        int result=linearsearch(arr, key);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index:"+result);
        }
    }
}

