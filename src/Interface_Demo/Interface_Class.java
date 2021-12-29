package Interface_Demo;

public class Interface_Class implements Interface_A, Interface_B{
    @Override
	public void name() {
		System.out.println("My name is "+ name);
	}
	@Override
	public void age() {
		System.out.println("My age is "+ age);
		
	}

	@Override
	public void mobile() {
		System.out.println("My mobile no is "+1245698);
		
	}

	@Override
	public void country() {
		System.out.println("My country UK");
		
	}

	@Override
	public void address() {
		System.out.println("My address is 339/A,South street");
		
	}
		
			
	@Override
	public void postoffice() {
			System.out.println("My post office is "+post);
			
	}
	@Override
	public void pin() {
		System.out.println("My pin no is "+x);
			
	}
	@Override
	public void district() {
			System.out.println("My district is "+district);
			
	}
	@Override
	public void State() {
		System.out.println("My state is "+state);
			
	}
		public static void main(String[] args) {
			Interface_A obj9=new Interface_Class();
			Interface_Class obj10=new Interface_Class();
		
			obj9.name();
			obj9.age();
			obj9.mobile();
			obj9.country();
			obj9.address();
			obj10.postoffice();
			obj9.
			obj10.pin();
}

}