public class divisible
{
	static int closestNumber(int n,int m)

    {
    	int q=n/m;
    	int n1=m*q;
    	int n2=(n*m)>0?(m*(q+1)):(m*(q-1));
    	if(Math.abs(n-n1)<Math.abs(n-n2))
    		return n1;
    	return n2;
    }
    	public static void main(String args[])
    {
        int n=13, m=4;
        System.out.println(closestNumber(n,m));
          
        n=-15;m=6;
        System.out.println(closestNumber(n,m));
          
        n=0; m=8;
        System.out.println(closestNumber(n,m));
          
        n = 18; m = -7;
        System.out.println(closestNumber(n,m));
    }
}