package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        System.out.print("8".repeat(length) + "\n");

        // Print the middle lines (excluding the first and last lines)
        for (int i = 2; i < height; i++) {
            System.out.print("8");
            System.out.print(" ".repeat(length - 2));
            System.out.print("8\n");
        }

        // Print the bottom line
        if (height > 1) {
            System.out.print("8".repeat(length));
        }
    }
}
