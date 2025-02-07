public class StudentManager extends UserManager{
    public void point(Student student){
        System.out.println(student.getName()+ " puanın:" +student.getPoint());
    }

}
