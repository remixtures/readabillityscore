package readability;

public class AgeRange {

    public static int getAgeRange(int score) {

        int ageRange = 0;

        switch (score) {
            case 1:
                ageRange = 6;
                break;
            case 2:
                ageRange = 7;
                break;
            case 3:
                ageRange = 9;
                break;
            case 4:
                ageRange = 10;
                break;
            case 5:
                ageRange = 11;
                break;
            case 6:
                ageRange = 12;
                break;
            case 7:
                ageRange = 13;
                break;
            case 8:
                ageRange = 14;
                break;
            case 9:
                ageRange = 15;
                break;
            case 10:
                ageRange = 16;
                break;
            case 11:
                ageRange = 17;
                break;
            case 12:
                ageRange = 18;
                break;
            case 13:
                ageRange = 24;
                break;
            case 14:
                ageRange = 25;
                break;
            default:
                System.out.println("This text could not be parsed.");
                break;
        }
        return ageRange;
    }
}