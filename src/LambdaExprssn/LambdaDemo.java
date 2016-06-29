package LambdaExprssn;

import Interfaces.ISpeakable;
import Model.Student;

public class LambdaDemo {
	public static void main(String[] args) {
		Student st=new Student(90, "nara", "male", 22, 90);
		
		/*------------------------------using anonymous function(lambda expression)-----------------*/
		ISpeakable ifun=(s) -> {System.out.println(s);};
		ifun.speak(st.toString());
		
		/*------------------------------using anonymous class-----------------*/
		ISpeakable ispeak=new ISpeakable() {
			@Override
			public void speak(String s) {
				System.out.println(s);
			}
		};
		ispeak.speak(st.toString());
	}
}

