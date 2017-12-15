package Agency.Actions;

import Agency.Estate.QuantityOfRooms;

public interface Search {
    void searchEstate(String estate_type, QuantityOfRooms quantityOfRooms, double prise);
}
