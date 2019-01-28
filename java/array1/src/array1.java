import java.util.*;
class One{
	public static void main(String[] args) {
	     int selement;
	     int flag=-1;
	     int counter=0;
	     Scanner scan =new Scanner(System.in);

	     int element[]=new int[10];

	     System.out.println("enter 10 elements in array");
	     for(counter=0; counter<10;counter++)
	     {
	         element[counter]=scan.nextInt();
	     }

	System.out.println("number to search");

	    selement=scan.nextInt();

	System.out.println("the following elements were entered in array");
	    for(counter=0; counter<10;counter++) 
	    {
	        System.out.println(element[counter]);

	    }
	for(counter= 0; counter<10;counter++)
	{if(element[counter]==selement)
	    {flag=1;
	    break;
	    }
	 else
	 {
	     flag = -1;
	 }

	}
	if(flag ==1)
	{
	    System.out.println("elements"+element[counter]+"found at position"+(counter +1));
	}
	else
	{
	    System.out.println("elements not found"+flag);
	}
    }
}