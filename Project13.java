import java.lang.Thread;

class SimulatorThread {
    public void run() {
        System.out.println("Downloader");
    }
}

class MovieDownloader extends Thread{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Movies Downloading...");
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class PLayMusic extends Thread{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Music Playing.....");
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class notification extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Sending notification......");
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Project13 {
    public static void main(String[] args) {
        MovieDownloader md = new MovieDownloader();
        PLayMusic pm = new PLayMusic();
        notification n1 = new notification();

        md.start();
        pm.start();
        n1.start();

        for(int i=0;i<5;i++) {
            System.out.println("Multithreading is starting......");
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }

        try {
            md.join();
            pm.join();
            n1.join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
