package com.ludo.kin.modEMS;

import android.content.Context;
import android.net.ConnectivityManager;
import android.provider.Settings;

import com.ludo.kin.actEMS.EMSActivity;

public class KKKK {

    int devEms;
    boolean interEms;
    EMSActivity emsActivity;

    public KKKK(EMSActivity emsActivity) {
        this.emsActivity = emsActivity;
    }

    public int getDevEms() {
        return devEms;
    }

    public void setDevEms(int devEms) {
        this.devEms = devEms;
    }

    public boolean isInterEms() {
        return interEms;
    }

    public void setInterEms(boolean interEms) {
        this.interEms = interEms;
    }

    public void kkkDev(){
        setDevEms( Settings.Secure.getInt(emsActivity.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0));
    }

    public void kkkInter(){

        String fds = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager) emsActivity.getSystemService(fds);
        if (cm.getActiveNetworkInfo() == null) {
            setInterEms(false);
        } else {
            setInterEms(true);
        }
    }
}
