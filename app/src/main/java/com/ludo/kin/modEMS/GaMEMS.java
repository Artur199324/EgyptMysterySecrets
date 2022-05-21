package com.ludo.kin.modEMS;

import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.ludo.kin.R;

import java.util.Random;

public class GaMEMS {

    int v = 0;
    ImageView imageView;
    ImageView imageView1;
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public ImageView getImageView1() {
        return imageView1;
    }

    public void setImageView1(ImageView imageView1) {
        this.imageView1 = imageView1;
    }
    boolean a1 = false;
    boolean a2 = false;
    boolean a3 = false;
    boolean a4 = false;

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public boolean isA1() {
        return a1;
    }

    public boolean isA2() {
        return a2;
    }

    public boolean isA3() {
        return a3;
    }

    public boolean isA4() {
        return a4;
    }

    public void jj(){

        Handler handler = new Handler();
        Random random = new Random();
        handler.post(new Runnable() {
            @Override
            public void run() {
                switch (random.nextInt(4)){
                    case 0:
                        imageView.setImageResource(R.drawable.ff1);
                        imageView.setTag(1);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.ff2);
                        imageView.setTag(2);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.ff3);
                        imageView.setTag(3);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.ff4);
                        imageView.setTag(4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView1.setImageResource(R.drawable.ff1);
                        imageView1.setTag(1);
                        break;
                    case 1:
                        imageView1.setImageResource(R.drawable.ff2);
                        imageView1.setTag(2);
                        break;
                    case 2:
                        imageView1.setImageResource(R.drawable.ff3);
                        imageView1.setTag(3);
                        break;
                    case 3:
                        imageView1.setImageResource(R.drawable.ff4);
                        imageView1.setTag(4);
                        break;
                }

                v++;
                if (v!=30){
                    handler.postDelayed(this::run,50);
                }else {
                    v = 0;
                    int a = (int) imageView.getTag();
                    int b = (int)  imageView1.getTag();


                    if (a == 1 && b == 1){

                        setA1(true);
                    }
                    if (a == 2 && b == 2){
                  ;
                        setA2(true);
                    }

                    if (a == 3 && b == 3){
                     ;
                        setA3(true);
                    }

                    if (a == 4 && b == 4){

                        setA4(true);
                    }

                }

            }
        });

    }


    public void gg(){
        Handler handler = new Handler();
        Random random = new Random();
        handler.post(new Runnable() {
            @Override
            public void run() {

                switch (random.nextInt(4)){
                    case 0:
                        imageView1.setImageResource(R.drawable.ff1);
                        imageView1.setTag(1);
                        break;
                    case 1:
                        imageView1.setImageResource(R.drawable.ff2);
                        imageView1.setTag(2);
                        break;
                    case 2:
                        imageView1.setImageResource(R.drawable.ff3);
                        imageView1.setTag(3);
                        break;
                    case 3:
                        imageView1.setImageResource(R.drawable.ff4);
                        imageView1.setTag(4);
                        break;
                }

                v++;
                if (v!=30){
                    handler.postDelayed(this::run,50);
                }else {
                    v = 0;

                    b = (int)  imageView1.getTag();


                }

            }
        });
    }

}
