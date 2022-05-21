package com.ludo.kin.modEMS;

import static com.ludo.kin.actEMS.EMSActivity.decodeEMS;

import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ludo.kin.actEMS.EMSActivity;
import com.onesignal.OneSignal;

import java.util.Map;

public class AAA {

    String AIDEMS;
    String apps_idEMS;
    String af_statusEMS;
    String media_sourceEMS;
    String af_channelEMS;
    String campaignEMS;

    public void aaa(EMSActivity emsActivity,FsssEMS fsssEMS) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AIDEMS = AdvertisingIdClient.getAdvertisingIdInfo(emsActivity.getApplicationContext()).getId();
                    OneSignal.setExternalUserId(AIDEMS);
                } catch (Exception e) {

                }
            }
        }).start();

        apps_idEMS = AppsFlyerLib.getInstance().getAppsFlyerUID(emsActivity.getApplicationContext());

        AppsFlyerLib.getInstance().init("hgZGqWAvxfhKcbDgAANYzB", new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                Log.d("weq", map.get(decodeEMS("MFTF643UMF2HK4Y=")).toString());
                af_statusEMS = map.get(decodeEMS("MFTF643UMF2HK4Y=")).toString();
                if (af_statusEMS.equals(decodeEMS("JZXW4LLPOJTWC3TJMM======"))) {

                    try {

                        af_channelEMS = map.get(decodeEMS("MFTF6Y3IMFXG4ZLM")).toString();
                    } catch (Exception e) {

                    }
                    try {
                        media_sourceEMS = map.get(decodeEMS("NVSWI2LBL5ZW65LSMNSQ====")).toString();
                    } catch (Exception e) {

                    }
                    try {
                        campaignEMS = map.get(decodeEMS("MNQW24DBNFTW4===")).toString();
                    } catch (Exception e) {

                    }
                    Log.d("weq","no org");

                    PP pp = new PP(AAA.this);
                    pp.ppp(emsActivity, campaignEMS);

                } else {
                    fsssEMS.fsss(emsActivity);

                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        }, emsActivity);
        AppsFlyerLib.getInstance().start(emsActivity);
    }
}
