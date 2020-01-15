package p1;

import java.util.Scanner;

interface arraysOparions {
    public abstract void even(int arr[]);

    public abstract void reverse(int arr[]);

}

class Arrays implements arraysOparions {
    Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length ");
        int length = input.nextInt();
        int arr[] = new int[length];
        Arrays obj = new Arrays();
        obj.inputArrays(arr);
        obj.reverse(arr);
        //  obj.even(arr);
    }

    public void inputArrays(int arr[]) {
        System.out.println("enter element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("input arrys is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    @Override
    public void even(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (arr[i] % 2 == 0) {
                    count = count + 1;
                }

            }

        }
        int evenArrays[] = new int[count];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (arr[i] % 2 == 0) {
                    evenArrays[c] = arr[i];
                    c = c + 1;
                }

            }

        }
        System.out.println("even arrsys is:");
        {
            for (int i = 0; i < evenArrays.length; i++) {
                System.out.print(evenArrays[i] + " ");
            }
        }
    }

    @Override
    public void reverse(int[] arr) {
        int[] revArrays = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rem = 0;
            int rev = 0;
            while (arr[i] != 0) {
                rem = arr[i] % 10;
                rev = (rev * 10) + rem;
                arr[i] = arr[i] / 10;

            }
            revArrays[i] = rev;


        }
        System.out.println("reverse arrays is :");
        for (int i = 0; i < revArrays.length; i++) {
            System.out.print(revArrays[i] + " ");
        }

    }
}
