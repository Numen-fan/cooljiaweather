package com.jiajia.cooljiaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * <pre>
 *  Created by fanjiajia on 2018/6/9.
 *  desc:
 */

public class Now {

    @SerializedName("tmp")
    public String temprature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
