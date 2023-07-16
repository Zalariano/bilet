public class Main {
    public static void changeArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                inputArray[i]++;
            }
        }
        for (int j = 2; j < 7; j++) {
            System.out.println(inputArray[j]);
        }
    }

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        changeArray(inputArray);
    }
}