class Power
{
	public static void main(String []args){
		int firstNum,secondNum,pow=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first num");
		firstNum=Scanner.nextint();
        System.out.println("Enter the second num");
        secondNum=scanner.nextint();
        while(secondNum>0){
        	pow=pow*firstNum;
        	SecondNum--;
        }
        System.out.println("The result of the Sum is "+pow);

		}

	}
