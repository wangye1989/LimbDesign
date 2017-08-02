package com.w.ld.demo.vu;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import com.w.jinone.base.AnimSwitchEnum;
import com.w.jinone.base.BaseVu;
import com.w.jinone.base.VuManager;
import com.w.ld.demo.R;
import com.w.limbui.btn.LimbBtnA;


import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by yutao on 2017/7/22.
 */

public class OneVu extends BaseVu {

    @Bind(R.id.btnB)
    public Button btnB;

    @Bind(R.id.btnA)
    public LimbBtnA limbBtnA;

    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
        super.init(inflater, container);
        view = inflater.inflate(R.layout.one_vu, container, false);
        ButterKnife.bind(this, view);
        context = view.getContext();
        setAnimSwitchTypeIn(AnimSwitchEnum.BottomToUp);

    }

    @OnClick(R.id.show_btn)
    public void btnClick(){

    }

    @OnClick(R.id.back_btn)
    public void backClick(){
        VuManager.getInstance().popVu();
    }

    @OnClick(R.id.btnA)
    public void aClick(){
        flag=!flag;
        limbBtnA.setBackgroundResource(flag==true? R.drawable.btn_b:R.drawable.btn_c);
    }

    private boolean flag=false;
    @OnClick(R.id.btnB)
    public void bClick(){
        flag=!flag;
        btnB.setBackgroundResource(flag==true? R.drawable.btn_b:R.drawable.btn_a);
    }





}
