public class day40{
    public static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //target found
            if(arr[mid]==target){
                return mid;
            }
            //left sorted
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target< arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            //right sie is sorted
            else{
                if(target>arr[mid]&& target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr, target));
    }
}

