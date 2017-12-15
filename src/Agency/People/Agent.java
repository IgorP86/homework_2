package Agency.People;

import Agency.Actions.Buy;
import Agency.Actions.Search;
import Agency.Actions.Sell;
import Agency.Estate.QuantityOfRooms;
import Agency.Estate.RealEstate;

public class Agent extends Person implements Search, Buy, Sell {

    public Agent(String name) {
        super(name);
        this.setCharacter("агент");
    }

    @Override
    public void buyEstate(RealEstate re) {
        System.out.printf("Недвижимость(Id: %s) куплена агентом за: %.2f\n", re.getId(), re.getPrise()*(1-(Buy.TAX_13)/100));
    }

    @Override
    public void sellEstate(RealEstate re) {
        System.out.printf("Недвижимость(Id: %s) продана агентом за: %.2f\n", re.getId(), re.getPrise()*(1-(Buy.TAX_13)/100));
    }

    @Override
    public void searchEstate(String type, QuantityOfRooms quantityOfRooms, double prise) {
        if (type.equals("Квартира") || type.equals("квартира"))
        switch (quantityOfRooms){
            case ONE:
                System.out.println("Агент нашел 1к квартиру, стоимостью: " + prise);
                break;
            case TWO:
                System.out.println("Агент нашел 2к квартиру, стоимостью: " + prise);
                break;
            case THREE:
                System.out.println("Агент нашел 3к квартиру, стоимостью: " + prise);
                break;
            case FOUR:
                System.out.println("Агент нашел 4к квартиру, стоимостью: " + prise);
                break;
        }
        else if(type.equals("частный дом") || type.equals("Частный дом")){
            System.out.println("Агент нашел частный дом на продажу, стоимостью: " + prise);
        }
    }
}
