

public class Teatcher extends User  {
    private static int count =1;
    public Teatcher(int id, String name, String lastName) {
        this.id = count++;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Teacher [id=%d, name=%s, last=%s]", id, name, lastName);
    }
}
