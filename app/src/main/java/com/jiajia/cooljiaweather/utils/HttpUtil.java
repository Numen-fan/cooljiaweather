package com.jiajia.cooljiaweather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * <pre>
 *  Created by fanjiajia on 2018/6/9.
 *  desc:
 */

public class HttpUtil {

    public static void sendOkHttpRequst(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
