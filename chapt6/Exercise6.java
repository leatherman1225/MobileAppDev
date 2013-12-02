public class Exercise6 {
   public static void main(String[] args) {
	System.out.println(prod(1, 2));
}
   public static int prod(int m, int n) {
	 if (m == n) {
	   return n;
	}else{
	   int recurse = prod(m, n-1);
	   int result = n * recurse;
	   return result;
	}
   }
}
// Prod multiplies each integer by each number (1*3, 1*2, 1*1)
