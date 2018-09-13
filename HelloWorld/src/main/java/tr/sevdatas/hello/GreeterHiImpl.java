package tr.sevdatas.hello;

public class GreeterHiImpl implements Greeter, Welcomer{

	public void greet() {
		System.out.println("Hi World");
	}

	public void welcome() {
		System.out.println("Welcome World");
	}
}
