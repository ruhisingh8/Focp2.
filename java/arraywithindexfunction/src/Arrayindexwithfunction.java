import java.util.*;
public class array{
	int selement;
	int counter=0;
	Scanner scan=new Scanner(System.in);
	int element[]=new int[10];
	int flag=0;

	void enterelements()
	{
	    System.out.println("enter 10 elements in array");
	    for(counter=0; counter<10;counter++)
	    {
	        element[counter]=scan.nextInt();
	    }

	}
void displayelement()
{
	System.out.println("the following elements were entered in array");
	    for(counter=0; counter<10;counter++)
	    {
	        System.out.println(element[counter]);

	    }
}
void checkelement(int aa)

{
for(counter=0; counter<10;counter++)
{if(element[counter]==selement)
    {flag=1;
    break;
}
else
{
	flag = -1;
}

}
if(flag == 1)
{
	System.out.println("elements"+element[counter]+"found at position"+(counter+1));
}
else
{
	System.out.println("elements not found"+flag);
}	
}

public static void main(String[] args)
{
	
	int selement;
	Array  aiwf= new Array();
	aiwf.enterelements();

	System.out.print("enter the element you want to find");
	Scanner scan= new Scanner(System.in);
	selement=scan.nextInt();

	aiwf.displayelement();
	aiwf.checkelement(selement);


}

}