class Fact{
	public static void main(String []args){
	    int fact =1;
		int i=5,temp;
		temp=i;
		while(i>=1){
			fact=fact*i;
			i--;
		}
		System.out.println(temp+"!="+fact); 
		
	}
}