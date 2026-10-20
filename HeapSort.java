public class HeapSort{
    public static void heapify(int[] nums,int n,int i){
       
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n&&nums[largest]<nums[left]){
            largest=left;
        }
        if(right<n&&nums[largest]<nums[right]){
            largest=right;
        }

        if(largest!=i){
            int temp=nums[largest];
            nums[largest]=nums[i];
            nums[i]=temp;

            heapify(nums,n,largest);
        }
    }
    public static void buildHeap(int[] nums, int n) {
    // Start from the last non-leaf node
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(nums, n, i);
    }
}
public static void heapSort(int[] nums) {
    int n = nums.length;

    // Step 1: Build a max heap
    buildHeap(nums, n);

    // Step 2: Extract the maximum repeatedly
    for (int i = n - 1; i > 0; i--) {

        // Swap root (maximum) with the last element
        int temp = nums[0];
        nums[0] = nums[i];
        nums[i] = temp;

        // Restore the max heap, excluding sorted elements
        heapify(nums, i, 0);
    }
}
    public static void main(String[] args){
        int nums[]={8,6,9,5,2,3};
        int n=nums.length;
        System.out.println("After Sorting:");
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();

        heapSort(nums);
        System.out.println("After Sorting:");
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
    }
}