import Agency.Actions.Buy;
import Agency.Actions.Search;
import Agency.Actions.Sell;
import Agency.Estate.Apartment;
import Agency.Estate.QuantityOfRooms;
import Agency.Estate.RealEstate;
import Agency.Estate.PrivateHouse;
import Agency.People.Agent;
import Agency.People.Buyer;
import Agency.People.Seller;

public class dz_2 {
    public static void main(String args[]) throws IndexOutOfBoundsException{
        Apartment[] apartments = {
                new Apartment(10.0,"адрес №1"),
                new Apartment(22268.99,"адрес №2"),
                new Apartment(33345.01,"адрес №3"),
                new Apartment(44468.99,"адрес №4")
        };

        RealEstate[] houses = {
                new PrivateHouse(100.0,"адрес №11",12.01f),
                new PrivateHouse(2222000.51,"адрес №22",15.05f),
                new PrivateHouse(3333999.98,"адрес №33",22),
                new PrivateHouse(4444000.63,"адрес №44",33),
                new PrivateHouse(9999999.99,"адрес №55",1000.99f)
        };

        //Вызов методов
        for(RealEstate re:apartments){
            System.out.println(re.giveInfo());
        }
        for(RealEstate re:houses){
            System.out.println(re.giveInfo());
        }
        //Вызов статического метода
        Apartment.additionalCosts(apartments[2]);
        Apartment.additionalCosts(houses[3]);

        Buyer buyerOne = new Buyer("Тот кто хочет купить");      //покупатель умеет искать и покупать
        Seller sellerOne = new Seller("Тот кто хотел бы продать", apartments[0].getId(), houses[2].getId(),apartments[3].getId());   //продавец только продает
        Agent smith = new Agent("smith");           //агент умеет все

    //Ищем недвижимость
        searching(smith, "квартира", QuantityOfRooms.THREE, apartments[0].getPrise());
        searching(buyerOne, "Частный дом", QuantityOfRooms.FOUR, houses[1].getPrise());

    //Покупаем
        makeABuy(smith, apartments[2]);
        makeABuy(buyerOne, apartments[1]);
        makeABuy(smith, houses[2]);
        makeABuy(buyerOne, houses[4]);
    //Продаем
        makeASell(smith, apartments[0]);
        makeASell(sellerOne, apartments[2]);
        makeASell(smith, houses[0]);
        makeASell(sellerOne, houses[1]);

        try {
            makeABuy(buyerOne, apartments[10]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ошибка IndexOutOfBoundsException");
        }
    }

    private static void makeABuy(Buy whoIs, RealEstate re){
        whoIs.buyEstate(re);
    }
    private static void makeASell(Sell whoIs, RealEstate re){
        whoIs.sellEstate(re);
    }
    private static void searching(Search whoIs, String type, QuantityOfRooms nr, double pr){
        whoIs.searchEstate(type,nr, pr);
    }



}

