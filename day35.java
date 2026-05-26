public class day35{
    public static void max_subarrays_prfix(int arr[]){
        int curr=0;
        int max=0;
        int prefix[]=new int[arr.length];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max<curr){
                    max=curr;
                }
            }
        }
        System.out.println("max sum:"+max);
    }
    public static void main(String[]args){
        int arr[]={1,-2,6,-1,3};
        max_subarrays_prfix(arr);
    }
}

