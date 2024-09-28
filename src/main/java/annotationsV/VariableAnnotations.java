package annotationsV;

import java.lang.reflect.Field;

public class VariableAnnotations {
	@AnnotationsVariable( data = "ram", data1 = "chintu")
	public String str;
	public static void main(String[] args) throws Exception {
		Field StringVar=	VariableAnnotations.class.getField("str");
		AnnotationsVariable	annotationsVariable=	StringVar.getAnnotation(AnnotationsVariable.class);
		System.out.println(annotationsVariable.data());
		System.out.println(annotationsVariable.data1());
	}

}
