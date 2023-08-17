package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print the i-th row with i '8's
            System.out.print("8".repeat(i));

            // Print the spaces till the end of line
            System.out.println(" ".repeat(cathetusLength - i));
        }
    }
}
