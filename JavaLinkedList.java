import java.util.LinkedList;

public class JavaLinkedList {
    private LinkedList<Integer> list;

    public JavaLinkedList(int[] nums) {
        list = new LinkedList<Integer>();
        for (int num : nums) {
            list.add(num);
        }
    }

    public double getSum() {
        double total = 0;
        for (Integer i : list) {
            total += i;
        }
        return total;
    }

    public double getAvg() {
        return getSum() / list.size();
    }

    public int getLargest() {
        int largest = Integer.MIN_VALUE;
        for (Integer i : list) {
            largest = Math.max(i, largest);
        }
        return largest;
    }

    public int getSmallest() {
        int smallest = Integer.MAX_VALUE;
        for (Integer i : list) {
            smallest = Math.min(i, smallest);
        }
        return smallest;
    }

    public String toString() {
        return String.format("Sum: %f \nAverage: %f \nMax: %f \nMin: %f\n", getSum(), getAvg(), (float) getLargest(), (float) getSmallest());
    }
}