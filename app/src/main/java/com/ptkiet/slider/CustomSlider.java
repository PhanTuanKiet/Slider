package com.ptkiet.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import org.w3c.dom.Attr;

public class CustomSlider extends LinearLayout {

    private ViewGroup mBackground;
    private Button mSliderObject;

    private int defaultBackground;
    private int transitionBackground;
    private int activeBackground;


    public CustomSlider(Context context) {
        super(context);
        init(null);
    }

    public CustomSlider(Context context,@Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public void init(AttributeSet attrs){
        createView();
        loadAttrs(attrs);
        setupView();
    }

    public void createView(){
        LayoutInflater.from(getContext()).inflate(R.layout.slider,this,true);
        mBackground = findViewById(R.id.sliderBackground);
    }

    public void loadAttrs(AttributeSet attrs){
       if (attrs != null){
           TypedArray typedArray = getContext().obtainStyledAttributes(attrs,R.styleable.CustomSlider);

           defaultBackground = typedArray.getResourceId(R.styleable.CustomSlider_default_mode,0);
           transitionBackground = typedArray.getResourceId(R.styleable.CustomSlider_transition_mode,0);
           activeBackground = typedArray.getResourceId(R.styleable.CustomSlider_actived_mode,0);
       }
    }

    public void setupView(){
        mBackground.setBackgroundResource(defaultBackground);
    }

    public void changeDefaultToTransition(){
        mBackground.setBackgroundResource(transitionBackground);
    }

    public void changeTransitiontoActive(){
        mBackground.setBackgroundResource(activeBackground);
    }

    public void changeActivetoDefault(){
        mBackground.setBackgroundResource(defaultBackground);
    }
}
