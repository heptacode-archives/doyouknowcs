package kim.hyunwoo.doyouknowcs;

import java.util.ArrayList;

public class MealData {
    String date;
    String meal;
    String allergy;
    ArrayList<String> allergyList;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public ArrayList<String> getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(ArrayList<String> allergyList) {
        this.allergyList = allergyList;
    }

    public MealData(String date, String meal, String allergy, ArrayList<String> allergyList) {
        this.date = date;
        this.meal = meal;
        this.allergy = allergy;
        this.allergyList = allergyList;
    }
}

