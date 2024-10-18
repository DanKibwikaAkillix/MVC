public class StudentPage {
   
        public static void main(String[] args){

            StudentModel modelData =  retrieveStudentFormatData();
            StudentView viewData = new StudentView();

            StudentController controller = new StudentController(modelData, viewData);

            controller.updateView();
            controller.setStudentNamefinal("Dan Kibwika");
            controller.updateView();
        }

        private static StudentModel retrieveStudentFormatData(){
            StudentModel student = new StudentModel();
            student.setStudentName("John");
            student.setStudentNo("1234");
            return student;
        }
}
