package com.example.arturmusayelyan.slidenerd1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by artur.musayelyan on 25/10/2017.
 */

public class LinerLayoutByCode extends AppCompatActivity {
    private LinearLayout main;
    private TextView tv1;
    private Button btn1;
    private LinearLayout.LayoutParams mainDimensions, tv1Dimensions, btn1Dimensions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        main = new LinearLayout(this);
        tv1 = new TextView(this);
        btn1 = new Button(this);

        mainDimensions = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        main.setLayoutParams(mainDimensions);
        main.setOrientation(LinearLayout.VERTICAL);

        tv1Dimensions = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tv1.setLayoutParams(tv1Dimensions);
        tv1.setText("Hello World");

        btn1Dimensions = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btn1.setLayoutParams(btn1Dimensions);
        btn1.setText("Button here");

        main.addView(tv1);
        main.addView(btn1);

        setContentView(main);

    }

}
