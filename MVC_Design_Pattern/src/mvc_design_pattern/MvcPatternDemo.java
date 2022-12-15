package mvc_design_pattern;

public class MvcPatternDemo {
	public static void main(String[] args) {
		//fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();
		
		//create a view : to write student details on console
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		
		//update model data
		controller.setStudentName("Sudip");
		controller.updateView();
	}	
		private static Student retriveStudentFromDatabase() {
			Student student = new Student();
			student.setName("Sumit");
			student.setRollNo("10");
			return student;
		
		
	}
}
