import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SessionLogger {

    private static final String LOG_FILE = "session_log.txt";

    public static void log(String userName, int age, List<String> symptoms, List<DiagnosisResult> results) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            writer.println("=".repeat(60));
            writer.println("Session Date : " + dtf.format(LocalDateTime.now()));
            writer.println("Patient Name : " + userName);
            writer.println("Age          : " + age);
            writer.println("Symptoms     : " + String.join(", ", symptoms));
            writer.println("--- Results ---");
            if (results.isEmpty()) {
                writer.println("No conditions matched.");
            } else {
                for (DiagnosisResult r : results) {
                    writer.printf("  %-30s | Score: %d | Match: %.1f%% | Severity: %s%n",
                        r.getCondition().getName(),
                        r.getMatchScore(),
                        r.getMatchPercent(),
                        r.getCondition().getSeverity());
                }
            }
            writer.println("=".repeat(60));
            writer.println();
        } catch (IOException e) {
            System.out.println("[Warning] Could not write to log file: " + e.getMessage());
        }
    }
}
