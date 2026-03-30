import java.util.List;

public class ConsoleUI {

    public static void printBanner() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║         SYMPTOM CHECKER & HEALTH ADVISOR                ║");
        System.out.println("║         Java Console Application  v1.0                  ║");
        System.out.println("║         For informational purposes only                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    public static void printDisclaimer() {
        System.out.println("⚠  DISCLAIMER: This tool is NOT a substitute for professional");
        System.out.println("   medical advice, diagnosis, or treatment. Always consult a");
        System.out.println("   qualified healthcare provider for medical concerns.");
        System.out.println();
    }

    public static void printSeparator() {
        System.out.println("──────────────────────────────────────────────────────────");
    }

    public static void printSymptomList(List<String> symptoms) {
        System.out.println();
        System.out.println("  Known symptoms (type one or more from this list):");
        System.out.println();
        int col = 0;
        for (String s : symptoms) {
            System.out.printf("  %-28s", "• " + s);
            col++;
            if (col % 2 == 0) System.out.println();
        }
        if (col % 2 != 0) System.out.println();
        System.out.println();
    }

    public static void printResults(List<DiagnosisResult> results) {
        System.out.println();
        printSeparator();
        System.out.println("  ANALYSIS RESULTS");
        printSeparator();

        if (results.isEmpty()) {
            System.out.println();
            System.out.println("  No strong matches found for the symptoms you described.");
            System.out.println("  This could mean:");
            System.out.println("  • Your symptoms are very mild or early stage");
            System.out.println("  • The combination is unusual — please consult a doctor");
            System.out.println("  • Try entering more symptoms if you have them");
            System.out.println();
            return;
        }

        System.out.println();
        System.out.printf("  %-3s  %-30s  %-8s  %-10s  %s%n",
            "#", "Possible Condition", "Match%", "Severity", "Matched");
        printSeparator();

        int rank = 1;
        for (DiagnosisResult r : results) {
            String severity = r.getCondition().getSeverity();
            String severityIcon = severity.equals("HIGH") ? "🔴 HIGH" :
                                  severity.equals("MEDIUM") ? "🟡 MED " : "🟢 LOW ";
            System.out.printf("  %-3d  %-30s  %-8s  %-10s  %d/%d symptoms%n",
                rank++,
                r.getCondition().getName(),
                String.format("%.1f%%", r.getMatchPercent()),
                severityIcon,
                r.getMatchScore(),
                r.getCondition().getMatchingSymptoms().size());
        }
        System.out.println();
    }

    public static void printConditionDetail(DiagnosisResult result) {
        Condition c = result.getCondition();
        System.out.println();
        System.out.println("  ┌─ " + c.getName().toUpperCase());
        System.out.println("  │");
        System.out.println("  │  About   : " + c.getDescription());
        System.out.println("  │");
        System.out.println("  │  Advice  : " + c.getAdvice());
        System.out.println("  │");
        System.out.println("  │  Known Symptoms of this condition:");
        for (String s : c.getMatchingSymptoms()) {
            System.out.println("  │    - " + s);
        }
        System.out.println("  └" + "─".repeat(55));
        System.out.println();
    }

    public static void printEmergencyWarning() {
        System.out.println();
        System.out.println("  🚨 EMERGENCY WARNING:");
        System.out.println("  One or more HIGH severity conditions were detected.");
        System.out.println("  Please seek immediate medical attention or visit the");
        System.out.println("  nearest hospital / call emergency services.");
        System.out.println();
    }

    public static void printGoodbye() {
        System.out.println();
        System.out.println("  Thank you for using the Symptom Checker.");
        System.out.println("  Stay healthy! 🌿");
        System.out.println();
    }
}
