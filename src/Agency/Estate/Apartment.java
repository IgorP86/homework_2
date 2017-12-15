package Agency.Estate;

public class Apartment extends RealEstate {

    //Посчитать дополнительные расходы
     public static void additionalCosts(RealEstate re){
        double coast = re.getPrise();
        System.out.printf(  "\nДополнительные расходы:"+
                            "\nТип недвижимости: %s\nОценка: %.2f\nСтраховка: %.2f\nПремия агенту: %.2f" +
                            "\nНалог: %.2f\n\n",
                            re.getType(),coast*0.001,coast*0.01,coast*0.10,coast*0.13);
    }

    //получить инфо по объекту квартира(тип 100)
    @Override
    public String giveInfo() {
        return "\nОбщие сведения:\nТип недвижимости: "  +this.getType()+"\nId: "+this.getId()+"\nЦена: "
                                                        +this.getPrise()+"\nАдресс: "+this.getAddress();
    }

    //Задать тип обекта (100)
    @Override
    protected void setType() {
        this.type = 100;
    }

    //Конструктор
    public Apartment(double prise, String address){
        this.setAddress(address);
        this.setPrise(prise);
        this.setId();
        this.setType();
    }


}
