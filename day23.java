public class day23 {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;
        int result=linearsearch(arr, key);
        if(result!=0){
            System.out.println("Element found at index:"+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}

