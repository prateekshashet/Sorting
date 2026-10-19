public class SelectionSort {
    public static void main(String[] args){
        int nums[]={8,6,9,2,5,4};
        int n=nums.length;
        System.out.println("Original array");
        for(int num:nums){
             System.out.print(num+" ");
        }
         System.out.println();


         //logic
         int temp=0;
         int minIndex=-1;

        
         //applying the sorting logic
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    minIndex=j;
                }
            }
         }

            System.out.println("After Sorting:");
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
    }
}
