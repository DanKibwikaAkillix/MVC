// Represents the data (student’s name and roll number) and provides methods to access and modify this data.

class StudentModel{

    private String studentNo;
    private String studentName;

    public String  getStudentNo(){
        return studentNo;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

}