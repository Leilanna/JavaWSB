package pl.gda.wsb;

public class Student extends Person {
    private int yearOfStudy;

    private int group;

    private int indexNumber;

    public Student(String name, String surname, String dateofBirth,int yearOfStudy, int group, int indexNumber){
        super(name,surname,dateofBirth);
        this.yearOfStudy = yearOfStudy;
        this.group = group;
        this.indexNumber = indexNumber;
    }
}
