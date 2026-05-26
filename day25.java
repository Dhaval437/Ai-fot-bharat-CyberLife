public class day25{
    public static int binarysearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start/end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;
        int bi=binarysearch(arr, key);
        if(bi!=-1){
            System.out.println("element found at index:"+bi);
        }
        else{
            System.out.println("Element not found");
        }
    }
}

