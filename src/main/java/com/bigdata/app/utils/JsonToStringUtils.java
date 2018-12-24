package com.bigdata.app.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * json工具类
 * 
 * @author sanduo
 * @date 2018/11/06
 */
public class JsonToStringUtils {

    public static String jsonToString(JSONObject jsonObject) {

        StringBuilder sb = new StringBuilder();
        sb.append(jsonObject.get("sdk_ver")).append("\001").append(jsonObject.get("time_zone")).append("\001")
            .append(jsonObject.get("commit_id")).append("\001").append(jsonObject.get("commit_time")).append("\001")
            .append(jsonObject.get("pid")).append("\001").append(jsonObject.get("app_token")).append("\001")
            .append(jsonObject.get("app_id")).append("\001").append(jsonObject.get("device_id")).append("\001")
            .append(jsonObject.get("device_id_type")).append("\001").append(jsonObject.get("release_channel"))
            .append("\001").append(jsonObject.get("app_ver_name")).append("\001").append(jsonObject.get("app_ver_code"))
            .append("\001").append(jsonObject.get("os_name")).append("\001").append(jsonObject.get("os_ver"))
            .append("\001").append(jsonObject.get("language")).append("\001").append(jsonObject.get("country"))
            .append("\001").append(jsonObject.get("manufacture")).append("\001").append(jsonObject.get("device_model"))
            .append("\001").append(jsonObject.get("resolution")).append("\001").append(jsonObject.get("net_type"))
            .append("\001").append(jsonObject.get("account")).append("\001").append(jsonObject.get("app_device_id"))
            .append("\001").append(jsonObject.get("mac")).append("\001").append(jsonObject.get("android_id"))
            .append("\001").append(jsonObject.get("imei")).append("\001").append(jsonObject.get("cid_sn"))
            .append("\001").append(jsonObject.get("build_num")).append("\001")
            .append(jsonObject.get("mobile_data_type")).append("\001").append(jsonObject.get("promotion_channel"))
            .append("\001").append(jsonObject.get("carrier")).append("\001").append(jsonObject.get("city"))
            .append("\001").append(jsonObject.get("user_id"));
        return sb.toString();
    }

}
