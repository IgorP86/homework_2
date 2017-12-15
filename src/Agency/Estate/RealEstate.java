package Agency.Estate;

abstract public class RealEstate {
    private String address;           //адрес
    private double prise;             //цена недвижимости
    private int id;                   //Идентификатор
    private static int nextId = 0;   //счетчик id
    int type;                         //Тип недвижимости

    public abstract String giveInfo();    //дать сводную информацию
    protected abstract void setType();    //Устанавливает тип


    public int getId(){return this.id;}
    public String getType(){
        switch (this.type){
            case 100:
                return "квартира";
            case 200:
                return "частный дом";
        }
        return "что-то другое";
    }
    public double getPrise(){
        return this.prise;
    }
    public String getAddress(){return this.address;}
    protected void setPrise(double prise){
        this.prise = prise;
    }
    protected void setId(){
        this.id += ++nextId;
    }
    protected void setAddress(String address){
        this.address = address;
    }
}
