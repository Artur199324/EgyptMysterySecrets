package com.ludo.kin.modEMS;

import android.util.Log;

import androidx.annotation.Nullable;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.ludo.kin.actEMS.EMSActivity;

public class FsssEMS {
    String deepEMS = null;
    AAA aaa;

    public FsssEMS(AAA aaa) {
        this.aaa = aaa;
    }


    public void fsss(EMSActivity emsActivity) {

        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(emsActivity.getApplication());

        AppLinkData.fetchDeferredAppLinkData(emsActivity.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(emsActivity);

                }
                if (appLinkData != null) {

                    String[] kihbc = appLinkData.getTargetUri().toString().split("://");
                    deepEMS = kihbc[1];
                    Log.d("weq", "dep");
                    PP pp = new PP(aaa);
                    pp.ppp(emsActivity, deepEMS);

                } else {
                    Log.d("weq", "org");
                    PP pp = new PP(aaa);
                    pp.ppp(emsActivity, deepEMS);

                }
            }
        });
    }
}
