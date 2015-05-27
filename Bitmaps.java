package com.androidquery;

import android.graphics.Bitmap;

/**
 * Created by CPU10207-local on 5/19/2015.
 */
public class Bitmaps {
    static {
        System.loadLibrary("bitmaps-jni");
    }

    private static native int nativePinBitmap(Bitmap bitmap);

    public static int pinBitmap(Bitmap bitmap) {
        if(bitmap != null)
            return nativePinBitmap(bitmap);

        return -1;
    }
}
