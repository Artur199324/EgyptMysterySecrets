package com.ludo.kin.ViewModEMS;

import android.app.Activity;
import android.app.Application;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.ludo.kin.modEMS.GaMEMS;
import com.ludo.kin.modEMS.ProEMS;
import com.ludo.kin.modEMS.SaveEMS;

public class ViewModEMS extends AndroidViewModel {
    GaMEMS gaMEMS;
    SaveEMS saveEMS;

    ProEMS proEMS;

    public ViewModEMS(@NonNull Application application) {
        super(application);
        saveEMS = new SaveEMS();
        proEMS = new ProEMS();
    }


    public void ssss(){
        gaMEMS = new GaMEMS();
    }

    public void sss(Activity activity){
        saveEMS.setActivity(activity);
    }

    public void saveV(int ss){
        saveEMS.setVi(ss);
    }

    public void saveDe(int ss){
        saveEMS.setDe(ss);
    }

    public int getV(){
        return saveEMS.getVi();
    }

    public int getD(){
        return saveEMS.getDe();
    }

    public void s1(ImageView imageView, ImageView imageView1) {
        gaMEMS.setImageView(imageView);
        gaMEMS.setImageView1(imageView1);
    }

    public int getTegI() {
        return gaMEMS.getB();
    }

    public void g2() {
        gaMEMS.gg();
    }

    public void g1() {
        gaMEMS.jj();
    }

    public boolean a1() {
        return gaMEMS.isA1();
    }

    public boolean a2() {
        return gaMEMS.isA2();
    }

    public boolean a3() {
        return gaMEMS.isA3();
    }

    public boolean a4() {
        return gaMEMS.isA4();
    }

    public void sa1(boolean d) {
        gaMEMS.setA1(d);
    }

    public void sa2(boolean d) {
        gaMEMS.setA2(d);
    }

    public void sa3(boolean d) {
        gaMEMS.setA3(d);
    }

    public void sa4(boolean d) {
        gaMEMS.setA4(d);
    }
}
