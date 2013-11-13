class Multadd {

	public static void main(String [] args){
		double x = multadd(1.0, 2.0, 3.0);
		double n = multadd(1.0, 2.0, 3.0);
		 System.out.println("5 =="+ x);
		 System.out.println(multadd(Math.sin(Math.PI/4), Math.cos(Math.PI/4)/2));
		 System.out.println(multadd(Math.log(10), Math.log(20)));
		 System.out.println(yikes(multadd(x*n*Math.exp(-x), Math.sqrt(1-n*Math.exp(-x)))));
//		 System.out.println("test");
}
	public static double multadd(double a, double b, double c){
		return a*b + c;

 }
	public static void yikes(double d) {
	//  Math.sin();
	//  Math.cos();
	//  Math.log();
	double n;
	double x;
	 n = 1.0;
	 x = 2.0;
	 System.out.println(multadd( n, x));
        }
	public static double multadd(double a, double b) {
		return a + b;
        }
}
