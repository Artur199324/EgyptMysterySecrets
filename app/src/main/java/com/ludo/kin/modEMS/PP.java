package com.ludo.kin.modEMS;

import static com.ludo.kin.actEMS.EMSActivity.decodeEMS;

import android.util.Log;

import com.ludo.kin.R;
import com.ludo.kin.actEMS.EMSActivity;

public class PP {


    AAA aaa;

    public PP(AAA aaa) {
        this.aaa = aaa;
    }

    public void ppp(EMSActivity emsActivity, String ss) {

        if (ss != null) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] fsfe = ss.split("_");
            String[] jsew = {decodeEMS("EZZXKYRRHU======"), decodeEMS("EZZXKYRSHU======"), decodeEMS("EZZXKYRTHU======"), decodeEMS("EZZXKYRUHU======"), decodeEMS("EZZXKYRVHU======"), decodeEMS("EZZXKYRWHU======"), decodeEMS("EZZXKYRXHU======"), decodeEMS("EZZXKYRYHU======"), decodeEMS("EZZXKYRZHU======"), decodeEMS("EZZXKYRRGA6Q====")};

                for (int i = 0; i < jsew.length; i++) {
                    try {
                        stringBuilder.append(jsew[i]);
                        stringBuilder.append(fsfe[i]);
                    }catch (Exception e){

                    }

                }

            String ff = emsActivity.urlEMS + decodeEMS("H5WWKZDJMFPXG33VOJRWKPI=") + aaa.media_sourceEMS + stringBuilder + kkl(emsActivity);
            Log.d("weq", ff);

            emsActivity.stst(ff);
        } else {
            Log.d("weq", "orgggg");
            if (emsActivity.statusEMS.equals("0")) {
                Log.d("weq", "game");
                emsActivity.sss();
            } else {
                String kll = emsActivity.urlEMS + oo(emsActivity);
                emsActivity.stst(kll);
                Log.d("weq", kll);
            }
        }

    }

    private String kkl(EMSActivity emsActivity) {
        String[] fwqif = {decodeEMS("EZRWC3LQMFUWO3R5"), decodeEMS("EZTW633HNRSV6YLENFSD2==="), decodeEMS("EZQWMX3VONSXE2LEHU======"), decodeEMS("EZQWMX3DNBQW43TFNQ6Q===="), decodeEMS("EZSGK5S7NNSXSPI="), decodeEMS("EZRHK3TENRST2==="), decodeEMS("EZTGEX3BOBYF62LEHU======"), decodeEMS("EZTGEX3BOQ6Q====")};
        String[] bbfs = {aaa.campaignEMS, aaa.AIDEMS, aaa.apps_idEMS, aaa.af_channelEMS, "hgZGqWAvxfhKcbDgAANYzB", emsActivity.getPackageName(), emsActivity.getResources().getString(R.string.ffff), emsActivity.getResources().getString(R.string.tttt)};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < fwqif.length; i++) {
            stringBuilder.append(fwqif[i]);
            stringBuilder.append(bbfs[i]);
        }
        return stringBuilder.toString();
    }

    private String oo(EMSActivity emsActivity) {
        String[] kfsh = {decodeEMS("EZRWC3LQMFUWO3R5"), decodeEMS("EZTW633HNRSV6YLENFSD2==="), decodeEMS("EZQWMX3VONSXE2LEHU======"), decodeEMS("EZQWMX3DNBQW43TFNQ6Q===="), decodeEMS("EZSGK5S7NNSXSPI="), decodeEMS("EZRHK3TENRST2==="), decodeEMS("EZTGEX3BOBYF62LEHU======"), decodeEMS("EZTGEX3BOQ6Q====")};
        String dfs = kfsh[1] + aaa.AIDEMS;
        String fsfs = kfsh[2] + aaa.apps_idEMS;
        String fsdfse = kfsh[3] + aaa.af_channelEMS;
        String fses = kfsh[4] + "hgZGqWAvxfhKcbDgAANYzB";
        String tre = kfsh[5] + emsActivity.getPackageName();
        String hhgf = kfsh[6] + emsActivity.getResources().getString(R.string.ffff);
        String jju = kfsh[7] + emsActivity.getResources().getString(R.string.tttt);
        String kkkh = decodeEMS("H5WWKZDJMFPXG33VOJRWKPLPOJTWC3TJMM======") + dfs + fsfs
                + fsdfse + fses + tre + hhgf + jju;
        return kkkh;
    }
}
