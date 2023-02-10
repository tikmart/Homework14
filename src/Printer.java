public class Printer {
    int[] array;
    Printer(int[] array){
        this.array = array;
    }

    public synchronized static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
