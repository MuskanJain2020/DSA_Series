class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int n, int a[])
    {
        int max = 0;
        int max2 = -1;
        int m1 = 0;
        int m2 = 0;
        
        for (int i = 0 ; i<n; i++){
            if (a[i]>a[max]){
                max2= max;
                max = i;
            }
            if (a[i]!=a[max] ){
                 if(max2==-1||a[i]>a[max2])
           { max2=i;}
            }
              
            
            
        }if (max2 == -1){
                m2 = -1 ;}
         else{
               m2 = a[max2];
        }
        m1 = a[max];
 ArrayList<Integer> array = new ArrayList<Integer>();
 array.add(m1);
 array.add(m2);
 return array;
    }
}
