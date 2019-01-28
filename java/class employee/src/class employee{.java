class employee{
	String firstName;
	String lastName;
	double salary;
	employee(String fn, String ln, double d){
	   firstName=fn;
	   lastName=ln;
	   salary=d;
	}
	double yr_sal(){
	    return salary*12;
	}
       double salRaise(){
           salary=salary*0.1;
       }
       void displayEmp(){
        System.out.println("First Name:"+firstName);
        System.out.println("LastName:"+lastName);
        System.out.println("Salary:"+salary);
       }
}
class emp_main{
        public static void main(String [] args){
	        Scanner in = new Scanner(System.in);
	        String f,l;
	        double s;
	        System.out.print("Enter first name:");
	        f = in.next();
	        System.out.print("Enter last name:");
	        l = in.next();
	        System.out.print("Enter salary:");
	        do{
	        s = in.nextDouble();
	        if(s<0){
	            System.out.println("Salary is a positive quantity, please enter again:");
	            }
	            }
	            while(s>0);
	            employee el= new employee(f,l,s);
	            el.displayEmp();
		   }

}
