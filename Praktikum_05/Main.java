package Praktikum_05;

public class Main {
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "081234567890");
        CarRider youhan = new CarRider("Bei Youhan", 20, "082345678901");
        CarRider ling = new CarRider("Ling'er", 31, "083456789012");

        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);

        System.out.println("");
        arsip.info();
    }
}
