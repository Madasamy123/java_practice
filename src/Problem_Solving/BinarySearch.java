package Problem_Solving;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10,11};
        int target=9;

        int ans=searchBinary( arr, target);
        System.out.println(ans);



    }

     static int searchBinary(int [] arr, int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+((end-start)/2);

            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }

        }

        return -1;


    };

}

