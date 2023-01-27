package com.example.lab55;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private Button btnFadeInXml, btnFadeInCode, btnFadeOutXml, btnFadeOutCode,
            btnBlinkXml,
            btnBlinkCode, btnZoomInXml, btnZoomInCode, btnZoomOutXml,
            btnZoomOutCode, btnRotateXml,
            btnRotateCode, btnMoveXml, btnMoveCode, btnSlideUpXml, btnSlideUpCode,
            btnBounceXml,
            btnBounceCode, btnCombineXml, btnCombineCode;
    private ImageView ivUitLogo;
    private Animation.AnimationListener animationListener;

    private void findViewsByIds() {
        ivUitLogo = (ImageView) findViewById(R.id.iv_uit_logo);
        btnFadeInXml = (Button) findViewById(R.id.btn_fade_in_xml);
        btnFadeInCode = (Button) findViewById(R.id.btn_fade_in_code);
        btnFadeOutXml = (Button) findViewById(R.id.btn_fade_out_xml);
        btnFadeOutCode = (Button) findViewById(R.id.btn_fade_out_code);
        btnBlinkXml = (Button) findViewById(R.id.btn_blink_xml);
        btnBlinkCode = (Button) findViewById(R.id.btn_blink_code);
        btnZoomInXml = (Button) findViewById(R.id.btn_zoom_in_xml);
        btnZoomInCode = (Button) findViewById(R.id.btn_zoom_in_code);
        btnZoomOutXml = (Button) findViewById(R.id.btn_zoom_out_xml);
        btnZoomOutCode = (Button) findViewById(R.id.btn_zoom_out_code);
        btnRotateXml = (Button) findViewById(R.id.btn_rotate_xml);
        btnRotateCode = (Button) findViewById(R.id.btn_rotate_code);
        btnMoveXml = (Button) findViewById(R.id.btn_move_xml);
        btnMoveCode = (Button) findViewById(R.id.btn_move_code);
        btnSlideUpXml = (Button) findViewById(R.id.btn_slide_up_xml);
        btnSlideUpCode = (Button) findViewById(R.id.btn_slide_up_code);
        btnBounceXml = (Button) findViewById(R.id.btn_bounce_xml);
        btnBounceCode = (Button) findViewById(R.id.btn_bounce_code);
        btnCombineXml = (Button) findViewById(R.id.btn_combine_xml);
        btnCombineCode = (Button) findViewById(R.id.btn_combine_code);
    }

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsByIds();
        initVariables();
      /*  final  Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_fade_in);
        animation.setAnimationListener(animationListener);
        btnFadeInXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation);
            }
        });

        final  Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_fade_out);
        animation1.setAnimationListener(animationListener);
        btnFadeOutXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation1);
            }
        });

        final  Animation animation2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_blink);
        animation2.setAnimationListener(animationListener);
        btnBlinkXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation2);
            }
        });

        final  Animation animation3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_bounce);
        animation3.setAnimationListener(animationListener);
        btnBounceXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation3);
            }
        });

        final  Animation animation4 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_combine);
        animation4.setAnimationListener(animationListener);
        btnCombineXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation4);
            }
        });

        final  Animation animation5 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_move);
        animation5.setAnimationListener(animationListener);
        btnMoveXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation5);
            }
        });

        final  Animation animation6 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);
        animation6.setAnimationListener(animationListener);
        btnRotateXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation6);
            }
        });

        final  Animation animation7 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_slide_up);
        animation7.setAnimationListener(animationListener);
        btnSlideUpXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation7);
            }
        });

        final  Animation animation8 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_zoom_in);
        animation8.setAnimationListener(animationListener);
        btnZoomInXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation8);
            }
        });

        final  Animation animation9 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_zoom_out);
        animation9.setAnimationListener(animationListener);
        btnZoomOutXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation9);
            }
        });*/
        handleClickAnimationXml(btnFadeInXml,R.anim.anim_fade_in);
        handleClickAnimationXml(btnFadeOutXml,R.anim.anim_fade_out);
        handleClickAnimationXml(btnBlinkXml,R.anim.anim_blink);
        handleClickAnimationXml(btnBounceXml,R.anim.anim_bounce);
        handleClickAnimationXml(btnMoveXml,R.anim.anim_move);
        handleClickAnimationXml(btnCombineXml,R.anim.anim_combine);
        handleClickAnimationXml(btnRotateXml,R.anim.anim_rotate);
        handleClickAnimationXml(btnSlideUpXml,R.anim.anim_slide_up);
        handleClickAnimationXml(btnZoomInXml,R.anim.anim_zoom_in);
        handleClickAnimationXml(btnZoomOutXml,R.anim.anim_zoom_out);

    }

    private void handleClickAnimationXml(Button btn, int animId)
    {
        final  Animation animation = AnimationUtils.loadAnimation(MainActivity.this,animId);
        animation.setAnimationListener(animationListener);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivUitLogo.startAnimation(animation);
            }
        });
    }

}