public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arr1 = {1, 5, 4, 6, 7, 9};
        int[] arr2 = {11, 55, 44, 66, 77, 99};
        int[] arr3 = {111, 555, 444, 666, 777, 999};


        Ex2Thread t1 = new Ex2Thread(arr1);
        Ex2Thread t2 = new Ex2Thread(arr2);
        Ex2Thread t3 = new Ex2Thread(arr3);


        t1.start();
        Thread.sleep(200);
        t2.start();
        Thread.sleep(200);
        t3.start();



    }
}
