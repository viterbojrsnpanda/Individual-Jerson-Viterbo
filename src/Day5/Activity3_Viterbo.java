package Day5;

public class Activity3_Viterbo {
    static void main(String[] args) {
        int age = 18;
        int score = 85;
        int num = 10;
        int num2 = 25;
        boolean hasValidID = true;
        boolean isWeekend = false;
        boolean isHoliday = true;
        String allowedToEvent;
        String classStatus;
        String result;
        int largerNumber;

        System.out.println("--- Task 2: Event Entry Check ---");
        allowedToEvent = (age >= 18 && hasValidID) ? "Yes" : "No";
        System.out.println("Allowed to enter the event: " + allowedToEvent + "\n");

        System.out.println("--- Task 3: Class Status Check ---");
        classStatus = (isWeekend || isHoliday) ? "Yes, no classes." : "No, There are classes.";
        System.out.println("Are there no classes today? " + classStatus + "\n");

        System.out.println("--- Task 4: Pass or Fail Check ---");
        result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Score: " + score + "\nResult: " + result + "\n");

        System.out.println("--- Task 5: Larger Number Check ---");
        largerNumber = (num >= num2) ? num : num2;
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + largerNumber);

    }
}
