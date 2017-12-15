package Agency.People;

import Agency.Actions.Buy;
import Agency.Actions.Search;
import Agency.Estate.QuantityOfRooms;
import Agency.Estate.RealEstate;

import java.util.ArrayList;

public class Buyer extends Person implements Buy, Search {

 private ArrayList<Double> d1 = new ArrayList<>();

    public Buyer(String name) {
        super(name);
        this.setCharacter("покупатель");
    }

    @Override
    public void buyEstate(RealEstate re) {
        System.out.printf("Недвижимость(Id: %s) куплена покупателем за: %.2f\n", re.getId(), re.getPrise()*(1-(Buy.TAX_13)/100));
    }

    @Override
    public void searchEstate(String type, QuantityOfRooms quantityOfRooms, double prise) {
        if (type.equals("Квартира") || type.equals("квартира"))
            switch (quantityOfRooms){
                case ONE:
                    System.out.println("Покупатель нашел 1к квартиру за: " + prise);
                    break;
                case TWO:
                    System.out.println("Покупатель нашел 2к квартиру за: " + prise);
                    break;
                case THREE:
                    System.out.println("Покупатель нашел 3к квартиру за: " + prise);
                    break;
                case FOUR:
                    System.out.println("Покупатель нашел 4к квартиру за: " + prise);
                    break;
            }
        else if(type.equals("частный дом") || type.equals("Частный дом")){

            System.out.println("Покупатель нашел частный дом на продажу за: " + prise);
        }
    }
}
