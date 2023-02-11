public class Ex2Thread extends Thread {
    int[] array;
    int count;
    Printer printer;

    Ex2Thread(int[] array,Printer printer, int count) {
        this.array = array;
        this.printer = printer;
        this.count = count;
        this.start();
    }

    public void run() {

        printer.print(array,count);
    }
}
