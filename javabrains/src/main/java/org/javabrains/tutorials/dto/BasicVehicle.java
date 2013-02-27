package org.javabrains.tutorials.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: halyph
 * Date: 2/27/13
 * Time: 4:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class BasicVehicle {
    @Id
    @GeneratedValue
    private int id;
    private String vehicleName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
