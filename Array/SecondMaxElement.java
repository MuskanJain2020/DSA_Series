public class SecondLargestElem {

	public static void main(String[] args) {
		int [] a = {1 , 4 , 5 , 6 ,9};
		int max1 = a[1];
		int max2 = -1 ;
		for (int i = 0 ; i<a.length ; i++) {
			if (a[i]>= max1) {
				max2 = max1;
				max1 = a[i];
			}
			if (a[i]< max1 && a[i]> max2) {
				max2 = a[i];
				
			}
			
			
		}System.out.println(max2);

	}

}
