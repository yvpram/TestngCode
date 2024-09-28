package annotationsC;

@AnnotationsClass(value2 = 555,value1 = 7898)
public class ClassLeaveAnnotation {

	public static void main(String[] args) {
		AnnotationsClass annotationsClass =ClassLeaveAnnotation .class.getAnnotation(AnnotationsClass.class);
		System.out.println(annotationsClass.value1());
		System.out.println(annotationsClass.value2());
	}

}
