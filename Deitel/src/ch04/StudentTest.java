package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("Jane Green", 93.5);
		Student student2 = new Student("John Blue", 72.75);
		
		System.out.printf("A nota do estudante %s é: %s%n",
				student1.getName(), student1.getLetterGrade());
		
		System.out.printf("A nota do estudante %s é: %s%n",
				student2.getName(), student2.getLetterGrade());
	}
}
