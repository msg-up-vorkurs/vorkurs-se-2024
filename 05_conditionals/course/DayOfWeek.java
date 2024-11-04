package course;

public class DayOfWeek {
    public static void main(String[] args) {

        int dayOfWeek = 1;

        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        }

        /*
        / Switch-Case
        / switch([Ausdruck]) {
        /   case [x]:           // Beschreibt den Fall x == Ausdruck; x muss Literal/Konstante sein
        /       [Anweisungen für Fall x]
        /       break;          // Beendet das Ausführen der Anweisungen
        /   case [y]:
        /       [Anweisungen für Fall y]
        /   case [z]:
        /       [Anweisungen für Fall z]
        /       break;
        /   default:             // Wenn kein anderer Fall zutrifft, kann damit eine Standardanweisung ausgeführt werden.
        /       [Anweisungen, wenn kein Fall zutrifft]
        / }
        /
        / Für den Fall y werden aufgrund des fehlenden 'break' sowohl die [Anweisungen für Fall y]
        / und die [Anweisungen für Fall z] ausgeführt
         */

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Wochenende");
                break;
            default:
                System.out.println("Day of Week must be in the range 1-7.");
        }

        /*
         * Switch-Expressions
         */
        String dayOfWeekExpression = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Wochenende";
            default -> "Day of Week must be in the range 1-7.";
        };

        System.out.println(dayOfWeekExpression);
    }
}
