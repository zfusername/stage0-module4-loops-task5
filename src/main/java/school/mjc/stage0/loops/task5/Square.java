package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        System.out.print("8".repeat(sideLength) + "\n");

        // Print the middle lines
        for (int i = 2; i < sideLength; i++) {
            System.out.print("8");
            System.out.print(" ".repeat(sideLength - 2));
            System.out.print("8\n");
        }

        System.out.print("8".repeat(sideLength));
    }
}
