package com.example.lab55;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    private Animation.AnimationListener animationListener;
    private Button btn_back;


    private void initVariables() {
        animationListener = new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }
            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(), "Animation Stopped",
                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        };
    }
    private void findViewsByIds() {
        btn_back = (Button) findViewById(R.id.btn_back);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initVariables();
        findViewsByIds();

       // final  Animation animation = AnimationUtils.loadAnimation(MainActivity4.this, R.anim.anim_move);
        //animation.setAnimationListener(animationListener);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNewActivity = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(iNewActivity);

                overridePendingTransition(R.anim.anim_bai3,R.anim.anim_fade_out);
            }
        });

    }


}