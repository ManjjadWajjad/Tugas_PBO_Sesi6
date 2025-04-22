public class Lenovo implements Laptop {
    private int volume = 50;
    private boolean isOn = false;

    public void powerOn() {
        isOn = true;
        System.out.println("Laptop Lenovo menyala...");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Laptop Lenovo dimatikan.");
    }

    public void volumeUp() {
        if (isOn) {
            volume += 10;
            System.out.println("Volume Lenovo: " + volume);
        } else {
            System.out.println("Laptop belum menyala.");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume -= 10;
            System.out.println("Volume Lenovo: " + volume);
        } else {
            System.out.println("Laptop belum menyala.");
        }
    }
}
