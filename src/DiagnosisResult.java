public class DiagnosisResult implements Comparable<DiagnosisResult> {
    private Condition condition;
    private int matchScore;
    private double matchPercent;

    public DiagnosisResult(Condition condition, int matchScore, double matchPercent) {
        this.condition = condition;
        this.matchScore = matchScore;
        this.matchPercent = matchPercent;
    }

    public Condition getCondition() { return condition; }
    public int getMatchScore() { return matchScore; }
    public double getMatchPercent() { return matchPercent; }

    // Sort by match score descending
    @Override
    public int compareTo(DiagnosisResult other) {
        return Integer.compare(other.matchScore, this.matchScore);
    }
}
