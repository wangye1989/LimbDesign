package com.w.limbui.btn;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.w.limbui.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yutao on 2017/8/1.
 */

public class LimbBtnA extends LinearLayout {


    public LimbBtnA(Context context) {
        super(context);
        bindView(context);
    }

    public LimbBtnA(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bindView(context);
    }

    public LimbBtnA(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        bindView(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LimbBtnA(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void bindView(Context context){
        LayoutInflater.from(context).inflate(R.layout.limb_btn_a, this, true);
        ButterKnife.bind(this);
    }

}


