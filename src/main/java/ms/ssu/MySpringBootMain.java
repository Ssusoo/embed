package ms.ssu;

import ms.ssu.boot.MySpringApplication;
import ms.ssu.boot.MySpringBootApplication;

@MySpringBootApplication
public class MySpringBootMain {

	public static void main(String[] args) {
		System.out.println("MySpringBootMain.main");
		MySpringApplication.run(MySpringBootMain.class, args);
	}
}
