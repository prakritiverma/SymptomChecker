public class Symptom {
    private String name;
    private String category;

    public Symptom(String name, String category) {
        this.name = name.toLowerCase().trim();
        this.category = category;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return name + " [" + category + "]";
    }
}
