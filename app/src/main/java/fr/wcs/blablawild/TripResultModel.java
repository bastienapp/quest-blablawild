package fr.wcs.blablawild;

import java.util.Date;

/**
 * Created by wilder on 13/09/17.
 */

public class TripResultModel {
    private String firstname;
    private Date departure;
    private int price;

    public TripResultModel(String firstname, Date departure, int price) {
        this.firstname = firstname;
        this.departure = departure;
        this.price = price;
    }

    public String getFirstname() {
        return firstname;
    }

    public Date getDeparture() {
        return departure;
    }

    public int getPrice() {
        return price;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
