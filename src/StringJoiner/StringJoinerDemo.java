package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",","[","]");
		
		System.out.println(sj);
		
		sj.setEmptyValue("Empty Value");
		System.out.println(sj);
		
		sj.add("John");
		sj.add("Tom");
		sj.add("Sokha");
		sj.add("Vichera");
		System.out.println(sj);
		
		
		
	}
}
