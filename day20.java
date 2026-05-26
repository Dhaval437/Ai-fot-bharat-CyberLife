public class day20{
    public static int binarysearch(int arr[],int target){
        for(int low=0,high=arr.length-1;low<=high;){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,10,12,14,16};
        int target=10;
        int result=binarysearch(arr, target);
        if(result!=-1){
            System.out.println("Element found at index:"+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}

