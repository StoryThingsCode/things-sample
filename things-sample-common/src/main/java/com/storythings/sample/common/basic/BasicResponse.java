package com.storythings.sample.common.basic;

import java.util.HashMap;

public class BasicResponse extends HashMap<String, Object> {

    private static final String SUCCESS_CODE = "0";

    private static final String FAILURE_CODE = "1000";

    private static final String SUCCESS_MESSAGE = "成功";

    private BasicResponse(String code, String message){
        this.put("code", code);
        this.put("message", message);
    }

    private BasicResponse(String code, String message, Object data){
        this.put("code", code);
        this.put("message", message);
        this.put("data", data);
    }

    public static BasicResponse success(){
        return new BasicResponse(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static BasicResponse success(Object data){
        return new BasicResponse(SUCCESS_CODE, SUCCESS_MESSAGE, data);
    }

    public static BasicResponse failure(String message){
        return new BasicResponse(FAILURE_CODE, message);
    }

}
