public class Toshiba implements Laptop {
    private int volume = 40;
    private boolean isOn = false;

    public void powerOn() {
        isOn = true;
        System.out.println("Toshiba: Laptop dinyalakan.");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Toshiba: Laptop dimatikan.");
    }

    public void volumeUp() {
        if (isOn) {
            volume += 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Toshiba belum menyala.");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume -= 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Toshiba belum menyala.");
        }
    }
}
