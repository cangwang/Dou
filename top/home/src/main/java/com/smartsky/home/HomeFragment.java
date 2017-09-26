package com.smartsky.home;

import com.cangwang.core.cwmodule.ex.ModuleManageExFragment;
import java.util.List;

/**
 * Created by cangwang on 2017/9/25.
 */

public class HomeFragment extends ModuleManageExFragment{

    @Override
    public List<String> moduleConfig() {
        return HomeConfig.homeModulesList;
    }
}
