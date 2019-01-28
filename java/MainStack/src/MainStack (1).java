import java.util.*;
class MainStack{
	
	public static void main ( String[] args){
   Stack s1= new Stack();
   int c,z;
   Scanner in = new Scanner(System.in);
	do{
	System.out.println("1. Enter push for insertion \n 2. pop for deletion  \n 3. for checking empty status \n 4. for checking Full Status");
	System.out.println("ENTER YOUR CHOICE ");
	c = in.nextInt();
	switch(c)
	{
	case 1 :
	System.out.println("Enter a new value ");
	z=in.nextInt();
	s1.push(z);
	break;

	case 2 :
	s1.pop();
	break;

	case 3 :
	System.out.println(s1.isEmpty());
	break;

	case 4 :
	System.out.println(s1.isFull());
	break;

	case 5 :
	System.out.println(s1.spaceLeft());
	break ; 
	default:
	System.out.println(" Enter the correct choice ......");

	}

	}while(c!=6);
	}

}