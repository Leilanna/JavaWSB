package pl.gda.wsb;

public class Footballer extends Person {
    private String club;

    private Position position;

    private int numberOfGoals;

    public Footballer(String name, String surname, String dateofBirth, String club, Position position){
        super(name,surname,dateofBirth);
        this.club = club;
        this.position = position;
    }

    public void scoreAGoal(){
        numberOfGoals++;
        System.out.println(club+ " " + getSurname() +" scores!!!");
    }

    @Override
    public String toString(){
        return "Name and surname: " + getName() + " " + getSurname() + ", date of birth: " + getDateofBirth() + "\n"+
                "Footballer's club: " + this.club + ", position: " + this.position + "\n" +
                "Number of goals: " + this.numberOfGoals;
    }
}
