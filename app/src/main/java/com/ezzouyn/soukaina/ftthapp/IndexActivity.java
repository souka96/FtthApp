package com.ezzouyn.soukaina.ftthapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ramotion.circlemenu.CircleMenuView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Context context = this;
        SharedPreferences sharedPref = context.getSharedPreferences(
                getString(R.string.pref), Context.MODE_PRIVATE);
        final CircleMenuView menu = (CircleMenuView) findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener() {
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {

            }

            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {

            }

            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {

            }

            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {

            }

            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {

            }

            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Intent i = null;
                switch (index){
                    case 0:
                        i = new Intent(IndexActivity.this, MainActivity.class);
                        break;
                    case 1:
                        i = new Intent(IndexActivity.this, MainActivity.class);
                        break;
                    case 2:
                        i = new Intent(IndexActivity.this, MainActivity.class);
                        break;
                    case 3:
                        i = new Intent(IndexActivity.this, HomePage.class);
                        break;
                    default:
                        i = new Intent(IndexActivity.this, HomePage.class);
                        break;
                }
                startActivity(i);


            }
        });
    }
}
