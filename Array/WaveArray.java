class Solution{

    
    public static void convertToWave(int a[], int n){
        int temp = 0;
    for (int i=1 ;i<n ;i= i+2) {
      temp = a[i-1];
      a[i-1] = a[i];
      a[i] = temp ;
        
    }
    
}}
