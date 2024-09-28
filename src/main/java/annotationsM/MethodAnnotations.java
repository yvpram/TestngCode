package annotationsM;

import java.lang.reflect.Method;

public class MethodAnnotations {
	@AnnotationsMethod(text1 = "ram",text2 = "chintu")
	public void concat() throws Exception {
	Method	concatMethod=MethodAnnotations.class.getMethod("concat");
		AnnotationsMethod annotationsMethod=concatMethod.getAnnotation(AnnotationsMethod.class);
		System.out.println(annotationsMethod.text1()+annotationsMethod.text2());
	}
	public static void main(String[] args) throws Exception {
		MethodAnnotations m= new MethodAnnotations();
		m.concat();
	}
}
