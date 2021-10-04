package com.jaleelholdings.jmart2go.volley;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ecosoft on 06-03-2017.
 */
public class VolleySharedPref {

    private static final String CATEGORY_DATA_STATUS = "category_data_status";
    private static final String PRODUCTS_DATA_STATUS = "products_data_status";
    private static final String PRODUCTS_BY_CATEGORY_DATA_STATUS = "products_by_category_data_status";
    private static final String PRODUCTS_DETAIL_DATA_STATUS = "products_detail_data_status";
    private static final String PRODUCTS_IMAGES_DATA_STATUS = "products_images_data_status";
    private static final String RELATED_PRODUCTS_DATA_STATUS = "related_products_data_status";
    private static final String INSERT_ADDRESS_DATA_STATUS = "insert_address_data_status";
    private static final String UPDATE_ADDRESS_DATA_STATUS = "update_address_data_status";
    private static final String SET_DEFAULT_ADDRESS_DATA_STATUS = "set_default_address_data_status";
    private static final String GET_DEFAULT_ADDRESS_DATA_STATUS = "get_default_address_data_status";
    private static final String GET_ADDRESS_DATA_STATUS = "get_address_data_status";
    private static final String GET_CART_DATA_STATUS = "get_cart_data_status";
    private static final String INSERT_ORDER_DATA_STATUS = "insert_order_data_status";
    private static final String TAG = "VolleySharedPref";
    private static SharedPreferences mSharedPref;

    public VolleySharedPref() {

    }

    public static void init(Context context) {
        if (mSharedPref == null) {
            mSharedPref = context.getSharedPreferences(TAG, Activity.MODE_PRIVATE);
        }
    }

    public static SharedPreferences getmSharedPref() {
        return mSharedPref;
    }

    public static void clearSharedPreferences() {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.clear();
        editor.apply();
    }

    public static boolean getCategoryDataStatus() {
        return mSharedPref.getBoolean(CATEGORY_DATA_STATUS, false);
    }

    public static void setCategoryDataStatus(boolean category_data_status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(CATEGORY_DATA_STATUS, category_data_status);
        editor.apply();
    }

    public static boolean getProductsDataStatus() {
        return mSharedPref.getBoolean(PRODUCTS_DATA_STATUS, false);
    }

    public static void setProductsDataStatus(boolean products_data_status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(PRODUCTS_DATA_STATUS, products_data_status);
        editor.apply();
    }

    public static boolean getProductsByCategoryDataStatus() {
        return mSharedPref.getBoolean(PRODUCTS_BY_CATEGORY_DATA_STATUS, false);
    }

    public static void setProductsByCategoryDataStatus(boolean products_by_category_data_status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(PRODUCTS_BY_CATEGORY_DATA_STATUS, products_by_category_data_status);
        editor.apply();
    }

    public static boolean getProductsDetailDataStatus() {
        return mSharedPref.getBoolean(PRODUCTS_DETAIL_DATA_STATUS, false);
    }

    public static void setProductsDetailDataStatus(boolean products_detail_data_status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(PRODUCTS_DETAIL_DATA_STATUS, products_detail_data_status);
        editor.apply();
    }

    public static boolean getProductsImagesDataStatus() {
        return mSharedPref.getBoolean(PRODUCTS_IMAGES_DATA_STATUS, false);
    }

    public static void setProductsImagesDataStatus(boolean products_images_data_status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(PRODUCTS_IMAGES_DATA_STATUS, products_images_data_status);
        editor.apply();
    }

    public static boolean getRelatedProductsDataStatus() {
        return mSharedPref.getBoolean(RELATED_PRODUCTS_DATA_STATUS, false);
    }

    public static void setRelatedProductsDataStatus(boolean related_products_data_status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(RELATED_PRODUCTS_DATA_STATUS, related_products_data_status);
        editor.apply();
    }

    public static boolean getInsertAddressDataStatus() {
        return mSharedPref.getBoolean(INSERT_ADDRESS_DATA_STATUS, false);
    }

    public static void setInsertAddressDataStatus(boolean insertAddressDataStatus) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(INSERT_ADDRESS_DATA_STATUS, insertAddressDataStatus);
        editor.apply();
    }

    public static boolean getUpdateAddressDataStatus() {
        return mSharedPref.getBoolean(UPDATE_ADDRESS_DATA_STATUS, false);
    }

    public static void setUpdateAddressDataStatus(boolean UpdateAddressDataStatus) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(UPDATE_ADDRESS_DATA_STATUS, UpdateAddressDataStatus);
        editor.apply();
    }

    public static boolean getGetDefaultAddressDataStatus() {
        return mSharedPref.getBoolean(GET_DEFAULT_ADDRESS_DATA_STATUS, false);
    }

    public static void setGetDefaultAddressDataStatus(boolean status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(GET_DEFAULT_ADDRESS_DATA_STATUS, status);
        editor.apply();
    }

    public static void getSetDefaultAddressDataStatus(boolean status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(SET_DEFAULT_ADDRESS_DATA_STATUS, status);
        editor.apply();
    }

    public static boolean getSetDefaultAddressDataStatus() {
        return mSharedPref.getBoolean(SET_DEFAULT_ADDRESS_DATA_STATUS, false);
    }

    public static boolean getGetAddressDataStatus() {
        return mSharedPref.getBoolean(GET_ADDRESS_DATA_STATUS, false);
    }

    public static void setGetAddressDataStatus(boolean getAddressDataStatus) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(GET_ADDRESS_DATA_STATUS, getAddressDataStatus);
        editor.apply();
    }

    public static boolean getGetCartDataStatus() {
        return mSharedPref.getBoolean(GET_CART_DATA_STATUS, false);
    }

    public static void setGetCartDataStatus(boolean cartDataStatus) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(GET_CART_DATA_STATUS, cartDataStatus);
        editor.apply();
    }

    public static boolean getInsertOrderDataStatus() {
        return mSharedPref.getBoolean(INSERT_ORDER_DATA_STATUS, false);
    }

    public static void setInsertOrderDataStatus(boolean status) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(INSERT_ORDER_DATA_STATUS, status);
        editor.apply();
    }

}