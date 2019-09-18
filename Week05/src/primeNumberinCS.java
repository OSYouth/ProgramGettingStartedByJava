//计算机思维的构造素数数组
public class primeNumberinCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] is_prime = new boolean[100];
		for(int i=2; i<is_prime.length; i++)
		{
			is_prime[i] = true;
		}
		for(int i=2; i<is_prime.length; i++)
		{
			if( is_prime[i] )
			{
				for(int k=2; k*i<is_prime.length; k++)
				{
					is_prime[k*i] = false;					
				}
			}
		}
		for(int i=2; i<is_prime.length; i++)
		{
			if(is_prime[i])
			{
				System.out.print(i+" ");
			}
		}

	}

}
