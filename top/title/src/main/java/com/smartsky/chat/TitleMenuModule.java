package com.smartsky.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.cangwang.core.cwmodule.ELModuleContext;
import com.cangwang.core.cwmodule.ex.ELBasicExModule;
import com.smartsky.title.R;

/**
 * Created by cangwang on 2017/9/25.
 */

public class TitleMenuModule extends ELBasicExModule{
    private View titleMenu;

    @Override
    public boolean init(ELModuleContext moduleContext, Bundle extend) {
        super.init(moduleContext, extend);
        this.moduleContext = moduleContext;
        initView();
        return true;
    }

    private void initView(){
        titleMenu = LayoutInflater.from(context).inflate(R.layout.title_menu_module,parentTop,true);
    }


}
