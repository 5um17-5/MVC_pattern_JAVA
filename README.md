# MVC_pattern_JAVA
Java MVC pattern 

MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate
application's concerns.

#### Model - Model represents an object or JAVA POJO carrying data. It can also have logic to
update controller if its data changes.

#### View - View represents the visualization of the data that model contains.

#### Controller - Controller acts on both model and view. It controls the data flow into model

object and updates the view whenever data changes. It keeps view and model separate.

## Implementation
We are going to create a Student object acting as a model.StudentView will be a view class which
can print student details on console and StudentController is the controller class responsible to
store data in Student object and update view StudentView accordingly.
MVCPatternDemo, our demo class, will use StudentController to demonstrate use of MVC pattern.

![image](https://user-images.githubusercontent.com/42840869/207929811-02facbe6-0ad6-4045-b719-72e3cc6c5dc6.png)

Step 1
Create Model.
```
Student.java
public class Student {
private String rollNo;
private String nam e;
public String getRollNo() {
return rollNo;
}
public void setRollNo(String rollNo) {
this.rollNo = rollNo;
}
public String getNam e() {
return nam e;
}
public void setNam e(String nam e) {
this.nam e = nam e;
}
}
```

Step 2
Create View.
```
StudentView.java
public class StudentView {
public void printStudentDetails(String studentNam e, String studentRollNo){
System .out.println("Student: ");
System .out.println("Nam e: " + studentNam e);
System .out.println("Roll No: " + studentRollNo);
}
}
```

Step 3
Create Controller.
```
StudentController.java
public class StudentController {
private Student m odel;
private StudentView view;
public StudentController(Student m odel, StudentView view){
this.m odel = m odel;
this.view = view;
}
public void setStudentNam e(String nam e){
m odel.setNam e(nam e);
}
public String getStudentNam e(){
return m odel.getNam e();
}
public void setStudentRollNo(String rollNo){
m odel.setRollNo(rollNo);
}
public String getStudentRollNo(){
return m odel.getRollNo();
}
public void updateView(){
view.printStudentDetails(m odel.getNam e(), m odel.getRollNo());
}
}
```

Step 4
Use the StudentController methods to demonstrate MVC design pattern usage.
```
MVCPatternDemo.java
public class MVCPatternDem o {
public static void m ain(String[] args) {
//fetch student record based on his roll no from the database
Student model = retriveStudentFrom Database();
//Create a view : to write student details on console
StudentView view = new StudentView();
StudentController controller = new StudentController(m odel, view);
controller.updateView();
//update m odel data
controller.setStudentNam e("John");
controller.updateView();
}
private static Student retriveStudentFrom Database(){
Student student = new Student();
student.setNam e("Robert");
student.setRollNo("10");
return student;
}
}
```

Step 5
Verify the output.
```
Student:
Nam e: Robert
Roll No: 10
Student:
Nam e: John
Roll No: 10
```
