package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2;i<n;i++)
	{

			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
	}
	
	
}

}