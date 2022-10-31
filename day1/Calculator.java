package week1.day1;

public class Calculator {
	
		public void add( int num1,int num2,int num3)
	
		{
			int sum;
			sum=num1+num2+num3;
			System.out.println(sum);
			}
			public void  sub (int num1,int num2)
			
				{
					int sum1;
					sum1=num1-num2;
					System.out.println(sum1);
				}
				
			public void  mul (double num1,double num2)
			
			{
				double sum2;
				sum2=num1*num2;
				System.out.println(sum2);
			}
public void div (double num1,double num2)
			
			{
				double sum3;
				sum3=num1 / num2;
				System.out.println(sum3);
			}
public static void main(String[] args)
{
		Calculator calc=new Calculator();
	    calc.add(15,12,34);
	    calc.sub(30,15);
	    calc.mul(15.2,2.5);
	    calc.div(20.0,2.0);
	

}	




	
	}

