public class Main {
    public static void main(String[] args) {
        double day1 = 3.0;
        double day2 = 2.0;
        double day3 = 3.0;
        double day4 = 3.5;
        double day5 = 2.5;
        double day6 = 3.0;
        double day7 = 4.0;

        double dayHours = 0.0;

        double totalStudyHours = 0.0;
        double highestStudyHours = 0.0;

        int meetingTargetDays = 0;
        int belowTargetDays = 0;

        double target = 3.0;

        int day = 1;

        while (day <= 7) {
            if (day == 1) {
                System.out.println(dayHours = day1);
            } else if (day == 2) {
                System.out.println(dayHours = day2);
            } else if (day == 3) {
                System.out.println(dayHours = day3);
            } else if (day == 4) {
                System.out.println(dayHours = day4);
            } else if (day == 5) {
                System.out.println(dayHours = day5);
            } else if (day == 6) {
                System.out.println(dayHours = day6);
            } else {
                System.out.println(dayHours = day7);
            }

            totalStudyHours = totalStudyHours + dayHours;

            if (dayHours > highestStudyHours) {
                System.out.println(highestStudyHours = dayHours);
            }

            if (dayHours >= target && dayHours >= 0) {
                System.out.println(meetingTargetDays = meetingTargetDays + 1);
            } else {
                System.out.println(belowTargetDays = belowTargetDays + 1);
            }

            day = day + 1;
        }

        double averageStudyHours = totalStudyHours / (double) 7;

        String consistencyStatus = (meetingTargetDays >= 6) ? "Excellent"
                : (meetingTargetDays >= 4) ? "Good"
                        : (meetingTargetDays >= 2) ? "Developing"
                                : "Needs Improvement";

        // Final improvement message using ternary + condition
        String message = (meetingTargetDays >= 4)
                ? "Keep up the momentum and maintain your daily target."
                : "Improve the low-study days and maintain consistency.";

        System.out.println("WEEKLY STUDY REPORT\n");

        System.out.println("Total Study Hours: " + format1(totalStudyHours));
        System.out.println("Average Study Hours: " + format1(averageStudyHours));
        System.out.println("Highest Study Hours: " + format1(highestStudyHours) + "\n");

        System.out.println("Days Meeting Target: " + meetingTargetDays);
        System.out.println("Days Below Target: " + belowTargetDays + "\n");

        System.out.println("Consistency Status: " + consistencyStatus);
        System.out.println("Message: " + message);
    }

    // Helper to keep decimals similar to sample output
    private static String format1(double value) {
        return String.format("%.1f", value);
    }
}