/**
 * Created by Kuryakov on 10-Dec-16.
 */
public class Пользователь {
    private String surname;
    private String name;
    private int course;
    private int group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Пользователь(String surname, String name, int course, int group) {

        this.surname = surname;
        this.name = name;
        this.course = course;
        this.group = group;
    }
}
