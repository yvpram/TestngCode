package DeclaredMethods;

import java.lang.reflect.Method;

class Main {
	public static int add(int a, int b) {
		System.out.println(a + b);
		return b + a;
	}

	public int sub(int a, int b) {
		System.out.println(b - a);
		return b - a;
	}

	private int div(int a, int b) {
		System.out.println(b / a);
		return b / a;
	}

	private int mul(int a, int b) {
		System.out.println(b * a);
		return b * a;
	}
}

public class DeclaredM {
	public static void main(String[] args) throws Exception {
		// Calling static method directly using class name
		Main.add(8, 5);

		// Calling non-static method using object instance
		Main m = new Main();
		m.sub(5, 15);

		// Prepare arguments for reflection method calls
		Object[] obje = { 15, 30 };

		// Getting all methods (including private ones)
		Method[] ma = Main.class.getDeclaredMethods();
		System.out.println("All methods:");
		for (Method oneMethod : ma) {
			System.out.println(oneMethod.getName());
		}

		System.out.println("\nInvoking methods:");
		for (Method oneMethod1 : ma) {
			oneMethod1.setAccessible(true); // Allow access to private methods
			Object result = oneMethod1.invoke(m, obje); // Pass the arguments
			System.out.println(oneMethod1.getName() + " result: " + result);
		}
		System.out.println();
		System.out.println(" private method");
		// Calling private method 'mul' using reflection
		Object[] obj = { 35, 15 };
		Method method = Main.class.getDeclaredMethod("mul", int.class, int.class);
		method.setAccessible(true);
		method.invoke(m, obj);

		// Calling private method 'div' using reflection
		Object[] object = { 3, 49 };
		Method method1 = Main.class.getDeclaredMethod("div", int.class, int.class);
		method1.setAccessible(true);
		method1.invoke(m, object);

	}
}
