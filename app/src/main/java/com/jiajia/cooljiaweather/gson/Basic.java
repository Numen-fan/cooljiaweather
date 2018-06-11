package com.jiajia.cooljiaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * <pre>
 *  Created by fanjiajia on 2018/6/9.
 *  desc:
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
