package variablesBlockMethod;

public class Constructor_Demo2 {
	
	int slNo;
	String studentName;
	String studentClass;
	
	Constructor_Demo2(String a,String b){
		studentClass=a;
		studentName=b;
		
	}

	public void printname() {
		System.out.println("Student name is "+studentName+" and student class is  "+studentClass);
	}
	public static void main(String[] args) {
		
		Constructor_Demo2 x=new Constructor_Demo2("A Section", "Raja");
		Constructor_Demo2 y=new Constructor_Demo2("A Section", "Roja");
		Constructor_Demo2 z=new Constructor_Demo2("A Section", "Vinoth");
		Constructor_Demo2 f=new Constructor_Demo2("B Section", "Vijay");
		Constructor_Demo2 h=new Constructor_Demo2("C Section", "Ajay");
		x.printname();
		y.printname();
		z.printname();
		f.printname();
		h.printname();
		
	}

}