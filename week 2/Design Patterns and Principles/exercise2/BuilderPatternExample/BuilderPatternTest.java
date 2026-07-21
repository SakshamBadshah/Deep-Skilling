public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .setWifi(true)
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4060")
                .setBluetooth(true)
                .setWifi(true)
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("8GB")
                .setStorage("1TB HDD")
                .setBluetooth(false)
                .setWifi(true)
                .build();

        System.out.println("Basic Computer:");
        basicComputer.displayComputerDetails();

        System.out.println("Gaming Computer:");
        gamingComputer.displayComputerDetails();

        System.out.println("Office Computer:");
        officeComputer.displayComputerDetails();
    }
}