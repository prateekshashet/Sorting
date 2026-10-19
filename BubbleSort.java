
public class BubbleSort {
    public static void main(String[] args){
        int nums[]={8,6,9,2,5,4};
        int n=nums.length;
        System.out.println("Original array");
        for(int num:nums){
             System.out.print(num+" ");
        }
         System.out.println();

        System.out.println("Sorting steps:");
         //applying the sorting logic
         for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
            }

            System.out.println("After Sorting:");
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
    }
}
