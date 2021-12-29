package pkgAccess_1;

public class ClassA_Access {
	
	public int i=20;
	
	public ClassA_Access(){
		System.out.println("Print class");
	}
	
	public void display(){
		System.out.println("Print");
	}
	public static void main(String[] args) {
		ClassA_Access obj1=new ClassA_Access();
		System.out.println(obj1.i);
		obj1.display();
		
		
		

	}

}
