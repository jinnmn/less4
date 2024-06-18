import java.util.LinkedList;
import java.util.List;

public class TeacherService {

    private static List<Teatcher> teatchers = new LinkedList<>();
    
    public Teatcher createTeatcher(int id, String name, String last) {
        Teatcher x =  new Teatcher(id, name, last);
        teatchers.add(x);
        return x;
    }

    public static void editTeacher (int id, String name, String last) {
        for (Teatcher teatcher : teatchers) {
            if (teatcher.getId() == id) {
                teatcher.setName(name);
                teatcher.setLastName(last);
            } 
        }
    }

    public static List<Teatcher> getTeatchers() {
        return teatchers;
    }
    


}
