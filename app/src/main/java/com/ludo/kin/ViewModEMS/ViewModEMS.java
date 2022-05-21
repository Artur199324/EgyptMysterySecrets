package com.ludo.kin.ViewModEMS;

import android.app.Activity;
import android.app.Application;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

<<<<<<< HEAD
import com.ludo.kin.actEMS.EMSActivity;
import com.ludo.kin.modEMS.AAA;
import com.ludo.kin.modEMS.FsssEMS;
import com.ludo.kin.modEMS.GaMEMS;
import com.ludo.kin.modEMS.KKKK;
import com.ludo.kin.modEMS.Onnnn;
=======
import com.ludo.kin.modEMS.GaMEMS;
>>>>>>> 9b95799 (sds)
import com.ludo.kin.modEMS.ProEMS;
import com.ludo.kin.modEMS.SaveEMS;

public class ViewModEMS extends AndroidViewModel {
    GaMEMS gaMEMS;
    SaveEMS saveEMS;
<<<<<<< HEAD
    KKKK kkkkk;
    AAA aaa;
    FsssEMS fsssEMS;
=======

>>>>>>> 9b95799 (sds)
    ProEMS proEMS;

    public ViewModEMS(@NonNull Application application) {
        super(application);
        saveEMS = new SaveEMS();
<<<<<<< HEAD
        aaa = new AAA();
        Onnnn onnnn= new Onnnn();
        onnnn.oooo(application);
        proEMS = new ProEMS();
    }

    public void pppp(ImageView u1, ImageView u2, ImageView u3){
        proEMS.pppr(u1,u2,u3);
    }

    public void bbbd(EMSActivity emsActivity){
        saveEMS.setActivityll(emsActivity);
    }

    public void njjn(String fgds){
        saveEMS.setHhj(fgds);
    }

    public String mkk(){
        return saveEMS.getHhj();
    }

    public void aa(EMSActivity emsActivity){
        fsssEMS = new FsssEMS(aaa);
        aaa.aaa(emsActivity,fsssEMS);
    }

    public KKKK kk(EMSActivity emsActivity){
        kkkkk = new KKKK(emsActivity);
        kkkkk.kkkDev();
        kkkkk.kkkInter();
        return kkkkk;
    }
=======
        proEMS = new ProEMS();
    }

>>>>>>> 9b95799 (sds)

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
