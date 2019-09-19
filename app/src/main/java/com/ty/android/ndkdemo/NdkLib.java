package com.ty.android.ndkdemo;

public class NdkLib {
    static {
        System.loadLibrary("NdkLib");
    }

    public native String getStringFromNdk();
}
