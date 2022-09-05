package com.liu0001.Design_Parking_System_1603;

class ParkingSystem {
    int[] ps;

    public ParkingSystem(int big, int medium, int small) {
        this.ps = new int[]{big, medium, small};

    }

    public boolean addCar(int carType) {
        if (ps[carType-1] > 0) {
            ps[carType-1] = ps[carType-1] - 1;
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
