package tryWithResources;

class MojManagerKontekstu implements AutoCloseable {
    public MojManagerKontekstu() {
        System.out.println("Tworzę się!");
    }

    public void doSomething() {
        System.out.println("Coś robię!");
    }

    public void close() {
        System.out.println("Zamknięcie!");
    }
}

public class Przyklad3 {
    public static void main(String[] args) {
        try (MojManagerKontekstu manager = new MojManagerKontekstu()) {
            manager.doSomething();
        }
    }
}
