package com.smartsky.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cangwang on 2017/9/25.
 */

public class HomeConfig {
    public static final String MODULE_CHAT ="com.smartsky.chat.ChtModule";
    public static final String MODULE_DISC_MENU ="com.smartsky.disc.DiscMenuModule";
    public static final String MODULE_TOP_MENU ="com.smartsky.menu.TopMenuModule";

    public static List<String> homeModulesList = new ArrayList<>(Arrays.asList(
            MODULE_CHAT,
            MODULE_DISC_MENU,
            MODULE_TOP_MENU
    ));

}
