package LambdaExprssn;

import Model.Student;

public class LambdaDemo {
	public static void main(String[] args) {
		Student st=new Student(90, "nara", "male", 22, 90);
		
		Ifunctional ifun=(s) -> {System.out.println(s);};
		ifun.speak(st.toString());
		
		Ifunctional ifun2=new Ifunctional() {
			
			@Override
			public void speak(String s) {
				System.out.println(s);
			}
		};
		ifun2.speak(st.toString());
	}
}
@FunctionalInterface
interface Ifunctional {
	void speak(String s);
}
