package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String output = "";

        if(sideLength>1) {
            output += "8".repeat(sideLength) + "\n";

            // Print the middle lines
            for (int i = 2; i < sideLength; i++) {
                output += "8";
                output += " ".repeat(sideLength - 2);
                output += "8\n";
            }

            // Print the bottom line
            output += "8".repeat(sideLength);
        }
        System.out.println(output);
    }
}
