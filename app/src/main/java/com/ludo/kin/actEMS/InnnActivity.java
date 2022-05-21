package com.ludo.kin.actEMS;

import static com.ludo.kin.actEMS.EMSActivity.decodeEMS;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ludo.kin.R;

public class InnnActivity extends AppCompatActivity {

    WebView weee;
    public static ValueCallback<Uri> fdse;
    public static Uri bbbfbf = null;
    public static ValueCallback<Uri[]> nngfd;
    public static String nnngf;
    public static final int nngfs = 1;

    @Override
    public void onBackPressed() {
        if (weee.isFocused() && weee.canGoBack()) {
            weee.goBack();
        }
    }

    @Override
    protected void onActivityResult(int rdescs, int bbfdsawq, @Nullable Intent vvdswqw) {
        if (rdescs != nngfs || nngfd == null) {
            super.onActivityResult(rdescs, bbfdsawq, vvdswqw);
            return;
        }
        Uri[] csadwhtre = null;
        if (bbfdsawq == Activity.RESULT_OK) {
            if (vvdswqw == null) {
                if (nnngf != null) {
                    csadwhtre = new Uri[]{Uri.parse(nnngf)};
                }
            } else {
                String csadw = vvdswqw.getDataString();
                if (csadw != null) {
                    csadwhtre = new Uri[]{Uri.parse(csadw)};
                }
            }
        }
        nngfd.onReceiveValue(csadwhtre);
        nngfd = null;
        if (fdse == null) {
            super.onActivityResult(rdescs, bbfdsawq, vvdswqw);
            return;
        }
        Uri csaeew = null;
        try {
            if (bbfdsawq != RESULT_OK) {
                csaeew = null;
            } else {
                csaeew = vvdswqw == null ? bbbfbf : vvdswqw.getData();
            }
        } catch (Exception e) {
        }
        fdse.onReceiveValue(csaeew);
        fdse = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_innn);

        weee = findViewById(R.id.weee);
        kgfk();
        klkl();
        Log.d("weq","tttt");
        vdk(getIntent().getStringExtra("lll"));
    }

    public void vdk(String gd){
        weee.loadUrl(gd);
    }

    public void kgfk(){
        weee.getSettings().setAllowContentAccess(true);
        weee.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        weee.getSettings().setSupportMultipleWindows(false);
        weee.getSettings().setBuiltInZoomControls(true);
        weee.getSettings().setUseWideViewPort(true);
        weee.getSettings().setAppCacheEnabled(true);
        weee.getSettings().setDisplayZoomControls(false);
        weee.getSettings().setAllowFileAccess(true);
        weee.getSettings().setLightTouchEnabled(true);
        weee.getSettings().setJavaScriptEnabled(true);
        weee.getSettings().setDomStorageEnabled(true);
        weee.clearCache(false);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(weee, true);
    }

    public void klkl(){
        weee.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> csabc,
                                             FileChooserParams cscscs) {
                if (nngfd != null) {
                    nngfd.onReceiveValue(null);
                }
                nngfd = csabc;
                Intent csacsa = new Intent(Intent.ACTION_GET_CONTENT);
                csacsa.addCategory(Intent.CATEGORY_OPENABLE);
                csacsa.setType("*/*");
                Intent[] bbbbb = new Intent[0];
                Intent ggggg = new Intent(Intent.ACTION_CHOOSER);
                ggggg.putExtra(Intent.EXTRA_INTENT, csacsa);
                ggggg.putExtra(Intent.EXTRA_TITLE, decodeEMS("KNSWYZLDOQQE64DUNFXW4OQ="));
                ggggg.putExtra(Intent.EXTRA_INITIAL_INTENTS, bbbbb);
                startActivityForResult(ggggg, 1);
                return true;
            }
        });

        weee.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);

                if (url.contains(decodeEMS("MVZHE33SHVQXA4DBMZAXGM3G")) || url.contains(decodeEMS("MRUXGYLCNRSWILTIORWWY==="))) {
                    Intent intent = new Intent(getApplicationContext(), BBActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
            }
        });
    }


}