public class InstructorManager extends UserManager{
    public void Course(Instructor instructor){
        System.out.println(instructor.getName() + " başarılı bir şekilde "+ instructor.getUploadCourse()+" kursunu oluşturdunuz.");
    }
}
