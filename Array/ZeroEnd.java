public class ZeroEnd {

	public static void moveZero(int a[], int n){
		int count = 0;
		int temp = 0;
		for (int i = 0 ; i<n ; i++) {
			
		
			  if (a[i]!= 0) {
				  temp = a[i];
				  a[i] = a[count];
				  a[count] = temp;
				  count++;
			  }
		
		}for (int i = 0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int a [ ] = {10, 0,20,0,30,0,0,50};
		moveZero(a,a.length);


	}

}
