package com.jiajia.cooljiaweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <pre>
 *  Created by fanjiajia on 2018/6/9.
 *  desc:
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
