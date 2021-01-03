package inheritance;

class Base{
	
	int basedId = 0;
	public Base() {
		System.out.println("Base class...");
	}
	
	private Base(int baseId) {
		this.basedId = 10;
	}
	private Base(int baseId, String name) {
		this.basedId = 10;
	}
	
}

class Derived extends Base{
	int derId = 10;
}

/*
class Base2{
	private Base2() {
		
	}
	public Base2(int base2Id) {
		
	}
}

class Derived2 extends Base2{
	
}
*/
/*
final class BaseFinal{
	
}

class Derived1 extends BaseFinal{
	
}
*/
public class RestrictInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
