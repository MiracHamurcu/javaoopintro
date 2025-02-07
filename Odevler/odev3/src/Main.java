import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     InstructorManager instructorManager = new InstructorManager();
     UserManager userManager = new UserManager();
     StudentManager studentManager = new StudentManager();

     Student student1 = new Student();
     student1.setId(1);
     student1.setMail("student@mail.com");
     student1.setPassword("sifre123");
     student1.setName("Miraç");
     student1.setSurName("Hamurcu");
     student1.setPoint(0);

     Student student2 = new Student();
     student2.setId(2);
     student2.setMail("student2@mail.com");
     student2.setPassword("sifre1235");
     student2.setName("Taha");
     student2.setSurName("Latif");
     student2.setPoint(2);

     Instructor instructor1 = new Instructor();
     instructor1.setId(1);
     instructor1.setMail("instructor@mail.com");
     instructor1.setPassword("sifre123");
     instructor1.setName("Engin");
     instructor1.setSurName("Demiroğ");


     // userManager.add(instructor1); // tekli ekleme

     // User[] users = {student1, student2, instructor1};
     //  userManager.multiAdd(users); // birden fazla ekleme

     //    System.out.println("Kurs adını giriniz: ");
     //   String course = scanner.nextLine();
     //   instructor1.setUploadCourse(course); // kurs ekleme
     //  instructorManager.Course(instructor1); // ekrana yazdırma
     studentManager.point(student2); // puan görünteleme

    }
}