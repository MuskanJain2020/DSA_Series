class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here 
        int
        x=Integer.MAX_VALUE;
       for(int i = 0 ;i<n-1 ;i++)
       {
             x= Math.min(x, Math.abs(arr[i] - arr[i+1]) );
       }
       return Math.min(x,Math.abs(arr[n-1] -arr[0]));


        
    }
}

