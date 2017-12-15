package Agency.Estate;

public enum QuantityOfRooms {
    ONE("1"), TWO,THREE, FOUR;
    private String abbreviation;
    private Size(String abbreviation)
    { this.abbreviation = abbreviation; }
    public String getAbbreviation() { return abbreviation; }
}


