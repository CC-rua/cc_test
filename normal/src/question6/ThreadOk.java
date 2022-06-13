package question6;

public class ThreadOk {
    //步数
    int step;

    //左腿
    class LeftLeg implements Runnable {
        //左腿跑
        @Override
        public void run() {
            ThreadOk.this.step++;
            System.out.println("leftLeg step");
        }
    }

    //右腿
    class RightLeg implements Runnable {
        //右腿跑
        @Override
        public void run() {
            ThreadOk.this.step++;
            System.out.println("rightLeg step");
        }
    }

    public void start() {
        Thread t1 = new Thread(new LeftLeg());
        Thread t2 = new Thread(new RightLeg());
        t2.start();
        t1.start();
    }
}