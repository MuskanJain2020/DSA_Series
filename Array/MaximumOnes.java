public class MaximumOnes {

	public static void One (int a[], int n) {
        int maxvalue = 0 ;
        int count = 0;
        for (int i=0 ; i<n ; i++) {
        	if (a[i] == 1) {
        		count++;
        	}
        	else if (a[i]!=1) {
        		maxvalue = Math.max(maxvalue, count);
        		count = 0 ;
        	}
        }maxvalue = Math.max(maxvalue, count);
        System.out.println(maxvalue);
	}
	
	
	
	
	
	public static void main(String[] args) {
		int a[] = { 1,1,1,1,1,1,1,0,0,0,1,1,0,0,1,1,1};
		One(a,a.length);

	}

}
