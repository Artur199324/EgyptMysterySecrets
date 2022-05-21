package com.ludo.kin;

import android.app.Application;
import android.view.View;

import androidx.lifecycle.ViewModelProvider;

import com.ludo.kin.ViewModEMS.ViewModEMS;

public class AppEMS extends Application {
   public static ViewModEMS viewModEMS;
    @Override
    public void onCreate() {
        super.onCreate();

        viewModEMS = new ViewModelProvider.AndroidViewModelFactory(this).create(ViewModEMS.class);
    }
}
