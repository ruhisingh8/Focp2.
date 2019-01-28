import java.util.*;
class Additionofnum{
	int a;
	int b;
	Additionofnum(int x,int y){
	a=x;
	b=y;
}
Additionofnum(){
	a=0;
	b=0;
}
int sum(){
	return a+b;
}
}
class myadd{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int f,l,z;
		System.out.println("enter the value of a");
		f=in.nextInt();
		System.out.println("enter the value of b");
		l=in.nextInt();
		Additionofnum e1 = new Additionofnum (f,l);
		z=e1.sum();
        System.out.println("the sum is"+z);
        Additionofnum e2=new Additionofnum();
        e2.sum();
        System.out.println("the sum is"+e2.sum());

	}
}