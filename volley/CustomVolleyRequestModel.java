package com.jaleelholdings.jmart2go.volley;

import java.util.HashMap;

/**
 * Created by Ecosoft Solutions on 06,July,2020
 **/
class CustomVolleyRequestModel {

    private static final int INIT_SESSION_TIMEOUT = 30000;

    private String url;
    private String[] keys;
    private String[] values;
    private Object tag;
    private Object supplementary;
    private int initialTimeOut = INIT_SESSION_TIMEOUT;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getSupplementary() {
        return supplementary;
    }

    public void setSupplementary(Object supplementary) {
        this.supplementary = supplementary;
    }

    public String[] getKeys() {
        return keys;
    }

    public void setKeys(String[] keys) {
        this.keys = keys;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    public int getInitialTimeOut() {
        return initialTimeOut;
    }

    public void setInitialTimeOut(int initialTimeOut) {
        this.initialTimeOut = initialTimeOut;
    }

    public HashMap<String, String> getParams() {
        HashMap<String, String> param = new HashMap<>();
        if (getKeys() == null)
            throw new IllegalStateException("Keys must not be null");
        if (getValues() == null)
            throw new IllegalStateException("Values must not be null");
        if (getKeys().length != getValues().length)
            throw new IllegalStateException("Keys and Values must be of equal length to comply");
        for (int i = 0; i < getKeys().length; i++) {
            param.put(getKeys()[i], getValues()[i]);
        }
        return param;
    }

}
