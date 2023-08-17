package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = height; i >= 1; i--) {
            // Print (size-i) number of spaces before the line
            System.out.print(" ".repeat(height - i));

            // Print i number of 8's
            System.out.print("8".repeat(i));

            // Print (2*size-2i) number of spaces between the 8's
            System.out.print(" ".repeat(2 * height - 2 * i));

            // Print i number of 8's again
            System.out.print("8".repeat(i));

            System.out.println();
        }

        // Print the bottom half of the hourglass
        for (int i = 1; i <= height; i++) {
            // Print (size-i) number of spaces before the line
            System.out.print(" ".repeat(height - i));

            // Print i number of 8's
            System.out.print("8".repeat(i));

            // Print (2*size-2i) number of spaces between the 8's
            System.out.print(" ".repeat(2 * height - 2 * i));

            // Print i number of 8's again
            System.out.print("8".repeat(i));

            System.out.println();
        }
    }
}
