public class QuickSort {
    public static void quickSort(int[] nums, int low,int high){
        if(low<high){
            int pi=partition(nums,low,high);

            quickSort(nums,low,pi-1);
            quickSort(nums,pi+1,high);
        }
    }
    public static int partition(int[] nums,int low,int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        int temp=nums[i+1];
         nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1;

    }
    public static void main(String[] args){
        int nums[]={8,6,9,2,5,4};
        int n=nums.length;
        System.out.println("Original array");
        for(int num:nums){
             System.out.print(num+" ");
        }
         System.out.println();

       quickSort(nums,0,n-1);

        System.out.println("Final array");
        for(int num:nums){
             System.out.print(num+" ");
        }
         System.out.println();

    }
}
