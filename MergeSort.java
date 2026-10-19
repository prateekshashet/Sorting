public class MergeSort {
    public static void mergesort(int nums[],int low,int high){
        if(low<high){
        int mid=(low+high)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,high,mid);
        }
    }
    public static void merge(int nums[],int low,int high,int mid){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int x=0;x<n1;x++){
            left[x]=nums[low+x];
        }

        for(int x=0;x<n2;x++){
            right[x]=nums[mid+1+x];
        }


        int i=0;
        int j=0;
        int k=low;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                nums[k]=left[i];
                i++;
            }
            else{
                nums[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k]=left[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k]=right[j];
            j++;
            k++;
        }

    }
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
        
         mergesort(nums,0,n-1);

            System.out.println("After Sorting:");
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
    }
}
