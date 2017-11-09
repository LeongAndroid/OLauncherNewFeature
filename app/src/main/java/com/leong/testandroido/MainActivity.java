package com.leong.testandroido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.leong.testandroido.adaptiveicon.AdaptiveIconActivity;


public class MainActivity extends AppCompatActivity {
    private Button mAdaptiveIconButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdaptiveIconButton = (Button)this.findViewById(R.id.adaptive_icon);
        mAdaptiveIconButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, AdaptiveIconActivity.class);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });
    }


}
