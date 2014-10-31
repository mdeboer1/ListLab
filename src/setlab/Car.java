/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setlab;

/**
 *
 * @author mdeboer1
 */
public class Car {
    private String make;
    private int vin;

    public Car(String make, int vin) {
        this.make = make;
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", vin=" + vin + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.vin;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.vin != other.vin) {
            return false;
        }
        return true;
    }

    public final String getMake() {
        return make;
    }

    public final void setMake(String make) {
        this.make = make;
    }

    public final int getVin() {
        return vin;
    }

    public final void setVin(int vin) {
        this.vin = vin;
    }
}
