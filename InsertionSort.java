public class InsertionSort{
     public static void main(String[] args){
    int nums[]={8,6,9,2,5,4};
    int n=nums.length;
     System.out.println("Original array");
        for(int num:nums){
             System.out.print(num+" ");
        }
         System.out.println();

     System.out.println("Sorting:");
    for(int i=1;i<n;i++){
        int key=nums[i];
        int j=i-1;
        
        while(j>=0&&nums[j]>key){
            
            nums[j+1]=nums[j];
            j=j-1;
        }
        nums[j+1]=key;
    
        for(int num:nums){
             System.out.print(num+" ");
        }
         System.out.println();
    }

     System.out.println("Final array");
        for(int num:nums){
             System.out.print(num+" ");
        }
         System.out.println();

}
}