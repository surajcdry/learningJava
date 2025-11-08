package linearSearch;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9 }
        };

        int target = 7;

        String index = findElement(arr, target);

        System.out.println("\nIndex: " + index + "\n");
    }

    static String findElement(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return "" + i + ", x" + j;
                }
            }
        }

        return "Not found.";
    }
}
