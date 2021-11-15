
public class LeftRotateAnArrayByd {
        public static void reverse(int a[], int n ,  int l) {
        	int temp = 0;
        	for (int i=l ; i<=n/2 ; i++) {
        		temp = a[i];
        		a[i] = a[n-1];
        		a[n-1]= temp;
        		
        	}
        	
        	
        	
        }
        
        public static void print(int a[], int n ,int d) {
        	
        	reverse(a ,n,  d );
        	reverse(a , d-1,  0);
        	
        	reverse(a , n  , 0);
        	for (int i=0 ;i<n ; i++) {
        		System.out.print(a[i] + " ");
        	}
        }
