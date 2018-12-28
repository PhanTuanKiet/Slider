package com.ptkiet.slider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CustomSlider mSlider;
    private int clickMode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSlider = findViewById(R.id.custom_sld);

        mSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMode++;
                if (clickMode > 2) clickMode = 0;
                switch (clickMode){
                    case 0:
                        mSlider.changeDefaultToTransition();
                        break;
                    case 1:
                        mSlider.changeTransitiontoActive();
                        break;
                    case 2:
                        mSlider.changeActivetoDefault();
                        break;
                }
            }
        });
    }
}
