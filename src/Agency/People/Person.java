package Agency.People;

public abstract class Person{
    private String name;
    private String surname;
    private String character;   //продавец, покупатель, агент


    protected void setCharacter(String ch){
        this.character = ch;
    }

    public Person(String name){
        this.name = name;
    }
}
