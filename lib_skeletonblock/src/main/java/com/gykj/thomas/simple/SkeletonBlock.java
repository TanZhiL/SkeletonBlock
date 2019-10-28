package com.gykj.thomas.simple;


import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

import java.util.Random;

/**
 * Author: Thomas.<br/>
 * Date: 2019/10/28 10:26<br/>
 * GitHub: https://github.com/TanZhiL<br/>
 * CSDN: https://blog.csdn.net/weixin_42703445<br/>
 * Email: 1071931588@qq.com<br/>
 * Description:
 */
public class SkeletonBlock extends View {
    private Animation mAnimation;
    public static int duration = 500;
    public SkeletonBlock(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SkeletonBlock(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.SkeletonBlock);
        final int d=typedArray.getInteger(R.styleable.SkeletonBlock_sb_duration,0);
        typedArray.recycle();
        post(new Runnable() {
            @Override
            public void run() {
                float v = new Random().nextFloat();
                if(v<0.3)v=0.3f;
                else if(v>0.8)v=0.8f;
                mAnimation = new ScaleAnimation(1, v, 1, 1,
                        Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0);
                mAnimation.setDuration(d==0?duration:d);
                mAnimation.setRepeatMode(Animation.REVERSE);
                mAnimation.setRepeatCount(Animation.INFINITE);
                startAnimation(mAnimation);
            }
        });


    }
}
