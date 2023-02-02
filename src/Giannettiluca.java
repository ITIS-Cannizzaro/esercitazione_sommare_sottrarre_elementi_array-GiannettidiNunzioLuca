import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Giannettiluca
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
				es1();
					break;
				case 2:
				es2();
				break;
				case 3:
					es3();
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n.1 * - Titolo es. *somma pari e sottrazioni dispari");
		System.out.println("1 - Es n.2 * - array al contrario");
		System.out.println("1 - Es n.3 * - array DI stringhe al contrario");
	}
	
	
	
	
	
	
	static void es1()
		{
		System.out.println("inserire la lunghezza dell'array");
		int[] valori=new int[Integer.parseInt(in.nextLine())];		
		int somma=0;
		int differenza=0;
		for(int i=0;i<valori.length;i++)
			{
				System.out.println("inserire  numero");
				valori[i]=Integer.parseInt(in.nextLine());
			}
			differenza=valori[1];
		for (int i=0;i<valori.length;i++)
		
			{
			
				if (i % 2 == 0 || i==0)
				{
					 somma+=valori[i];
				}
			}
				for (int i=2;i<valori.length;i++)
					
				{
				
					
					if (i % 2 != 0 )
					{
						 differenza-=valori[i];
						 
					}
					 
				}
				System.out.println("la sottrazione e la somma sono"+differenza+"e"+somma);
		}
		

	static void es2()
	{
		int[] valori=new int[7];
	
		for(int i=0;i<valori.length;i++)
		{
			System.out.println("inserire  numero");
			valori[i]=Integer.parseInt(in.nextLine());
			
		}
	  swap(valori);
	  
	  for(int i=0;i<valori.length;i++)
		  System.out.println(valori[i]);
	}
	static void es3()
	{
		String[] parole=new String[7];
	
		for(int i=0;i<parole.length;i++)
		{
			System.out.println("inserire  parola");
			parole[i]=in.nextLine();
			}
		 swapS(parole);
		  
		  for(int i=0;i<parole.length;i++)
			  System.out.println(parole[i]);
		}
		
 static void swap(int[]array)	
 {
	 int temp;
	 for(int i=0,j=6;i<4;i++,j--)
	 {
		 temp=array[j];
		 array[j]=array[i];
		 array[i]=temp;
	 }
 }
	 static void swapS(String []array)	
	 {
		 String temp;
		 for(int i=0,j=6;i<4;i++,j--)
		 {
			 temp=array[j];
			 array[j]=array[i];
			 array[i]=temp;
 }
     }
}


		
