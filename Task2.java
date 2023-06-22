package seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
1 3 4 2
1 3 2 4
1 2 3 4
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        Integer[] arr = {5, 2, 6, 1, 9, 2};
        FileWriter writer = new FileWriter("log.txt");
        writer.write((Arrays.toString(arr)));
        writer.write("\n");
        int temp;
        Boolean flag = true;
        while (flag) {

            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    writer.write((Arrays.toString(arr)));
                    writer.write("\n");
                    flag = true;

                }

            }
            if (flag) {
                System.out.println(Arrays.toString(arr));
            }

        }
        writer.close();
    }
}
