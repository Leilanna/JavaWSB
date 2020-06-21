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

    @Override
    public String toString(){
        return "Name and Surname: " + getName() + " " + getSurname() + ", date of birth" + getDateofBirth() + "\n "
                + "Student index number: " + this.indexNumber + " year of study: " + this.yearOfStudy + " group: " + this.group;
    }
}
