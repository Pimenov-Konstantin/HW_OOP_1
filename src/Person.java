public class Person {
    public String fullName;
    public Gender gender;
    public Person(String fullName, Gender gender) {
        this.fullName = fullName;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

}