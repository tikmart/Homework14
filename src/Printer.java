public class Printer {
    int count = 1;
    int[] array;


    public synchronized void print(int[] array, int c) {
        boolean isType = false;

        while (!isType) {
            if (count != c) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                for (int i = 0; i < array.length; i++) {

                    if (i < array.length - 1) {
                        System.out.print(array[i] + ",");
                    } else
                        System.out.println(array[i]);

                    isType = true;
                }
            }

        }
        count++;
        notifyAll();
    }
}
