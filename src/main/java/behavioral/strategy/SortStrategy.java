package behavioral.strategy;

import java.util.Arrays;

public interface SortStrategy {

    void sort(int[] list);


    class BubbleSort implements SortStrategy {

        @Override
        public void sort(int[] list) {
            int n = list.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (list[j] > list[j + 1]) {
                        int temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                    }
        }
    }

    class QuickSort implements SortStrategy{

        @Override
        public void sort(int[] list) {
            Arrays.sort(list);
        }
    }
}
