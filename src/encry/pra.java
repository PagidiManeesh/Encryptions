package encry;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;


public class pra {
	public static void main(String ar[])
	{
 
	Scanner sc = new Scanner(System.in); 
	int m_iBitSize = sc.nextInt();
	BigInteger m_cBiPrimeP = BigInteger.probablePrime(m_iBitSize, new Random());
	System.out.println(m_cBiPrimeP);
	BigInteger m_cBiPhiN = m_cBiPrimeP.add(BigInteger.valueOf(2));
	System.out.println(m_cBiPhiN);
	int pqrs = m_cBiPrimeP.compareTo(m_cBiPhiN);
	
	System.out.println(pqrs);
	System.out.println("big"+BigInteger.ONE);
}
}
