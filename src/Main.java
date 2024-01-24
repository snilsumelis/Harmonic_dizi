public class Main {
    public static void main(String[] args) {
        int[] list = {5, 20, 40, 80, 100};
        double average;
        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += 1.0 / list[i];
        }

        average = list.length / sum;
        System.out.println(average);
    }
}
