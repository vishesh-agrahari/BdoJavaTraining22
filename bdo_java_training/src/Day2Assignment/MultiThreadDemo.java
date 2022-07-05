package Day2Assignment;

class GoodMorning extends Thread {
     public void run() {
        try {
            int i=0;
            while (i<5) {
                sleep(5000);
                System.out.println("Good morning ");
                i++;
            }
        } catch (Exception e) {
        }
    }
}
 
class GoodAfterNoon extends Thread {
    public void run() {
        try {
            int i=0;
            while (i<5) {
                sleep(5000);
                System.out.println("GoodAfterNoon");
                i++;
            }
        } catch (Exception e) {
        }
    }
}
 
class GoodEvening extends Thread {
     public void run() {
        try {
            int i=0;
            while (i<5) {
                sleep(7000);
                System.out.println("GoodEvening");
                i++;
            }
        } catch (Exception e) {
        }
    }
}
 
public class MultiThreadDemo {
    public static void main(String args[]) {
        GoodMorning t1 = new GoodMorning();
        GoodAfterNoon t2 = new GoodAfterNoon();
        GoodEvening t3 = new GoodEvening();
        t1.start();
        t2.start();
        t3.start();
     
    }
}
