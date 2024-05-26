package studentlist;

/**
 *
 * @author paulbonenfant
 * change on 2024/05/25
 */
public class Student {

    private String name;
    private String studentID;
    private String address;

    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}
