static long trappingWater(int a[], int n) { 
        int l =0 ;
        int h = n-1;
        int lmax =0;
        int hmax =0;
        int i =1;
        long sum = 0;
        
        while (l<=h){
        if (a[l]<=a[h]){
            if (a[l]>=lmax){
                lmax = a[l];
                l++;
            }
            else{
               sum = sum + lmax - a[l] ;
               l++;
            }}
            else{
                if (a[h]>=hmax){
                hmax = a[h];
                h--;
            }
            else{
               sum = sum + hmax - a[h] ;
               h--;
            }
            }
            
        }return sum ;
    } 
}
