package com.smartsky.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.cangwang.core.cwmodule.ELModuleContext;
import com.cangwang.core.cwmodule.ex.ELBasicExModule;

/**
 * Created by cangwang on 2017/9/25.
 */

public class TopMenuModule extends ELBasicExModule{
    private View topMenu;

    @Override
    public boolean init(ELModuleContext moduleContext, Bundle extend) {
        super.init(moduleContext, extend);
        this.moduleContext = moduleContext;
        initView();
        return true;
    }

    private void initView(){
        topMenu = LayoutInflater.from(context).inflate(R.layout.top_menu_module,parentTop,true);
    }
}
