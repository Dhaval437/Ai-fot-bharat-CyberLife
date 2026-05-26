public class day44 {
    public static void bubble_sort(int arr[]){
        for(int turns=0;turns<arr.length-1;turns++){
            for(int j=0;j<arr.length-1-turns;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubble_sort(arr);
        printArr(arr);
    }
}

