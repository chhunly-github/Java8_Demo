@FunctionalInterface
public interface Ifunctional {
	void speak(String s);
}
class test{
	public static void main(String[] args) {
		Ifunctional i= s -> {System.out.println("speak");
		
		};
		i.speak("hello world");
		
	}
}