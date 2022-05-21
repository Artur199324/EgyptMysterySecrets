package com.ludo.kin.modEMS;

import android.app.Activity;
import android.content.Context;

public class SaveEMS {

    private int vi;
    private int de;
    public Activity activity;
    public Activity activityll;
    
    public void setActivity(Activity activity) {
        this.activity = activity;
    }



    public int getVi() {
        vi = activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).getInt("vi",0);
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
        activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("vi", vi).apply();
    }

    public int getDe() {
        de =  activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).getInt("de",0);
        return de;
    }

    public void setDe(int de) {
        this.de = de;
        activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("de", de).apply();
    }

   

    public void mm(String ssff){
        activityll.getSharedPreferences(activityll.getPackageName(),Context.MODE_PRIVATE).edit().putString("bbb",ssff).apply();
    }

    public String bb(){
        return  activityll.getSharedPreferences(activityll.getPackageName(),Context.MODE_PRIVATE).getString("bbb","bbb");
    }
}
