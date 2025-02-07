import java.util.Scanner;
class Election
{
	public static void main(String[] args)
	 {
		
		Scanner sc = new Scanner(System.in);

		int bjp=0,cng=0,ss=0,aap=0,nota=0;
		System.out.print("Enter Population : ");
		int population = sc.nextInt();

		for(int i=0;i<population;i++)
		{
		System.out.println("***LIST OF PARTIES***");
		System.out.println("1.BJP");
		System.out.println("2.Congress");
		System.out.println("3.Shiv Sena");
		System.out.println("4.Aam Janta Party");
		System.out.println("5.Nota");

		System.out.print("Enter option : ");
		int op = sc.nextInt();

		if(op>=1 && op<=5){
		if(op == 1)
		{
			bjp++;
		}

		if(op == 2)
		{
			cng++;
		}

		if(op == 3)
		{
			ss++;
		}

		if(op == 4)
		{
			aap++;
		}

		if(op == 5)
		{
			nota++;
		}


		}
	

	if(!(op>=1 && op<=5))
	{
		i--;
		System.out.println("Invalid Option");
	}
	
}
	if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=nota) 
		{
			System.out.println("BJP HAS WON !!");
		}


		if(cng>=bjp && cng>=ss && cng>=aap && cng>=nota)
		{
			System.out.println("CONGRESS HAS WON !!");
		}

		if(ss>=cng && ss>=bjp && ss>=aap && ss>=nota)
		{
			System.out.println("SHIVSENA HAS WON !!");
		}

		if(aap>=cng && aap>=ss && aap>=bjp && aap>=nota)
		{
			System.out.println("AAM JANTA PARTY  HAS WON !!");
		}

		if(nota>=cng && nota>=ss && nota>=aap && nota>=bjp)
		{
			System.out.println("NOTA HAS WON !!");
		}
	
} 	
}
