public class MacBook implements Laptop {
    private int volume = 30;
    private boolean isOn = false;

    public void powerOn() {
        isOn = true;
        System.out.println("MacBook: Starting up 🍎...");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("MacBook: Shutting down.");
    }

    public void volumeUp() {
        if (isOn) {
            volume += 10;
            System.out.println("MacBook Volume: " + volume);
        } else {
            System.out.println("MacBook belum menyala.");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume -= 10;
            System.out.println("MacBook Volume: " + volume);
        } else {
            System.out.println("MacBook belum menyala.");
        }
    }
}
