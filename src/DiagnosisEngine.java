import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagnosisEngine {

    private KnowledgeBase knowledgeBase;
    private static final int MIN_MATCH_SCORE = 2;      // At least 2 symptoms must match
    private static final double MIN_MATCH_PERCENT = 20.0; // At least 20% match

    public DiagnosisEngine() {
        this.knowledgeBase = new KnowledgeBase();
    }

    public List<DiagnosisResult> diagnose(List<String> userSymptoms) {
        List<DiagnosisResult> results = new ArrayList<>();

        for (Condition condition : knowledgeBase.getConditions()) {
            int score = condition.matchScore(userSymptoms);
            double percent = condition.matchPercent(userSymptoms);

            if (score >= MIN_MATCH_SCORE && percent >= MIN_MATCH_PERCENT) {
                results.add(new DiagnosisResult(condition, score, percent));
            }
        }

        Collections.sort(results);
        return results;
    }

    public KnowledgeBase getKnowledgeBase() {
        return knowledgeBase;
    }
}
