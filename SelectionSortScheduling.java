import java.util.Scanner;

class SelectionSortScheduling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] pid = new int[n];
        int[] at = new int[n];
        int[] bt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        // Input
        for (int i = 0; i < n; i++) {

            pid[i] = i + 1;

            System.out.println("\nProcess P" + pid[i]);

            System.out.print("Arrival Time: ");
            at[i] = sc.nextInt();

            System.out.print("Burst Time: ");
            bt[i] = sc.nextInt();
        }

        // Selection Sort according to Arrival Time
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (at[j] < at[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap AT
            int temp = at[i];
            at[i] = at[minIndex];
            at[minIndex] = temp;

            // Swap BT
            temp = bt[i];
            bt[i] = bt[minIndex];
            bt[minIndex] = temp;

            // Swap PID
            temp = pid[i];
            pid[i] = pid[minIndex];
            pid[minIndex] = temp;
        }

        // Calculate CT, TAT and WT
        int currentTime = 0;

        for (int i = 0; i < n; i++) {

            if (currentTime < at[i]) {
                currentTime = at[i];
            }

            ct[i] = currentTime + bt[i];
            currentTime = ct[i];

            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
        }

        // Display Result
        System.out.println("\n------------------------------------------------");
        System.out.println("Process\tAT\tBT\tCT\tTAT\tWT");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.println("P" + pid[i] + "\t"
                    + at[i] + "\t"
                    + bt[i] + "\t"
                    + ct[i] + "\t"
                    + tat[i] + "\t"
                    + wt[i]);
        }

        sc.close();
    }
}