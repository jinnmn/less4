import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

    TeacherController c = new TeacherController();
    c.create(new Teatcher(1,"Sasha","Ivanov"));
    c.create(new Teatcher(1, "Ira", "Ivanova"));
    c.sendOnConsole();


        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Ira", "Ivanova")));

    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
