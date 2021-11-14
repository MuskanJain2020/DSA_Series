public class RemoveDuplicates {
	
	
	public static void remove(int a[], int n) {
		int res = 1;
		for (int i = 1 ; i<a.length ; i++) {
			  if (a[i]!= a[i-1]) {
				  a[res] = a[i];
				  res++;
			  }}
			  for (int k = 1 ; k<res ; k++) {
				  System.out.print(a[k] + " ");
			  }
			
		
			
			
		}
		
	

	public static void main(String[] args) {
		int a [ ] = {10, 20,20,20,30,30,50,50};
		remove(a,a.length);

	}

}
