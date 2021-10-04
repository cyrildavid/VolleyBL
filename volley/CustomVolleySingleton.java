package com.jaleelholdings.jmart2go.volley;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by Ecosoft Solutions on 06,July,2020
 **/
class CustomVolleySingleton {

    @SuppressLint("StaticFieldLeak")
    private static CustomVolleySingleton instance;
    @SuppressLint("StaticFieldLeak")
    private static Context ctx;
    private RequestQueue requestQueue;
    private final ImageLoader imageLoader;

    private CustomVolleySingleton(Context context) {
        ctx = context;
        requestQueue = getRequestQueue();

        imageLoader = new ImageLoader(requestQueue,
                new ImageLoader.ImageCache() {
                    private final LruCache<String, Bitmap>
                            cache = new LruCache<>(20);

                    @Override
                    public Bitmap getBitmap(String url) {
                        return cache.get(url);
                    }

                    @Override
                    public void putBitmap(String url, Bitmap bitmap) {
                        cache.put(url, bitmap);
                    }
                });
    }

//    public static synchronized VolleySingleton getInstance(Context context) {
//        if (instance == null) {
//            instance = new VolleySingleton(context);
//        }
//        return instance;
//    }

    public static CustomVolleySingleton getInstance(Context context) {
        if (instance == null) {
            synchronized (CustomVolleySingleton.class) {
                if (instance == null) {
                    instance = new CustomVolleySingleton(context);
                }
            }
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            requestQueue = Volley.newRequestQueue(ctx.getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

}
