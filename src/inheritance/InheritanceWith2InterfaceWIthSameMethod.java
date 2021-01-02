package inheritance;

interface Printable{
	void show();
}
interface Displayable{
	void show();
}

class Publish implements Printable, Displayable{
	public void show() {
		System.out.println("Print from Publish Class child show method.");
	}
}

public class InheritanceWith2InterfaceWIthSameMethod implements Printable, Displayable{

	public void show() {
		System.out.println("Print from InheritanceWith2InterfaceWIthSameMethod Class child show method");
	}
	
	public static void main(String[] args) {
		Printable p = new InheritanceWith2InterfaceWIthSameMethod();
		p.show();
		p = new Publish();
		p.show();
	}

}
