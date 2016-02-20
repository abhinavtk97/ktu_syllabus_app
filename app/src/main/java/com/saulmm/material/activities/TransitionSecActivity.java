package com.saulmm.material.activities;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.saulmm.material.R;
import com.saulmm.material.utils.AnimatorAdapter;
import com.saulmm.material.utils.TransitionAdapter;

public class TransitionSecActivity extends Activity {

    private static final int SCALE_DELAY = 30;
    private LinearLayout rowContainer;
    String m11,m12,m13,m21,m22,m23,m31,m32,m33,m41,m42,m43,m51,m52,m53,m61,m62,m63;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_sec);

        rowContainer = (LinearLayout) findViewById(R.id.row_container2);

        Slide slideExitTransition = new Slide(Gravity.BOTTOM);
        slideExitTransition.excludeTarget(android.R.id.navigationBarBackground, true);
        slideExitTransition.excludeTarget(android.R.id.statusBarBackground, true);
        Intent intent =getIntent();
        String value="";
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        if (intent.hasExtra("m11")){
            m11 =intent.getStringExtra("m11");
        }
        if (intent.hasExtra("m12")){
            m12 =intent.getStringExtra("m12");
        }
        if (intent.hasExtra("m13")){
            m13 =intent.getStringExtra("m13");
        }
        if (intent.hasExtra("m21")){
            m21 =intent.getStringExtra("m21");
        }
        if (intent.hasExtra("m22")){
            m22 =intent.getStringExtra("m22");
        }
        if (intent.hasExtra("m23")){
            m23 =intent.getStringExtra("m23");
        }
        if (intent.hasExtra("m31")){
            m31 =intent.getStringExtra("m31");
        }
        if (intent.hasExtra("m32")){
            m32 =intent.getStringExtra("m32");
        }
        if (intent.hasExtra("m33")){
            m33 =intent.getStringExtra("m33");
        }
        if (intent.hasExtra("m41")){
            m41 =intent.getStringExtra("m41");
        }
        if (intent.hasExtra("m42")){
            m42 =intent.getStringExtra("m42");
        }
        if (intent.hasExtra("m43")){
            m43 =intent.getStringExtra("m43");
        }
        if (intent.hasExtra("m51")){
            m51 =intent.getStringExtra("m51");
        }
        if (intent.hasExtra("m52")){
            m52 =intent.getStringExtra("m52");
        }
        if (intent.hasExtra("m53")){
            m53 =intent.getStringExtra("m53");
        }
        if (intent.hasExtra("m61")){
            m61 =intent.getStringExtra("m61");
        }
        if (intent.hasExtra("m62")){
            m62 =intent.getStringExtra("m62");
        }
        if (intent.hasExtra("m63")){
            m63 =intent.getStringExtra("m63");
        }

        TextView t1 = (TextView)findViewById(R.id.tm11);
        t1.setText(m11);
        TextView t2 = (TextView)findViewById(R.id.tm12);
        t2.setText(m12);
        TextView t3 = (TextView)findViewById(R.id.tm13);
        t3.setText(m13);
        TextView t4 = (TextView)findViewById(R.id.tm21);
        t4.setText(m21);
        TextView t5 = (TextView)findViewById(R.id.tm22);
        t5.setText(m22);
        TextView t6 = (TextView)findViewById(R.id.tm23);
        t6.setText(m23);
        TextView t7 = (TextView)findViewById(R.id.tm31);
        t7.setText(m31);
        TextView t8 = (TextView)findViewById(R.id.tm32);
        t8.setText(m32);
        TextView t9 = (TextView)findViewById(R.id.tm33);
        t9.setText(m33);
        TextView t10 = (TextView)findViewById(R.id.tm41);
        t10.setText(m41);
        TextView t11 = (TextView)findViewById(R.id.tm42);
        t11.setText(m42);
        TextView t12 = (TextView)findViewById(R.id.tm43);
        t12.setText(m43);
        TextView t13 = (TextView)findViewById(R.id.tm51);
        t13.setText(m51);
        TextView t14 = (TextView)findViewById(R.id.tm52);
        t14.setText(m52);
        TextView t15 = (TextView)findViewById(R.id.tm53);
        t15.setText(m53);
        TextView t16 = (TextView)findViewById(R.id.tm61);
        t16.setText(m61);
        TextView t17 = (TextView)findViewById(R.id.tm62);
        t17.setText(m62);
        TextView t18 = (TextView)findViewById(R.id.tm63);
        t18.setText(m63);





        getWindow().getEnterTransition().addListener(new TransitionAdapter() {

            @Override
            public void onTransitionEnd(Transition transition) {

                super.onTransitionEnd(transition);

                getWindow().getEnterTransition().removeListener(this);

                for (int i = 0; i < rowContainer.getChildCount(); i++) {

                    View rowView = rowContainer.getChildAt(i);
                    rowView.animate().setStartDelay(i * SCALE_DELAY)
                            .scaleX(1).scaleY(1);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {

        for (int i = 0; i < rowContainer.getChildCount(); i++) {

            View rowView = rowContainer.getChildAt(i);

            ViewPropertyAnimator propertyAnimator = rowView.animate()
                .setStartDelay(i * SCALE_DELAY)
                .scaleX(0).scaleY(0)
                .setListener(new AnimatorAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {

                        super.onAnimationEnd(animation);
                        finishAfterTransition();
                    }
                });
        }
    }
}
