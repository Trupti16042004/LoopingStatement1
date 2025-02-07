import java.util.Scanner;
class Vowel_From_Username 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String name = sc.next().toLowerCase();

		System.out.println("Name is : "+name );
		int i;
		int len = name.length();
		for(i=0;i<len;i++)
		{

			char nm = name.charAt(i);

		if(nm=='a'||nm=='e'||nm=='i'||nm=='o'||nm=='u')
		{
			System.out.print(nm+" ");
		}
}	}
}