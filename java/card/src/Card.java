import java.util.* ;
class Card {
String value ;
Card(String c){
	value = c ;
}
String getDescription(){
	String s1 =" ", s2 = " ";
	char l = value.charAt(0);
	char r = value.charAt(1);

	if(l=='Q'){
	s1="Queen";
	}
	if(l=='A'){
	s1 = "Ace";
	}
	if(l=='K'){
	s1="King";
	}
	if(r=='H'){
	s2="Hearts";
	}
	if(r=='D'){
	s2="Diamonds";
	}
	if(r=='S'){
	s2="Spades" ;

	}
	if(r=='C')
	s2 = "Clubs";
	return(s1+" of "+s2);

}
}
class Card_main{
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	String x ;

	System.out.println("enter a string of required format");
	x=in.next();
	Card c1 = new Card(x);
	System.out.println(c1.getDescription());
	}
}