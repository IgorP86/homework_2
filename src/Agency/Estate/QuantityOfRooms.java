package Agency.Estate;

public enum QuantityOfRooms {
    ONE("1"), TWO("2"),THREE("3"), FOUR("4");
    private String abbreviation;
    private Size(String abbreviation)
    { this.abbreviation = abbreviation; }
    public String getAbbreviation() { return abbreviation; }
}


