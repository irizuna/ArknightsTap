package com.icebem.akt.util;

import android.app.Activity;
import android.util.DisplayMetrics;

public class ResolutionConfig {
    public static final int[][] RESOLUTION_CONFIG = {
            {1280, 720, 1100, 670, 1100, 650},
            {1440, 720, 1330, 670, 1200, 650},
            {1560, 720, 1470, 670, 1230, 650},
            {1920, 1080, 1650, 1000, 1650, 960},
            {2160, 1080, 2000, 1000, 1800, 960},
            {2232, 1080, 2030, 1000, 1810, 960},
            {2248, 1080, 2050, 1000, 1830, 960},
            {2340, 1080, 2200, 1000, 1850, 960},
            {2560, 1096, 2350, 1030, 1990, 970},
            {2560, 1440, 2200, 1330, 2200, 1280},
            {2880, 1440, 2660, 1330, 2400, 1280},
            {2960, 1440, 2800, 1330, 2430, 1280},
            {3120, 1440, 2940, 1330, 2470, 1280},
            {3840, 1644, 3520, 1550, 2980, 1450}
    };

    public static int[] getResolution(Activity activity) {
        DisplayMetrics metric = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(metric);
        return new int[]{Math.max(metric.widthPixels, metric.heightPixels), Math.min(metric.widthPixels, metric.heightPixels)};
    }
}