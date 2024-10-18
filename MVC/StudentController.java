// Acts as an intermediary between the Model and the View. Contains references to the Model and View objects.
//  Provides methods to update the Model (e.g., setStudentName, setStudentRollNo) and to update the View (updateView)

public class StudentController {
    
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentNamefinal(String studentNameIn){
        model.setStudentName(studentNameIn);
    }

    public String getStudentName(String studentNameIn){
        model.setStudentName(studentNameIn);
        return model.getStudentName();
    }

    public void setStudentNofinal(String studentNoIn){
        model.setStudentName(studentNoIn);
    }

    public String getStudentNo(String studentNoIn){
        model.setStudentName(studentNoIn);
        return model.getStudentNo();
    }

    public void updateView(){
        view.studentPageview(model.getStudentName(), model.getStudentNo());
    }
}
