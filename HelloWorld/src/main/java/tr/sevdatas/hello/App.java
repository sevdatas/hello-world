package tr.sevdatas.hello;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Greeter> list = new ArrayList<Greeter>();

		Greeter helloGreeter = new GreeterHelloImpl();
		Greeter heyGreeter = new GreeterHeyImpl();
		Greeter hiGreeter = new GreeterHiImpl();

		list.add(helloGreeter);
		list.add(heyGreeter);
		list.add(hiGreeter);

		for (Greeter i : list) {
			i.greet();
		}
	}
}
