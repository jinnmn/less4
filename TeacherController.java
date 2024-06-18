
public class TeacherController implements UserController {

    private TeacherView view;
        
    public TeacherController() {
        this.view = new TeacherView();
    }

    @Override
    public <T extends User> User create(T user) {
        return user;    
    }

    public void sendOnConsole() {
        view.sendOnConsole(TeacherService.getTeatchers());
    }
    
   public void editTeacher(int id, String name, String last) {
        TeacherService.editTeacher(id, name, last);
}
}
