
public class Parent {

	protected   void override(){
		System.out.println("Parent");
	}
	
	public void dummy(){
		System.out.println("dummy parent");
		override();
	}
	
	class Outer{
		class Inner{
			static final int i=10;
		}
	}
}
