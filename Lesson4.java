import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

    TeacherController c = new TeacherController();
    TeacherService s = new TeacherService();
    Teatcher t1= s.createTeatcher(1,"Sasha","Ivanov");
    c.create(t1);
    c.create(s.createTeatcher(1, "Ira", "Ivanova"));
    c.sendOnConsole();
    c.editTeacher(2, "Ivan", "Irinov");
    c.sendOnConsole();


        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));

    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
