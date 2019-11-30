package kim.hyunwoo.doyouknowcs;

import java.util.ArrayList;

class Meal {
    ArrayList<MealModel> data;

    public Meal(ArrayList<MealModel> data) {
        this.data = data;
    }

    public ArrayList<MealModel> getData() {
        return data;
    }

    public void setData(ArrayList<MealModel> data) {
        this.data = data;
    }
}
