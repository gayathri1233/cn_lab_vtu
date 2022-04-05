import java.util.Scanner;
public class rsa
{
	public static int mult(int x,int y,int n)
	{
		int k=1;
		int j;
		for (j=1;j<=y;j++)
		k=(k*x)%n;
		return k;
	}
	public static int gcd(int m,int n)
	{
		if(n==0)
		return m;
		else
		return(gcd(n,m%n));
	}
	public static void main(String[] args)
	{
		int msg,plaintext,ciphertext;
		int n,d=0,e,z,p,q,i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value of prime p and q");
		p=scanner.nextInt();
		q=scanner.nextInt();
		System.out.println("enter the mesage");
		msg=scanner.nextInt();
		n=p*q;
		z=(p-1)*(q-1);
		do
		{
		System.out.println("choose the value of e such that gcd(z,e)=1");
		e=scanner.nextInt();
		
	}
	while(gcd(z,e)!=1);
	i=2;
	while(((i*e)%z)!=1)
	{
		i++;
		d=i;
	}
	System.out.println("public key is("+e+","+n+")");
	System.out.println("private key is("+d+","+n+")");
	ciphertext=mult(msg,e,n);
	System.out.println("ciphertext="+ciphertext);
	plaintext=mult(ciphertext,d,n);
	System.out.println("plaintext="+plaintext);
    scanner.close();
	}
    
}

