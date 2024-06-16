class Digits
{
	public static void main(String []args){
		int num =123,sum=0,remainder;
		while(num>0){
			remainder = num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.printf("sum of the digit is %d",sum);
	}
}