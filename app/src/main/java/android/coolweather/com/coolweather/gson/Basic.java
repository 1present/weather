package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Present on 2020/2/22.
 */

public class Basic {
    @SerializedName("city")//使用SerializedName注解方式来让JSON字段和JAVA字段之间建立映射关系哦
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
