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
        System.out.println(club+ (getSurname())+"scores!!!");
    }

}
