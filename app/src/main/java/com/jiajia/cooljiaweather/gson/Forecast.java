package com.jiajia.cooljiaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * <pre>
 *  Created by fanjiajia on 2018/6/9.
 *  desc:
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
