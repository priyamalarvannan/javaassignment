package week1.day1;

public class Mobile {
	String mobileModel="oneplus";
	float mobileWeight=3.5f;
	boolean isFullCharged=true;
	int mobileCost=35000;
		
public void makeCall()
{
System.out.println("this is my mobile");

}
public void sendMsg() 
{

	System.out.println("this is my new mobile");

}
public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.makeCall();
	mob.sendMsg();
	
}
}