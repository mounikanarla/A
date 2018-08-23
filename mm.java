import java.util.Scanner;

public class primeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, i,flag=0;
		Scanner s= new Scanner(System.in);
		System.out.println(" enter the no");
		n=s.nextInt();
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}
		// TODO Auto-generated method stub

	}

}
