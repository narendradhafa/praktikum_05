package Praktikum_05;

import java.util.ArrayList;

public class RentArchive {
    ArrayList<CarRent> carRentList = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur) {
        if (car.isStatus()) {
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);

            carRentList.add(new CarRent(rider, car, rentDur));
        }

        else if (!car.isStatus()) {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info() {
        System.out.println("----------------------------------------");
        System.out.println("          INFORMASI PELANGGAN           ");
        System.out.println("----------------------------------------");

        for (int i = 0; i < carRentList.size(); i++) {
            System.out.println("NAMA PEMINJAM   : " + carRentList.get(i).getRider().getName());
            System.out.println("TIPE MOBIL      : " + carRentList.get(i).getCar().getCarType());
            System.out.println("NO. POLISI      : " + carRentList.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + carRentList.get(i).getRentDur());
            System.out.println("----------------------------------------");
        }
    }
}
