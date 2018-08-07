package com.ccq.utils;

/**
 * Created by hongjian.chen on 2018/8/1.
 */
public enum Constants {
    SESSION_USERNAME("USERNAME"),
    WEB_SSM("ws://support.tpadsz.com/web_ssm/websocket"),
    BLT_LIGHT("ws://ctc-hq.tpadsz.com/blt_light/websocket"),
    UICHANGE_BLT("ws://uichange.com/blt_light/websocket"),
    CHAT_SERVER("ws://localhost:8080/web_ssm/chatServer/after"),
    TEST_URL("ws://localhost:8080/web_ssm/websocket");

    private String username;

    Constants(String username) {
        this.username = username;
    }

    public String value() {
        return this.username;
    }

//    public static void main(String[] args) {
//        System.out.println(Constants.TEST_URL.value());
//    }

}
