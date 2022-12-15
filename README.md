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
