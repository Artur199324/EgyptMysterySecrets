package com.ludo.kin.modEMS;

import android.app.Application;

import com.onesignal.OneSignal;

public class Onnnn {

    public void oooo(Application application){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(application);
        OneSignal.setAppId("4c69419b-edfe-43f1-aa9d-b72b6469d273");
    }
}
