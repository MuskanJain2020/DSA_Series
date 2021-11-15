class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int a[], int n){
         ArrayList<Integer> ar= new ArrayList<Integer>();
         int curr_leader = a[n-1];
         ar.add(curr_leader);
         for (int i = n-2 ; i>=0 ; i--){
             if (curr_leader <= a[i]){
                 curr_leader = a[i];
                 ar.add(curr_leader);
             }
         }  
           ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = ar.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            revArrayList.add(ar.get(i));
        }
 
        // Return the reversed arraylist
        return revArrayList;
    }
 
        
    
}
