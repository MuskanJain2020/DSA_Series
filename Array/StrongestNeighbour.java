class StrongestNeighbour{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int n, int a[]){
        for (int i =0 ; i<n-1; i++){
            System.out.print(Math.max(a[i] , a[i+1]));
            System.out.print(" ");
        }
        
    }
}
