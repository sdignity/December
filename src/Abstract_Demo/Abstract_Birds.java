package Abstract_Demo;

public class Abstract_Birds extends Abstract_Dog {
	@Override
	public void sound() {
		System.out.println("flying");
	}

	@Override
	public void sound_A() {
		System.out.println("Eating nuts");
	}

	@Override
	public void sound_B() {
		System.out.println("Fast digestive system");
	}
	
	public static void main(String[] args) {
		Abstract_Birds obj6=new Abstract_Birds();
		obj6.sound();
		obj6.sound_A();
		obj6.sound_B();
		
	}
}
