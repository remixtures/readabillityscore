package readability;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        ReadabilityScore readabilityScore = new ReadabilityScore();
        readabilityScore.readability(file);
    }
}