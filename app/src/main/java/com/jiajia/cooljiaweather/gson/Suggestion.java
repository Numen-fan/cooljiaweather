package com.jiajia.cooljiaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * <pre>
 *  Created by fanjiajia on 2018/6/9.
 *  desc:
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
