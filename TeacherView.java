
import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teatcher> {

    @Override
    public void sendOnConsole(List<Teatcher> teachers) {
        System.out.println(teachers);
    }

}
