public class Ex2Thread extends Thread {
    int[] array;

    Ex2Thread(int[] array) {
        this.array = array;
    }

    public void run() {

        Printer.print(array);
    }
}
