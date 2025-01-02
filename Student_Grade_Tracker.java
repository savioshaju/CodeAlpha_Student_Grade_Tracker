import java.util.*;

public class Student_Grade_Tracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Students");
        int n = sc.nextInt();
        int score[] = new int[n];
        for (int i = 0; i < n; i++) {
            int mark;
            while (true) {
                System.out.println("Enter The mark (out of 100) of Student " + (i + 1) + ":");
                mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    score[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid mark between 0 and 100.");
                }
            }
        }
        int high = 0, low = 100, t = 0;
        float avgm;
        for (int i = 0; i < n; i++) {
            t = t + score[i];
            if (score[i] < low)
                low = score[i];
            if (score[i] > high)
                high = score[i];
        }
        avgm = (float) t / n;
        System.out.println(""Average Mark: " + avgm);
        System.out.println("Highest Mark: " + high);
        System.out.println("Lowest Mark: " + low);
    }
}
