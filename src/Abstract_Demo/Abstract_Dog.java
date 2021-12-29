package Abstract_Demo;

public class Abstract_Dog extends Abstract_Animals{
	@Override
	public void sound() {
		System.out.println("Barking");
	}
	@Override
  public void sound_A() {
	   System.out.println("Biting");
   }
	@Override
   public void sound_B() {
	   System.out.println("Souting");
   }
   
	Abstract_Dog () {
	   System.out.println("Abstract of dog");
	}
	

	public static void main(String[] args) {
		
		Abstract_Dog obj1=new Abstract_Dog();
		obj1.display();
		obj1.sound();
		obj1.sound_A();
		obj1.sound_B();
		
		//Abstract_Animals obj2=new Abstract_Animals();
		//obj2.display();
		//obj2.sound();
		
		
		//Abstract_Animals obj3=new Abstract_Dog();
	//	obj3.display();
		//obj3.sound();
	//	obj3.
		
			
			
		
	}

}
