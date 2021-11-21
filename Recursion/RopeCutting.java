public class RopeCutting {
	
	public static int cutting (int n , int a ,int b , int c) 
	{int res = 0;
	      if (n== 0) {
	    	  return 0 ;
	      }
	      if (n<0) {
	    	  return -1;
	      }
	      res = Math.max(cutting(n-a,a,b,c),
	    		  Math.max ( cutting(n-b, a,b,c),
	    		  cutting(n-c,a,b,c)
	    		  ));
	      
	      if(res<0) {
	    	  return -1;
	      }
	      
	      return res+1;
	}
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(cutting(22,11,10,7));

	}

}
