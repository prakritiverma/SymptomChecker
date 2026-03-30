import java.util.List;
import java.util.ArrayList;

public class Condition {
    private String name;
    private List<String> matchingSymptoms;
    private String description;
    private String advice;
    private String severity; // LOW, MEDIUM, HIGH

    public Condition(String name, List<String> matchingSymptoms, String description, String advice, String severity) {
        this.name = name;
        this.matchingSymptoms = matchingSymptoms;
        this.description = description;
        this.advice = advice;
        this.severity = severity;
    }

    public String getName() { return name; }
    public List<String> getMatchingSymptoms() { return matchingSymptoms; }
    public String getDescription() { return description; }
    public String getAdvice() { return advice; }
    public String getSeverity() { return severity; }

    // Returns how many of user's symptoms match this condition
    public int matchScore(List<String> userSymptoms) {
        int score = 0;
        for (String s : userSymptoms) {
            if (matchingSymptoms.contains(s.toLowerCase().trim())) {
                score++;
            }
        }
        return score;
    }

    // Returns match percentage
    public double matchPercent(List<String> userSymptoms) {
        if (matchingSymptoms.isEmpty()) return 0;
        return (matchScore(userSymptoms) * 100.0) / matchingSymptoms.size();
    }
}
