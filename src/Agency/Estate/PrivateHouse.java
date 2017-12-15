package Agency.Estate;

public class PrivateHouse extends Apartment{
    private float land_area;

    //получить инфо по объекту частный дом (тип 200)
    @Override
    public String giveInfo() {
        return super.giveInfo()+"\nПлощадь участка: "+this.get_land_area();
    }
    public float get_land_area(){return this.land_area;}

    //Задать тип обекта (200)
    @Override
    protected void setType() {
        this.type = 200;
    }
    //Конструктор
    public PrivateHouse(double prise, String address, float land_area){
        super(prise*land_area,address);
        this.land_area = land_area;
        this.setType();
    }


}
