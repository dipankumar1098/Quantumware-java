class Mixoperator{
	public static void main (String args[]){
		int a=100;
		int b=200;
		 System.out.println(a++);
		 System.out.println(b+a);
		 System.out.println(a>b);
		 System.out.println(b>a&a<b);
		 System.out.println(a<b&&a>b);
		 System.out.println(a++>b|a<b);
		 System.out.println(a>b||b<a);
		 if(a>b){
		 	System.out.println(a);

		 }
		 else{
		 	System.out.println(b);
		 }
	}
}