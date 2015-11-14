package com.mx.lb.androidcircleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mx.lb.androidcircleimage.widget.RoundImageView;

public class MainActivity extends AppCompatActivity {

    private RoundImageView mQiQiu;
    private RoundImageView mMeinv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        mQiQiu= (RoundImageView) findViewById(R.id.id_qiqiu);

        mMeinv= (RoundImageView) findViewById(R.id.id_meinv);

        mQiQiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQiQiu.setType(RoundImageView.TYPE_ROUND);

            }
        });

        mMeinv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMeinv.setBorderRadius(90);
            }

        });

    }
}
