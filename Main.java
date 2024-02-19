public class Main {
    static class Ronaldo extends Thread {
        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " Ronaldo");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Ronaldo r = new Ronaldo();
        r.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " Messi");
        }
    }
}