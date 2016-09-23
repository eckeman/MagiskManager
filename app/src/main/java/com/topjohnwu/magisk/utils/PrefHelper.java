package com.topjohnwu.magisk.utils;


import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;

public class PrefHelper {
    public PrefHelper() {

    }

    public static boolean CheckBool(String key, Context context) {

        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, false);
    }



}