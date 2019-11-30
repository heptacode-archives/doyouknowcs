package kim.hyunwoo.doyouknowcs;

import java.util.ArrayList;

class MealModel {
    private String date;
    private String meal;
    private String img;
    ArrayList<String> allergyCodes;
    ArrayList<String> allergicFoods;

    public MealModel(String date, String meal, String img, ArrayList<String> allergyCodes, ArrayList<String> allergicFoods) {
        this.date = date;
        this.meal = meal;
        this.img = img;
        this.allergyCodes = allergyCodes;
        this.allergicFoods = allergicFoods;
    }

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ArrayList<String> getAllergyCodes() {
        return allergyCodes;
    }

    public void setAllergyCodes(ArrayList<String> allergyCodes) {
        this.allergyCodes = allergyCodes;
    }

    public ArrayList<String> getAllergicFoods() {
        return allergicFoods;
    }

    public void setAllergicFoods(ArrayList<String> allergicFoods) {
        this.allergicFoods = allergicFoods;
    }
}
