package annotationsCMV;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

@NewAnnotationClass(firstname = "vara prasad ram", lastname = "yanamalamanda")
public class NewAnnotationsCMV {
	@NewAnnotationsVaribles(food = "curd rice", drink = "lashe")
	public String foods;

	public void classLevel() {
		NewAnnotationClass cLevel = NewAnnotationsCMV.class.getAnnotation(NewAnnotationClass.class);
		System.out.println(cLevel.firstname());
		System.out.println(cLevel.lastname());
	}

	@NewAnnotationsMethod(collge = "Qis", section = "mechanical")
	public void metodLevel() {
		try {
			Method methods = NewAnnotationsCMV.class.getMethod("metodLevel");
			NewAnnotationsMethod mLevel = methods.getAnnotation(NewAnnotationsMethod.class);
			System.out.println(mLevel.collge());
			System.out.println(mLevel.section());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void varibleLevel() {
		try {
			Field varible = NewAnnotationsCMV.class.getField("foods");
			NewAnnotationsVaribles vLevel = varible.getAnnotation(NewAnnotationsVaribles.class);
			System.out.println(vLevel);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		NewAnnotationsCMV cmv = new NewAnnotationsCMV();
		cmv.classLevel();
		cmv.metodLevel();
		cmv.varibleLevel();

	}
}
