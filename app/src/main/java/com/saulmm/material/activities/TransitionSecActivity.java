package com.saulmm.material.activities;

import android.animation.Animator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.util.Pair;
import android.view.Gravity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.saulmm.material.R;
import com.saulmm.material.utils.AnimatorAdapter;
import com.saulmm.material.utils.TransitionAdapter;

public class TransitionSecActivity extends Activity {

    private static final int SCALE_DELAY = 30;
    private LinearLayout rowContainer;
    private View mFabButton;
    private View mHeader;
    String m11,m12,m13,m21,m22,m23,m31,m32,m33,m41,m42,m43,m51,m52,m53,m61,m62,m63,m009,m64;
    private Button mainBtn;
    String flag;




    private void openAlert(View view){
        AlertDialog.Builder alert= new AlertDialog.Builder(TransitionSecActivity.this);
        alert.setView(R.layout.dialogue);
        Intent intent1= getIntent();
        if (intent1.hasExtra("flag")){
            flag=intent1.getStringExtra("flag");
        }
        TextView t1= (TextView) findViewById(R.id.textView14);
        TextView t2= (TextView) findViewById(R.id.textView15);
        TextView t3= (TextView) findViewById(R.id.textView16);
        TextView t4= (TextView) findViewById(R.id.textView17);
        TextView t5= (TextView) findViewById(R.id.textView18);
        TextView t6= (TextView) findViewById(R.id.textView19);
        TextView t7= (TextView) findViewById(R.id.textView20);
        TextView t8= (TextView) findViewById(R.id.textView21);
        TextView t9= (TextView) findViewById(R.id.textView22);
        TextView t10= (TextView) findViewById(R.id.textView23);
        TextView t11= (TextView) findViewById(R.id.textView24);
        TextView t12= (TextView) findViewById(R.id.textView25);
        TextView t13= (TextView) findViewById(R.id.textView26);
        TextView t14= (TextView) findViewById(R.id.textView27);
        switch (flag){
            case "1":
                t1.setText("Course No. :  BE101-01");
                t2.setText("Course Name: INTRODUCTION TO CIVIL ENGINEERING");
                t3.setText("L-T-P-Credits:  2-1-0-3");
                t4.setText("Year of Introduction: 2015");
                t5.setText("Course Objectives:");
                t6.setText("1.    To provide the students an overview of the profession of Civil Engineering.\n" +
                        "2.    To give the students an illustration of the use and properties of various building materials and explain the building construction aspects.");
                t7.setText("Syllabus: ");
                t8.setText("Civil Engineering as a profession; General introduction to history of Civil Engineering; types and classification of buildings; setting out of a building;   Building materials - Stones, Bricks, Tiles, Cement, Aggregate, Cement mortar,  Timber, Steel;  Building Construction - Stone Masonry, Brick Masonry, Floors and flooring, Roofs and roof coverings.  ");
                t9.setText("Expected outcome:  ");
                t10.setText("1.    Students will be able to explain the importance of Civil Engineering in the infrastructural development of the society.\n" +
                        "2.    They will be able to illustrate the types, uses and properties of various building materials.\n" +
                        "3.    Students will be able to explain the method of construction of different components of a building.");
                t11.setText("Text Book:");
                t12.setText("1.    Satheesh Gopi, Basic Civil Engineering, Pearson Publishers\n" +
                        "2.    Ketki Rangwala Dalal, Essentials of Civil Engineering, Charotar Publishing House");
                t13.setText("References:");
                t14.setText("1.    Anurag A. Kandya, Elements of Civil Engineering, Charotar Publishing house\n" +
                        "2.    Rangwala S C and Ketki B Dalal, Engineering Materials, Charotar Publishing house\n" +
                        "3.    Rangwala S C and Ketki B Dalal, Building Construction, Charotar Publishing house\n" +
                        "4.    Michael S Mamlouk and John P Zaniewski, Materials for Civil and Construction Engineering, Pearson Publishers.\n" +
                        "5.    McKay, W. B. and McKay, J. K., Building Construction Volumes 1 to 4, Person India Education Services\n" +
                        "6.    W. F. Chen and J. Y. Richard Liew (Eds.), The Civil Engineering Handbook, Second Edition, CRC Press (Taylor and Francis)");
                break;
            case "2":
                t1.setText("asd");
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case "10":
                break;
            case "11":
                break;
            case "12":
                break;
            case "13":
                break;
            case "14":
                break;
            case "15":
                break;
            case "16":
                break;
            case "17":
                break;
            case "18":
                break;
            case "19":
                break;
            case "20":
                break;
            case "21":
                break;
            case "22":
                break;

        }

        alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                TransitionSecActivity.this.finish();

            }
        });
        AlertDialog alertDialog = alert.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_sec);

        mainBtn = (Button) findViewById(R.id.fab_button);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                openAlert(v);
            }
        });


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
        m009="";

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

        if (intent.hasExtra("m009")){
            m009=intent.getStringExtra("m009");
        }
        if (intent.hasExtra("m64")){
            m64=intent.getStringExtra("m64");
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

        if (m009!=""){
            TextView t19 = (TextView)findViewById(R.id.textView7);
            TextView t20 = (TextView)findViewById(R.id.textView8);
            TextView t21 = (TextView)findViewById(R.id.textView9);
            TextView t22 = (TextView)findViewById(R.id.textView10);
            TextView t23 = (TextView)findViewById(R.id.textView11);
            TextView t24 = (TextView)findViewById(R.id.textView12);
            TextView t64 = (TextView)findViewById(R.id.textView13);
            t19.setText("");
            t20.setText("");
            t21.setText("");
            t22.setText("");
            t23.setText("");
            t24.setText("");
            t64.setText(m64);
            t1.setTextColor(this.getResources().getColor(R.color.theme_dialer_primary));
            t1.setGravity(Gravity.CENTER);
            t1.setTextSize(20);


        }


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
