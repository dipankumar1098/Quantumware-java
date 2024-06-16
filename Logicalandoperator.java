class Logicalandoperator{
	public static void main(String []args){
		int a=50;
		int b=60;
		int c=70;

		float d=5.5f;
		float e=7.7f;

		double cv=10.20;
		double mn=30.40;

		System.out.println(d<e&a>c&b>a);
		System.out.println(mn>cv&a>b);
		System.out.println(cv<mn&a<b);
		System.out.println(e<d&c<b);
	
		
	}
}