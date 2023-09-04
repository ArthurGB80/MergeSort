public class MergeSort {
    public static void merge(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[q + 1 + j];
        }

        int i = 0, j = 0, k = p;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] A = {5, 2, 4, 6, 1, 3, 2, 6};
        int p = 0;
        int r = A.length - 1;

        merge(A, p, (p + r) / 2, r);

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
