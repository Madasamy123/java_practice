package Problem_Solving;

public class MinMax {
    public static void main (String [] args){
        int arr[]= {3, 2, 11, 56, 10000, 167};

        int minNum=arr[0];
        int maxNum=arr[0];

        for(int i:arr){
            if(i<minNum){
                minNum=i;
            }
            if(i>maxNum){
                maxNum=i;
            }
        }

        System.out.println("min: "+minNum+" "+"max: "+maxNum);
    }
}
