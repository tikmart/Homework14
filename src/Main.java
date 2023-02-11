public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        int[] arr1 = {1, 5, 4, 6, 7, 9};
        int[] arr2 = {11, 55, 44, 66, 77, 99};
        int[] arr3 = {111, 555, 444, 666, 777, 999};
        int[] arr4 = {1111, 5555, 4444, 6666, 7777, 9999};
        int[] arr5 = {11111, 55555, 44444, 66666, 77777, 99999};
        int[] arr6 = {111111, 555555, 444444, 666666, 777777, 999999};


        new Ex2Thread(arr1, printer, 1);
        new Ex2Thread(arr2, printer, 2);
        new Ex2Thread(arr3, printer, 3);
        new Ex2Thread(arr4, printer, 4);
        new Ex2Thread(arr5, printer, 5);
        new Ex2Thread(arr6, printer, 6);


    }
}
