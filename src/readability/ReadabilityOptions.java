package readability;

public class ReadabilityOptions {

    public static void userOptions(String scoreIndexOptions, int numberOfCharacters, int numberOfSyllables,
                                          int numberOfPolysyllables, int numberOfWords, int numberOfSentences) {

        double ariScore = Indexes.automatedReadabilityIndex(numberOfCharacters, numberOfWords, numberOfSentences);
        int ariAgeRange = AgeRange.getAgeRange((int) Math.ceil(ariScore));

        double fkScore = Indexes.fleschKincaidIndex(numberOfSyllables, numberOfWords, numberOfSentences);
        int fkAgeRange = AgeRange.getAgeRange((int) Math.ceil(fkScore));

        double smogScore = Indexes.smogIndex(numberOfPolysyllables, numberOfSentences);
        int smogAgeRange = AgeRange.getAgeRange((int) Math.ceil(smogScore));

        double clScore = Indexes.colemanLiauIndex(numberOfCharacters, numberOfWords, numberOfSentences);
        int clAgeRange = AgeRange.getAgeRange((int) Math.ceil(clScore));

        double averageAgeRange = ariAgeRange + fkAgeRange + smogAgeRange + clAgeRange / 4.0;

        switch (scoreIndexOptions) {
            case "ARI":
                System.out.printf("Automated Readability Index: %.2f (about %s year olds).\n",
                        ariScore, ariAgeRange);
                break;
            case "FK":
                System.out.printf("Flesch–Kincaid readability tests: %.2f (about %s year olds).\n",
                        fkScore, fkAgeRange);
                break;
            case "SMOG":
                System.out.printf("Simple Measure of Gobbledygook: %.2f (about %s year olds).\n",
                        smogScore, smogAgeRange);
                break;
            case "CL":
                System.out.printf("Coleman–Liau index: %.2f (about %s year olds).\n",
                        clScore, clAgeRange);
                break;
            case "all":
                System.out.printf("Automated Readability Index: %.2f (about %s year olds).\n",
                        ariScore, ariAgeRange);
                System.out.printf("Flesch–Kincaid readability tests: %.2f (about %s year olds).\n",
                        fkScore, fkAgeRange);
                System.out.printf("Simple Measure of Gobbledygook: %.2f (about %s year olds).\n",
                        smogScore, smogAgeRange);
                System.out.printf("Coleman–Liau index: %.2f (about %s year olds).\n",
                        clScore, clAgeRange);
                System.out.printf("This text should be understood in average by %.2f year olds.", averageAgeRange);
                break;
            default:
                System.out.println("invalid user option");
                break;
        }
    }
}
