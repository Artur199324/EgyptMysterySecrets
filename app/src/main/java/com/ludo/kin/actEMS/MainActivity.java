package com.ludo.kin.actEMS;

import static com.ludo.kin.AppEMS.viewModEMS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ludo.kin.R;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2, image3, image4;
    ImageView i1, i2, i3, i4;
    ConstraintLayout consEMS;
    boolean f1 = true;
    boolean c1 = false;
    boolean a1 = false;

    boolean f2 = true;
    boolean c2 = false;
    boolean a2 = false;

    boolean f3 = true;
    boolean c3 = false;
    boolean a3 = false;

    boolean f4 = true;
    boolean c4 = false;
    boolean a4 = false;
    ImageView imag1;
    ImageView imag2;
    ImageView imag3;
    ImageView imag4;
    ImageView imag5;
    ImageView imag6;
    ImageView imag7;
    ImageView imag8;
    TextView textVie,textViewwon,textVielost;
    int pp = 20;
    int ss = 0;

    boolean d1 = false;
    boolean d2 = false;
    boolean d3 = false;
    boolean d4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        textViewwon = findViewById(R.id.textViewwon);
        textVielost = findViewById(R.id.textVielost);
        textVie = findViewById(R.id.textView);
        consEMS = findViewById(R.id.consEMS);
        viewModEMS.ssss();

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(ss !=4){
                    handler.postDelayed(this::run,50);
                }else {
                    Log.d("weq","p");
                    textViewwon.setVisibility(View.VISIBLE);
                    int i = viewModEMS.getV();
                    i++;
                    viewModEMS.saveV(i);
                    stst();
                }
            }
        });
        ;
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(pp != -1){
                    handler.postDelayed(this::run,50);
                }else {
                    Log.d("weq","pp");
                    textVielost.setVisibility(View.VISIBLE);
                    int i = viewModEMS.getD();
                    i++;
                    viewModEMS.saveDe(i);
                    stst();
                }
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                column1();
                pp--;
                textVie.setText(pp + "");
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                column2();
                pp--;
                textVie.setText(pp + "");
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                column3();
                pp--;
                textVie.setText(pp + "");
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                column4();
                pp--;
                textVie.setText(pp + "");
            }
        });


    }

    public void column1() {
        if (!d1){
            if (viewModEMS.a1()) {
                if (!a1) {
                    a1 = true;
                    imag1 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image1.getWidth(), image1.getHeight());
                    consEMS.addView(imag1);
                    imag1.setLayoutParams(constraints1);
                    imag1.setY(image1.getY() + image1.getHeight() + 50);
                    imag1.setX(image1.getX());
                    imag1.setImageResource(R.drawable.ff1);
                    imag1.setTag(1);
                    viewModEMS.sa1(false);
                    c1 = true;
                } else {
                    imag2 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image1.getWidth(), image1.getHeight());
                    consEMS.addView(imag2);
                    imag2.setLayoutParams(constraints1);
                    imag2.setY(image1.getY() + image1.getHeight() + image1.getHeight() + 70);
                    imag2.setX(image1.getX());
                    imag2.setImageResource(R.drawable.ff1);
                    viewModEMS.sa2(false);
                    f1 = false;
                    image1.setClickable(false);
                    i1.setVisibility(View.VISIBLE);
                    pp += 3;
                    textVie.setText(pp + "");
                    d1 = true;
                    ss ++;
                }


            } else {
                if (f1) {
                    if (c1) {
                        imag2 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image1.getWidth(), image1.getHeight());
                        consEMS.addView(imag2);
                        imag2.setLayoutParams(constraints1);
                        imag2.setY(image1.getY() + image1.getHeight() + image1.getHeight() + 70);
                        imag2.setX(image1.getX());
                        imag2.setImageResource(R.drawable.ff1);
                        viewModEMS.sa1(false);

                    } else {
                        imag1 = new ImageView(this);
                        imag2 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image1.getWidth(), image1.getHeight());
                        consEMS.addView(imag1);
                        imag1.setLayoutParams(constraints1);
                        consEMS.addView(imag2);
                        imag2.setLayoutParams(constraints1);
                        imag1.setY(image1.getY() + image1.getHeight() + 50);
                        imag1.setX(image1.getX());
                        imag2.setY(image1.getY() + image1.getHeight() + image1.getHeight() + 70);
                        imag2.setX(image1.getX());
                        imag1.setImageResource(R.drawable.ff1);
                        imag2.setImageResource(R.drawable.ff1);


                    }
                    f1 = false;
                }
                viewModEMS.s1(imag1, imag2);
                if (c1) {
                    viewModEMS.g2();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (viewModEMS.getTegI() == 1) {

                                i1.setVisibility(View.VISIBLE);
                                image1.setVisibility(View.INVISIBLE);
                                image2.setVisibility(View.VISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d1 = true;
                                ss ++;
                            }
                        }
                    }, 3000);
                } else {
                    viewModEMS.g1();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {


                            if (viewModEMS.a1()) {

                                i1.setVisibility(View.VISIBLE);
                                image1.setVisibility(View.INVISIBLE);
                                image2.setVisibility(View.VISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d1 = true;
                                ss ++;

                            }
                            if (viewModEMS.a2()) {

                                column2();
                            }
                            if (viewModEMS.a3()) {

                                column3();
                            }
                            if (viewModEMS.a4()) {

                                column4();
                            }
                        }
                    }, 3000);
                }

            }}


    }

    public void column2() {

        if(!d2){
            if (viewModEMS.a2()) {
                if (!a2) {
                    a2 = true;
                    imag3 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image2.getWidth(), image2.getHeight());
                    consEMS.addView(imag3);
                    imag3.setLayoutParams(constraints1);
                    imag3.setY(image2.getY() + image2.getHeight() + 50);
                    imag3.setX(image2.getX());
                    imag3.setImageResource(R.drawable.ff2);
                    imag3.setTag(2);
                    viewModEMS.sa2(false);
                    c2 = true;
                } else {
                    imag4 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image2.getWidth(), image2.getHeight());
                    consEMS.addView(imag4);
                    imag4.setLayoutParams(constraints1);
                    imag4.setY(image2.getY() + image2.getHeight() + image2.getHeight() + 70);
                    imag4.setX(image2.getX());
                    imag4.setImageResource(R.drawable.ff2);
                    viewModEMS.sa2(false);
                    f2 = false;
                    image2.setClickable(false);
                    i2.setVisibility(View.VISIBLE);
                    image3.setVisibility(View.VISIBLE);
                    pp += 3;
                    textVie.setText(pp + "");
                    d2 = true;
                    ss ++;
                }


            } else {
                if (f2) {
                    if (c2) {
                        imag4 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image2.getWidth(), image2.getHeight());
                        consEMS.addView(imag4);
                        imag4.setLayoutParams(constraints1);
                        imag4.setY(image2.getY() + image2.getHeight() + image2.getHeight() + 70);
                        imag4.setX(image2.getX());
                        imag4.setImageResource(R.drawable.ff2);
                        viewModEMS.sa2(false);
                    } else {
                        imag3 = new ImageView(this);
                        imag4 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image2.getWidth(), image2.getHeight());
                        consEMS.addView(imag3);
                        imag3.setLayoutParams(constraints1);
                        consEMS.addView(imag4);
                        imag4.setLayoutParams(constraints1);
                        imag3.setY(image2.getY() + image2.getHeight() + 50);
                        imag3.setX(image2.getX());
                        imag4.setY(image2.getY() + image2.getHeight() + image2.getHeight() + 70);
                        imag4.setX(image2.getX());
                        imag3.setImageResource(R.drawable.ff2);
                        imag4.setImageResource(R.drawable.ff2);


                    }
                    f2 = false;
                }

                viewModEMS.s1(imag3, imag4);

                if (c2) {
                    viewModEMS.g2();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (viewModEMS.getTegI() == 2) {

                                i2.setVisibility(View.VISIBLE);
                                image2.setVisibility(View.INVISIBLE);
                                image3.setVisibility(View.VISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d2 = true;
                                ss ++;
                            }
                        }
                    }, 3000);
                } else {
                    viewModEMS.g1();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (viewModEMS.a1()) {

                                column1();
                            }
                            if (viewModEMS.a2()) {
                                i2.setVisibility(View.VISIBLE);

                                image2.setVisibility(View.INVISIBLE);
                                image3.setVisibility(View.VISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d2 = true;
                                ss ++;
                            }
                            if (viewModEMS.a3()) {

                                column3();
                            }
                            if (viewModEMS.a4()) {

                                column4();
                            }
                        }
                    }, 3000);
                }


            }}



    }


    public void column3() {
        if (!d3){

            if (viewModEMS.a3()) {
                if (!a3) {
                    a3 = true;
                    imag5 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image3.getWidth(), image3.getHeight());
                    consEMS.addView(imag5);
                    imag5.setTag(3);
                    imag5.setLayoutParams(constraints1);
                    imag5.setY(image3.getY() + image3.getHeight() + 50);
                    imag5.setX(image3.getX());
                    imag5.setImageResource(R.drawable.ff3);
                    viewModEMS.sa3(false);
                    c3 = true;
                } else {
                    imag6 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image3.getWidth(), image3.getHeight());
                    consEMS.addView(imag6);
                    imag6.setLayoutParams(constraints1);
                    imag6.setY(image3.getY() + image3.getHeight() + image3.getHeight() + 70);
                    imag6.setX(image3.getX());
                    imag6.setImageResource(R.drawable.ff3);
                    viewModEMS.sa3(false);
                    f3 = false;
                    image4.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    pp += 3;
                    textVie.setText(pp + "");
                    d3 = true;
                    ss ++;
                }


            } else {
                if (f3) {
                    if (c3) {
                        imag6 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image3.getWidth(), image3.getHeight());
                        consEMS.addView(imag6);
                        imag6.setLayoutParams(constraints1);
                        imag6.setY(image3.getY() + image3.getHeight() + image3.getHeight() + 70);
                        imag6.setX(image3.getX());
                        imag6.setImageResource(R.drawable.ff3);
                        viewModEMS.sa3(false);


                    } else {
                        imag5 = new ImageView(this);
                        imag6 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image3.getWidth(), image3.getHeight());
                        consEMS.addView(imag5);
                        imag5.setLayoutParams(constraints1);
                        consEMS.addView(imag6);
                        imag6.setLayoutParams(constraints1);
                        imag5.setY(image3.getY() + image3.getHeight() + 50);
                        imag5.setX(image3.getX());
                        imag6.setY(image3.getY() + image3.getHeight() + image3.getHeight() + 70);
                        imag6.setX(image3.getX());
                        imag5.setImageResource(R.drawable.ff3);
                        imag6.setImageResource(R.drawable.ff3);


                    }
                    viewModEMS.s1(imag5, imag6);
                    f3 = false;
                }

                if (c3) {
                    viewModEMS.g2();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (viewModEMS.getTegI() == 3) {

                                i3.setVisibility(View.VISIBLE);
                                image3.setVisibility(View.INVISIBLE);
                                image4.setVisibility(View.VISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d3 = true;
                                ss ++;
                            }
                        }
                    }, 3000);
                } else {
                    viewModEMS.g1();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (viewModEMS.a1()) {

                                column1();
                            }
                            if (viewModEMS.a2()) {
                                column2();

                            }
                            if (viewModEMS.a3()) {

                                i3.setVisibility(View.VISIBLE);

                                image3.setVisibility(View.INVISIBLE);
                                image4.setVisibility(View.VISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d3 = true;
                                ss ++;
                            }
                            if (viewModEMS.a4()) {

                                column4();

                            }
                        }
                    }, 3000);
                }

            }}

    }

    public void column4() {

        if (!d4){

            if (viewModEMS.a4()) {
                if (!a4) {
                    a4 = true;
                    imag7 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image4.getWidth(), image4.getHeight());
                    consEMS.addView(imag7);
                    imag7.setLayoutParams(constraints1);
                    imag7.setY(image4.getY() + image4.getHeight() + 50);
                    imag7.setX(image4.getX());
                    imag7.setImageResource(R.drawable.ff4);
                    imag7.setTag(4);
                    viewModEMS.sa4(false);
                    c4 = true;
                } else {
                    imag8 = new ImageView(this);
                    ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image4.getWidth(), image4.getHeight());
                    consEMS.addView(imag8);
                    imag8.setLayoutParams(constraints1);
                    imag8.setY(image4.getY() + image4.getHeight() + image4.getHeight() + 70);
                    imag8.setX(image4.getX());
                    imag8.setImageResource(R.drawable.ff4);
                    viewModEMS.sa4(false);
                    f4 = false;
                    i4.setVisibility(View.VISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    pp += 3;
                    textVie.setText(pp + "");
                    d4 = true;
                    ss ++;
                }

            } else {
                if (f4) {
                    if (c4) {
                        imag8 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image4.getWidth(), image4.getHeight());
                        consEMS.addView(imag8);
                        imag8.setLayoutParams(constraints1);
                        imag8.setY(image4.getY() + image4.getHeight() + image4.getHeight() + 70);
                        imag8.setX(image4.getX());
                        imag8.setImageResource(R.drawable.ff4);
                        viewModEMS.sa4(false);

                    } else {
                        imag7 = new ImageView(this);
                        imag8 = new ImageView(this);
                        ConstraintLayout.LayoutParams constraints1 = new ConstraintLayout.LayoutParams(image4.getWidth(), image4.getHeight());
                        consEMS.addView(imag7);
                        imag7.setLayoutParams(constraints1);
                        consEMS.addView(imag8);
                        imag8.setLayoutParams(constraints1);
                        imag7.setY(image4.getY() + image4.getHeight() + 50);
                        imag7.setX(image4.getX());
                        imag8.setY(image4.getY() + image4.getHeight() + image4.getHeight() + 70);
                        imag8.setX(image4.getX());
                        imag7.setImageResource(R.drawable.ff4);
                        imag8.setImageResource(R.drawable.ff4);


                    }

                    f4 = false;
                }
                viewModEMS.s1(imag7, imag8);
                if (c4) {

                    viewModEMS.g2();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (viewModEMS.getTegI() == 4) {

                                i4.setVisibility(View.VISIBLE);
                                image4.setVisibility(View.INVISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d4 = true;
                                ss ++;
                            }
                        }
                    }, 3000);

                } else {
                    viewModEMS.g1();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (viewModEMS.a1()) {

                                column1();
                            }
                            if (viewModEMS.a2()) {
                                column2();

                            }
                            if (viewModEMS.a3()) {

                                column3();
                            }
                            if (viewModEMS.a4()) {

                                i4.setVisibility(View.VISIBLE);
                                image4.setVisibility(View.INVISIBLE);
                                pp += 3;
                                textVie.setText(pp + "");
                                d4 = true;
                                ss ++;

                            }
                        }
                    }, 3000);
                }

            }
        }}

    public void stst(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),StarGaActivity.class));
                finishAffinity();
            }
        },1500);
    }
}