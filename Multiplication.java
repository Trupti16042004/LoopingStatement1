class Multiplication
{
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter which Table you want to print : ");
		int num = sc.nextint();

		System.out.println("Enter Range  : ");
		int range = sc.nextInt();


		System.out.println("Multiplicatio Table is :  ");

		for(i=0;i<=range;i++)
		{
			int mul = i*range ;
			System.out.println(num+ " * " +i+" = "+mul);
		}

	}
}