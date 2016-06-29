package StreamWithCollection;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Model.Student;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		
		students.add(new Student(01,"Vatana","female",20,94));
		students.add(new Student(02,"Lina","female",19,89));
		students.add(new Student(03,"Chantha","male",22,96));
		students.add(new Student(04,"Panha","female",23,95));
		students.add(new Student(05,"Vichera","male",21,90));
		students.add(new Student(06,"Chhayha","male",18,91));
		students.add(new Student(07,"Bunna","male",24,87));
		
		
		/*---------------------------traversing collections with stream----------------------*/
		Predicate<Student> studentPred=st->st.getAge()>21;
		System.out.println("Students which are older than 21 are:");
		students.stream().filter(studentPred).forEach(st->System.out.println(st.toString()));
		
		System.out.println();
		System.out.println("The top 1 student of students which older than 21 is:");
		System.out.println(students.stream().filter(studentPred).max(Student::scoreCompare).get().toString());
		
		System.out.println();
		System.out.println("The first student in sorted list by name:");
		System.out.println(students.stream().sorted(Student::nameCompare).findFirst().get().toString());
		
		
		/*---------------------------creating stream from collection----------------------*/
		System.out.println();
		IntStream is = students.stream().mapToInt(st->st.getAge());
		System.out.println("The stream contains with students age:");
		is.forEach(age->System.out.println(age));
		
		System.out.println();
		System.out.println("The stream with all students which are female:");
		Stream<Student> o=students.stream().filter(student->student.getSex().equalsIgnoreCase("female"));
		o.forEach(student->System.out.println(student.toString()));
	}
}
