package com.legend.springmvc.quickstart.datas;

/**
 * Created by allen on 7/25/16.
 */
public class GlobalResponse {
    public static final String SUCCESS = "S";
    public static final String ERROR = "E";
    private String returnCode;
    private String returnMessage;

    public GlobalResponse() {
    }

    public GlobalResponse(String returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
}
