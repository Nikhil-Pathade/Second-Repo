
public class Addtiontwono {
	public int addition () {
		int a = 5;
		int b = 6;
		int c;
		c = a + b ;
		System.out.println("Addtion of two number is : " + c);
		return c ;
		
	}
	public int subtraction () {
		int x = 10;
		int y = 5;
		int z ;
	     z = x - y;
	     System.out.println("Subtraction of two number is : "+z);
	     return z;		
	}
	public int  multiplication () {
		int i = 5 ;
		int j = 10;
		int k;
		k = i*j;
		System.out.println("Multiplictaion of two number is : " + k);
		return k ;

	}
	public int  division () {
		int i = 5 ;
		int j = 10;
	     int  k;
		k = i/j;
		System.out.println("division of two number is : " + k);
		return k ;

	}
	public void totalAndAvg () {
		
		int sub1 = 50;
		int sub2 = 60 ;
		int sub3 = 70 ;
		int sub4 = 80 ;
		int sub5 = 90 ;
		int total = sub1 +sub2 +sub3 + sub4 + sub5 ;
		System.out.println("Total of five subject " + total);
		int avg = total/5;
		System.out.println("Avrage of five subject : " + avg );
		
	}
	public   static void main(String[] args) {
		Addtiontwono Niks = new Addtiontwono();
		Niks.addition();
		Niks.subtraction();
		Niks.division();
		Niks.multiplication();
		Niks.totalAndAvg();
		
		
	}

}
