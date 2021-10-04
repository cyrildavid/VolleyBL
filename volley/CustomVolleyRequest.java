package com.jaleelholdings.jmart2go.volley;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.toolbox.StringRequest;
import com.jaleelholdings.jmart2go.utility.Loggable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Ecosoft Solutions on 06,July,2020
 **/
public class CustomVolleyRequest {
    private final Context mContext;
    private final CustomVolleyRequestModel model;
    private final OnCustomVolleyRequestCallBack listener;
    private CustomVolleySingleton volleyInstance;

    private CustomVolleyRequest(Context mContext, CustomVolleyRequestModel model) {
        this.mContext = mContext;
        this.model = model;
        listener = (OnCustomVolleyRequestCallBack) mContext;
        initStringRequest();
    }

    /**
     * Returns multi dimensional response value from corresponding json data
     * Else returns Null
     */
    public static String[][] returnResponse(String response, String[] json, String jsonArrayName) {
        String[][] res = null;
        try {
            int i, j;
            JSONObject jsonObject = new JSONObject(response);
            JSONArray arrayImages = jsonObject.getJSONArray(jsonArrayName);
            res = new String[arrayImages.length()][json.length];
            for (i = 0; i < arrayImages.length(); i++) {
                JSONObject jsonObject1 = arrayImages.getJSONObject(i);
                for (j = 0; j < json.length; j++) {
                    res[i][j] = jsonObject1.getString(json[j]).trim();
                    if (res[i][j].equals("null")) {
                        res[i][j] = "";
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return res;
    }

    private void initStringRequest() {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, model.getUrl(),
                response -> {
                    response = response.trim().replaceAll("[\n\r]", "");
                    Loggable.d("CustomRequest", model.getUrl() + ":::" + response);
                    if (listener != null)
                        listener.onVolleySuccessEventListener(response, model.getKeys(),
                                model.getValues(), model.getTag(), model.getSupplementary(),
                                model.getUrl());
                },
                error -> {
                    String message = null;
                    if (error instanceof NetworkError) {
                        message = "Network Error. Please check your connection and try again!";
                    } else if (error instanceof ServerError) {
                        message = "Server Error. Please try again after some time!";
                    } else if (error instanceof AuthFailureError) {
                        message = "Auth Failure. Please try again after some time!";
                    } else if (error instanceof ParseError) {
                        message = "Parsing Error. Please try again after some time!";
                    } else if (error instanceof TimeoutError) {
                        message = "The connection has timed out. Please check your internet connectivity.";
                    }
                    if (message == null) {
                        message = error.toString();
                    }
                    Loggable.d("CustomRequest", model.getUrl() + ":::" + message);
                    if (listener != null)
                        listener.onVolleyErrorEventListener(message, model.getKeys(),
                                model.getValues(), model.getTag(), model.getSupplementary(),
                                model.getUrl());
                }) {
            @Override
            protected Map<String, String> getParams() {
//                StringBuilder params = new StringBuilder();
//                for (int i = 0; i < model.getParams().size(); i++) {
//                    params.append(model.getKeys()[i]).append(":").append(model.getValues()[i]).append("\n");
//                }
//                Loggable.d("CustomRequest", model.getUrl() + ":::\n" + params.toString());
                Loggable.d("CustomRequest", model.getUrl() + ":::\n" + model.getParams());
                return model.getParams();
            }

        };
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                model.getInitialTimeOut(),
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        if (model.getTag() != null)
            stringRequest.setTag(model.getTag());
        volleyInstance = CustomVolleySingleton.getInstance(mContext.getApplicationContext());
        volleyInstance.addToRequestQueue(stringRequest);
    }

    /**
     * @param tag Pass the same tag which was used to create the request<br><br/>
     *            Can only be called after using {@link Builder Builder().start()}
     */
    public void cancelAllRequest(Object tag) {
        if (volleyInstance == null)
            throw new IllegalStateException("Can only be called after creating request");
        volleyInstance.getRequestQueue().cancelAll(tag);
    }

    public interface OnCustomVolleyRequestCallBack {
        void onVolleySuccessEventListener(String response, String[] keys, String[] values,
                                          Object tag, Object supplementary, String url);

        void onVolleyErrorEventListener(String errorMessage, String[] keys, String[] values,
                                        Object tag, Object supplementary, String url);
    }

    public static final class Builder {
        private Context mContext;
        private CustomVolleyRequestModel model;

        /**
         * @param context pass the context context where the request is taking place
         */
        public Builder with(Context context) {
            this.mContext = context;
            this.model = new CustomVolleyRequestModel();
            return this;
        }

        /**
         * @param url set the url to be served
         */
        public Builder setUrl(String url) {
            model.setUrl(url);
            return this;
        }

        /**
         * @param keys set the keys for the hashmap<br><br/>
         *             {@link #setValues(String[])} args length should be maintained here
         */
        public Builder setKeys(String[] keys) {
            model.setKeys(keys);
            return this;
        }

        /**
         * @param values set the values for the hashmap<br><br/>
         *               {@link #setKeys(String[])} args length should be maintained here
         */
        public Builder setValues(String[] values) {
            model.setValues(values);
            return this;
        }

        /**
         * @param tag sets the tag for the string request
         */
        public Builder setTag(Object tag) {
            model.setTag(tag);
            return this;
        }

        /**
         * @param supplementary set the supplementary values for the string request
         */
        public Builder setSupplementary(Object supplementary) {
            model.setSupplementary(supplementary);
            return this;
        }

        /**
         * @param initialTimeOut set the timeout till the request should be cancelled
         */
        public Builder setInitialTimeOut(int initialTimeOut) {
            model.setInitialTimeOut(initialTimeOut);
            return this;
        }

        /**
         * @throws IllegalStateException
         */
        @SuppressWarnings("JavaDoc")
        public CustomVolleyRequest start() {
            if (mContext == null) {
                throw new IllegalStateException("Activity must be specified using with() call before start() is called");
            }
            if (model == null) {
                throw new IllegalStateException("Volley Request details must be filled before start() is called");
            }
            if (model.getUrl() == null) {
                throw new IllegalStateException("Url must be non-null");
            }
            if (model.getKeys() == null) {
                throw new IllegalStateException("Keys must be non-null");
            }
            if (model.getValues() == null) {
                throw new IllegalStateException("Values must be non-null");
            }
            if (model.getKeys().length != model.getValues().length) {
                throw new IllegalStateException("Keys and Values must be of same length");
            }
            return new CustomVolleyRequest(mContext, model);
        }
    }

}
