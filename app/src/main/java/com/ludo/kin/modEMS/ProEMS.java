package com.ludo.kin.modEMS;

import android.os.Handler;
import android.widget.ImageView;

import com.ludo.kin.R;

import java.util.Random;

public class ProEMS {

    public void pppr(ImageView u1, ImageView u2, ImageView u3){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                Random random = new Random();
                switch (random.nextInt(4)){
                    case 0:
                        u1.setImageResource(R.drawable.ff1);
                        break;
                    case 1:
                        u1.setImageResource(R.drawable.ff2);
                        break;
                    case 2:
                        u1.setImageResource(R.drawable.ff3);
                        break;
                    case 3:
                        u1.setImageResource(R.drawable.ff4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        u2.setImageResource(R.drawable.ff1);
                        break;
                    case 1:
                        u2.setImageResource(R.drawable.ff2);
                        break;
                    case 2:
                        u2.setImageResource(R.drawable.ff3);
                        break;
                    case 3:
                        u2.setImageResource(R.drawable.ff4);
                        break;
                }
                switch (random.nextInt(4)){
                    case 0:
                        u3.setImageResource(R.drawable.ff1);
                        break;
                    case 1:
                        u3.setImageResource(R.drawable.ff2);
                        break;
                    case 2:
                        u3.setImageResource(R.drawable.ff3);
                        break;
                    case 3:
                        u3.setImageResource(R.drawable.ff4);
                        break;
                }

                handler.postDelayed(this::run,100);
            }
        });
    }
}
