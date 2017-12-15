package Agency.People;
import Agency.Actions.Buy;
import Agency.Actions.Sell;
import Agency.Estate.RealEstate;

import java.util.ArrayList;

public class Seller extends Person implements Sell {

    private ArrayList<Integer> ownsProperty = new ArrayList<>();    //Список Id принадлежащего конкретному человеку имущества

    //Продавцу можно добавить Id имущества которое принадлежит ему
    public Seller(String name, int... id) {
        super(name);
        this.setCharacter("продавец");
        for (int ID : id){
            this.ownsProperty.add(ID);
        }
    }

    @Override
    public void sellEstate(RealEstate re) {
        System.out.printf("Недвижимость(Id: %s) продана за: %.2f\n", re.getId(), re.getPrise()*(1-(Buy.TAX_13)/100));
    }
}
