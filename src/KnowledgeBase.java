import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KnowledgeBase {

    private List<Condition> conditions;

    public KnowledgeBase() {
        conditions = new ArrayList<>();
        loadConditions();
    }

    private void loadConditions() {

        // Common Cold
        conditions.add(new Condition(
            "Common Cold",
            Arrays.asList("runny nose", "sneezing", "sore throat", "cough", "mild fever", "headache", "fatigue"),
            "A viral infection of the upper respiratory tract.",
            "Rest, stay hydrated, take steam inhalation. OTC medicines like paracetamol may help. Usually resolves in 7-10 days.",
            "LOW"
        ));

        // Influenza (Flu)
        conditions.add(new Condition(
            "Influenza (Flu)",
            Arrays.asList("high fever", "chills", "body ache", "headache", "fatigue", "cough", "sore throat", "loss of appetite"),
            "A contagious respiratory illness caused by influenza viruses.",
            "Rest and fluids are essential. Consult a doctor if symptoms are severe or you belong to a high-risk group.",
            "MEDIUM"
        ));

        // Typhoid
        conditions.add(new Condition(
            "Typhoid Fever",
            Arrays.asList("high fever", "weakness", "stomach pain", "headache", "loss of appetite", "diarrhea", "constipation", "rash"),
            "A bacterial infection caused by Salmonella typhi, common in areas with poor sanitation.",
            "See a doctor immediately. Requires antibiotic treatment. Avoid self-medication.",
            "HIGH"
        ));

        // Dengue
        conditions.add(new Condition(
            "Dengue Fever",
            Arrays.asList("high fever", "severe headache", "pain behind eyes", "joint pain", "muscle pain", "rash", "mild bleeding", "fatigue"),
            "A mosquito-borne viral disease, common in tropical regions like Madhya Pradesh.",
            "Seek medical care immediately. Monitor platelet count. Avoid aspirin/ibuprofen. Stay hydrated.",
            "HIGH"
        ));

        // Malaria
        conditions.add(new Condition(
            "Malaria",
            Arrays.asList("high fever", "chills", "sweating", "headache", "nausea", "vomiting", "muscle pain", "fatigue"),
            "A mosquito-borne disease caused by Plasmodium parasites.",
            "Seek medical attention immediately. Blood test required for confirmation. Requires anti-malarial treatment.",
            "HIGH"
        ));

        // COVID-19
        conditions.add(new Condition(
            "COVID-19",
            Arrays.asList("fever", "dry cough", "fatigue", "loss of smell", "loss of taste", "shortness of breath", "body ache", "sore throat"),
            "Infectious disease caused by the SARS-CoV-2 virus.",
            "Isolate yourself. Get tested. Consult a doctor if you have breathing difficulty. Monitor oxygen levels.",
            "HIGH"
        ));

        // Gastroenteritis
        conditions.add(new Condition(
            "Gastroenteritis",
            Arrays.asList("nausea", "vomiting", "diarrhea", "stomach pain", "cramps", "mild fever", "loss of appetite"),
            "Inflammation of the stomach and intestines, usually from a viral or bacterial infection.",
            "Stay hydrated with ORS. Eat light foods like rice and banana. Consult doctor if diarrhea persists beyond 2 days.",
            "MEDIUM"
        ));

        // Hypertension
        conditions.add(new Condition(
            "Hypertension (High BP)",
            Arrays.asList("headache", "dizziness", "blurred vision", "chest pain", "shortness of breath", "nosebleed", "fatigue"),
            "A condition where blood pressure in the arteries is persistently elevated.",
            "Consult a doctor for BP measurement. Reduce salt intake, exercise regularly, and take prescribed medication consistently.",
            "MEDIUM"
        ));

        // Diabetes (Type 2)
        conditions.add(new Condition(
            "Diabetes (Type 2)",
            Arrays.asList("frequent urination", "excessive thirst", "fatigue", "blurred vision", "slow healing", "weight loss", "numbness in feet"),
            "A metabolic disorder where the body cannot properly regulate blood sugar levels.",
            "Consult a doctor immediately for blood sugar testing. Manage with diet, exercise, and prescribed medication.",
            "MEDIUM"
        ));

        // Asthma
        conditions.add(new Condition(
            "Asthma",
            Arrays.asList("shortness of breath", "wheezing", "chest tightness", "cough", "difficulty breathing"),
            "A condition affecting the airways, causing breathing difficulties.",
            "Use prescribed inhaler. Avoid triggers like dust and smoke. Seek emergency care if inhaler is not relieving symptoms.",
            "MEDIUM"
        ));

        // Anemia
        conditions.add(new Condition(
            "Anemia",
            Arrays.asList("fatigue", "weakness", "pale skin", "shortness of breath", "dizziness", "cold hands", "headache"),
            "A condition where you don't have enough healthy red blood cells to carry oxygen.",
            "Get a blood test (CBC). Increase iron-rich foods. Doctor may prescribe iron supplements or investigate the cause.",
            "MEDIUM"
        ));

        // Migraine
        conditions.add(new Condition(
            "Migraine",
            Arrays.asList("severe headache", "nausea", "vomiting", "sensitivity to light", "sensitivity to sound", "blurred vision", "dizziness"),
            "A neurological condition causing intense, recurring headaches often on one side.",
            "Rest in a quiet dark room. OTC pain relievers may help. If frequent, consult a neurologist for preventive treatment.",
            "MEDIUM"
        ));

        // Chickenpox
        conditions.add(new Condition(
            "Chickenpox",
            Arrays.asList("itchy rash", "blisters", "fever", "fatigue", "loss of appetite", "headache"),
            "A highly contagious viral infection causing an itchy blister-like rash.",
            "Stay isolated. Use calamine lotion for itching. Avoid scratching. Consult doctor especially for children and adults.",
            "LOW"
        ));

        // UTI
        conditions.add(new Condition(
            "Urinary Tract Infection (UTI)",
            Arrays.asList("burning urination", "frequent urination", "cloudy urine", "pelvic pain", "mild fever", "back pain"),
            "A bacterial infection in any part of the urinary system.",
            "Drink lots of water. Consult a doctor for antibiotic prescription. Do not ignore or delay treatment.",
            "MEDIUM"
        ));

        // Jaundice
        conditions.add(new Condition(
            "Jaundice",
            Arrays.asList("yellow skin", "yellow eyes", "dark urine", "fatigue", "nausea", "abdominal pain", "loss of appetite"),
            "A condition causing yellowing of the skin and whites of the eyes due to excess bilirubin.",
            "Seek medical attention immediately. Requires blood and liver function tests. Avoid fatty foods and alcohol.",
            "HIGH"
        ));
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    // Returns all unique known symptoms for display
    public List<String> getAllSymptoms() {
        List<String> all = new ArrayList<>();
        for (Condition c : conditions) {
            for (String s : c.getMatchingSymptoms()) {
                if (!all.contains(s)) all.add(s);
            }
        }
        return all;
    }
}
