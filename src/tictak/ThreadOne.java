package tictak;

public class ThreadOne extends Thread {
    Object monitor;
    public ThreadOne() {

    }
    public ThreadOne(Object monitor) {
        this.monitor = monitor;
    }

    public void run () {
        try
        {
            for (int i = 0; i < TicTak.num; i++) {
                System.out.print(1+" - ");
                synchronized (monitor) {
                    monitor.notify();
                    if (i < TicTak.num-1)
                        monitor.wait();
                }

            }}
        catch (InterruptedException e) { e.printStackTrace(); }
    }
}
