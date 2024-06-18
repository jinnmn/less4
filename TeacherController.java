
public class TeacherController implements UserController {

    private TeacherView view = new TeacherView();;
    private TeacherService service = new TeacherService();
    
    public TeacherController() {
        this.view = new TeacherView();
        this.service = new TeacherService();
    }

    @Override
    public <T extends User> User create(T user) {
        return user;    
    }

    public void sendOnConsole() {
        view.sendOnConsole(TeacherService.getTeatchers());
    }
    
   public void editTeacher(int id, String name, String last) {
        editTeacher(id, name, last);
}
}
