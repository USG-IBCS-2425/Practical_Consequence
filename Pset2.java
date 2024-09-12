class Pset2 {
	public static void main(String[] args) {
		String name = "Abigail Chen";
		String date = "09/09/24";
		System.out.println(name);
		System.out.println(date);
		System.out.println();
		System.out.println();

		int students = 5;
		System.out.println(students + " students in our class");
		System.out.println("A new student is enrolled in the class");
		students++;
		System.out.println(students + " students in our class");

// Not sure how to do the length one

		if (students < 4) {
			System.out.println("Class is canceled");
		} else {
			System.out.println("Class will continue");
		}
		
		if (students % 3 == 0) {
			System.out.println("The number of groups created will be " + (students / 3));
		} else {
			int studentsNeeded = 3 - (students % 3);
			System.out.println("Cannot divide into 3 equal groups");
		}
	}
}