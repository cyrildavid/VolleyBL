package com.jaleelholdings.jmart2go.volley;

/**
 * Created by Ecosoft Solutions on 14,July,2020
 **/
public class Constants {

    public static final String JSON_ARRAY_RESULT = "result";
    public static final String JSON_NODATA = "NoData";

    //Login PHP Constants
    public static final String loginPHP = "p_user_login.php";
    public static final String loginTag = "login";
    public static final String[] loginRequestKeys = new String[]{
            "user",
            "pass",
            "datakey"
    };
    public static final String[] loginJson = new String[]{
            "CusID",
            "cus_Name",
            "Status",
            "Title",
            "Descr",
            "mob"
    };

    //Forgot Password Account Verification PHP Constants
    public static final String FPAccountVerifyPHP = "p_user_InsForgotPassOTP.php";
    public static final String FPAccountVerifyTag = "FPAccountVerify";
    public static final String[] FPAccountVerifyRequestKeys = new String[]{
            "mobile",
            "datakey"
    };
    public static final String[] FPAccountVerifyJson = new String[]{
            "Title",
            "Descr",
            "CusID",
            "mob"
    };

    //Forgot Password OTP Verification PHP Constants
    public static final String verifyFPCustomerPHP = "p_user_VerifyFPCustomer.php";
    public static final String verifyFPCustomerTag = "VerifyFPCustomer";
    public static final String[] verifyFPCustomerRequestKeys = new String[]{
            "CusID",
            "otp",
            "datakey"
    };
    public static final String[] verifyFPCustomerJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };

    //Update Password PHP Constants
    public static final String updPassPHP = "p_user_updpass.php";
    public static final String updPassTag = "updPass";
    public static final String[] updPassRequestKeys = new String[]{
            "CusID",
            "Pass",
            "datakey"
    };
    public static final String[] updPassJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };


    //SignUp PHP Constants
    public static final String signUpPHP = "p_user_InsCustomer.php";
    public static final String signUpTag = "insCus";
    public static final String[] signUpRequestKeys = new String[]{
            "name",
            "pcode",
            "phone",
            "password",
            "placingtype",
            "did",
            "jid",
            "addr1",
            "addr2",
            "addr3",
            "dob",
            "gender",
            "nationality",
            "whatsapp",
            "email",
            "datakey"
    };
    public static final String[] signUpJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };
    // Fetch Customer Details with mobile number
    public static final String fetchCustomerDetailsPHP = "p_user_crmdetails.php";
    public static final String fetchCustomerDetailsTag = "FetchCustomerDetails";
    public static final String[] fetchCustomerDetailsRequestKeys = new String[]{
            "mobile",
            "datakey"
    };
    public static final String[] fetchCustomerDetailsJson = new String[]{
            "DOB",
            "crm_Addr1",
            "crm_Addr2",
            "CusName",
            "Nationality",
            "Gender",
            "whatsapp",
            "whatsappcode"
    };

    //Location Master PHP Constants
    public static final String locMasterPHP = "p_user_SelLocations.php";
    public static final String locMasterTag = "locMaster";
    public static final String[] locMasterRequestKeys = new String[]{
            "condition",
            "jid",
            "datakey"
    };
    public static final String[] locMasterJson = new String[]{
            "did",
            "Dname",
            "jid",
            "Jname"
    };

    //Category PHP Constants
    public static final String categoryPHP = "p_user_category.php";
    public static final String categoryTag = "category";
    public static final String[] categoryRequestKeys = new String[]{
            "datakey"
    };
    public static final String[] categoryJson = new String[]{
            "catID",
            "name",
            "image"
    };

    //Category PHP Constants
    public static final String productsPHP = "p_user_products.php";
    public static final String productsTag = "products";
    public static final String[] productsRequestKeys = new String[]{
            "CusID",
            "text",
            "pagenum",
            "datakey"
    };
    public static final String[] productsJson = new String[]{
            "prdID",
            "name",
            "currency",
            "amount",
            "wishlist",
            "image",
            "brand",
            "prdQty",
            "isAdded",
            "newamount",
            "name2",
            "cardtpe"
    };

    //Products By Category PHP Constants
    public static final String productsByCategoryPHP = "p_user_productsbycat.php";
    public static final String productsByCategoryTag = "productsByCategory";
    public static final String[] productsByCategoryRequestKeys = new String[]{
            "CatID",
            "CusID",
            "pagenum",
            "SucID",
            "datakey"
    };
    public static final String[] productsByCategoryJson = new String[]{
            "prdID",
            "name",
            "currency",
            "image",
            "amount",
            "wishlist",
            "brand",
            "prdQty",
            "isAdded",
            "newamount",
            "name2",
            "cardtpe"
    };

    //Products Detail PHP Constants
    public static final String productDetailPHP = "p_user_prdDetial.php";
    public static final String productDetailTag = "productDetail";
    public static final String[] productDetailRequestKeys = new String[]{
            "PrdID",
            "CusID",
            "datakey"
    };
    public static final String[] productDetailJson = new String[]{
            "prdName",
            "currency",
            "amount",
            "desc",
            "isAdded",
            "prdQty",
            "prdID",
            "wishlist",
            "line1",
            "line2",
            "newamount",
            "cardtpe"
    };

    //Products Detail PHP Constants
    public static final String productImagesPHP = "p_user_prdImages.php";
    public static final String productImagesTag = "productImages";
    public static final String[] productImagesRequestKeys = new String[]{
            "prdID",
            "datakey"
    };
    public static final String[] productImagesJson = new String[]{
            "image"
    };

    //Related Products PHP Constants
    public static final String relatedProductsPHP = "p_user_relatedprod.php";
    public static final String relatedProductsTag = "relatedProducts";
    public static final String[] relatedProductsRequestKeys = new String[]{
            "PrdID",
            "CusID",
            "datakey"
    };
    public static final String[] relatedProductsJson = new String[]{
            "prdID",
            "prdName",
            "currency",
            "amount",
            "image",
            "wishlist",
            "prdQty",
            "isAdded",
            "newamount",
            "name2",
            "cardtpe"
    };

    //Insert or Delete Wishlist PHP Constants
    public static final String insertWishListPHP = "p_user_InsWishlist.php";
    public static final String deleteWishListPHP = "p_user_DelWishlist.php";
    public static final String insertOrDeleteWishListTag = "insertWishlist";
    public static final String insertOrDeleteInDetailWishListTag = "insertWishlistInDetail";
    public static final String[] insertOrDeleteWishListRequestKeys = new String[]{
            "PrdID",
            "CusID",
            "datakey"
    };
    public static final String[] insertOrDeleteWishlistJson = new String[]{
            "response"
    };

    //Cart Listing PHP Constants
    public static final String getCartPHP = "p_user_SelCart.php";
    public static final String getCartTag = "getCart";
    public static final String[] getCartRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] getCartJson = new String[]{
            "prdName",
            "currency",
            "prdAmount",
            "image",
            "prdID",
            "totAmount",
            "prdQty",
            "crtID",
            "name2",
            "Totprd_VAT",
            "prl_DeliveryDay"
    };

    //Insert Cart PHP Constants
    public static final String insertCartPHP = "p_user_InsCart.php";
    public static final String insertCartTag = "insertCart";
    public static final String insertCartDetailTag = "insertCartDetail";
    public static final String[] insertCartRequestKeys = new String[]{
            "CusID",
            "Amount",
            "PrdID",
            "PrdQty",
            "datakey"
    };
    public static final String[] insertCartJson = new String[]{
            "response"
    };

    //Delete Cart PHP Constants
    public static final String deleteCartPHP = "p_user_DelCart.php";
    public static final String deleteCartTag = "deleteCart";
    public static final String deleteCartDetailTag = "deleteCartDetail";
    public static final String[] deleteCartRequestKeys = new String[]{
            "CusID",
            "PrdID",
            "datakey"
    };
    public static final String[] deleteCartJson = new String[]{
            "response"
    };

    //Insert Order PHP Constants
    public static final String insertOrderPHP = "p_user_InsOrder.php";
    public static final String insertOrderTag = "insertOrder";
    public static final String[] insertOrderRequestKeys = new String[]{
            "CusID",
            "OrderPlacingType",
            "DelCharges",
            "SubTotal",
            "expDelDate",
            "expDelTime",
            "Vat",
            "GrandTotal",
            "PayMethod",
            "Platform",
            "remarks",
            "datakey"
    };
    public static final String[] insertOrderJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };

    //Active Orders PHP Constants
    public static final String activeOrdersPHP = "p_user_activeOrders.php";
    public static final String activeOrdersTag = "activeOrders";
    public static final String[] activeOrdersRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] activeOrdersJson = new String[]{
            "ordID",
            "ordNumber",
            "orderedDate",
            "time",
            "status",
            "grandTotal",
            "expectedDate",
            "colorCode"
    };

    //Order Item List PHP Constants
    public static final String orderItemListPHP = "p_user_orderItemList.php";
    public static final String orderItemListTag = "orderItemList";
    public static final String[] orderItemListRequestKeys = new String[]{
            "cusID",
            "ordID",
            "datakey"
    };
    public static final String[] orderItemListJson = new String[]{
            "ordID",
            "prdID",
            "prdQty",
            "prdAmount",
            "prdName",
            "status",
            "currency",
            "prd_Name2"
    };

    //Wish List PHP Constants
    public static final String wishListPHP = "p_user_wishlist.php";
    public static final String wishListTag = "wishlist";
    public static final String[] wishListRequestKeys = new String[]{
            "CusID",
            "pagenum",
            "datakey"
    };
    public static final String[] wishListJson = new String[]{
            "prdID",
            "name",
            "currency",
            "image",
            "amount",
            "wishlist",
            "brand",
            "prdQty",
            "isAdded",
            "newamount",
            "name2",
            "cardtpe"
    };

    //Today Deals PHP Constants
    public static final String todayDealsPHP = "p_user_todaydeals.php";
    public static final String todayDealsTag = "todayDeals";
    public static final String[] todayDealsRequestKeys = new String[]{
            "CusID",
            "pagenum",
            "datakey"
    };
    public static final String[] todayDealsJson = new String[]{
            "prdID",
            "name",
            "currency",
            "image",
            "amount",
            "wishlist",
            "brand",
            "prdQty",
            "isAdded",
            "newamount",
            "name2",
            "cardtpe"
    };

    //Bulk Savings PHP Constants
    public static final String bulkSavingsPHP = "p_user_BulkSavings.php";
    public static final String bulkSavingsTag = "bulkSavings";
    public static final String[] bulkSavingsRequestKeys = new String[]{
            "CusID",
            "pagenum",
            "datakey"
    };
    public static final String[] bulkSavingsJson = new String[]{
            "prdID",
            "name",
            "currency",
            "image",
            "amount",
            "wishlist",
            "brand",
            "prdQty",
            "isAdded",
            "newamount",
            "name2"
    };

    //Latest Products PHP Constants
    public static final String latestProductsPHP = "p_user_latestproducts.php";
    public static final String latestProductsTag = "latestProducts";
    public static final String[] latestProductsRequestKeys = new String[]{
            "CusID",
            "pagenum",
            "datakey"
    };
    public static final String[] latestProductsJson = new String[]{
            "prdID",
            "name",
            "currency",
            "image",
            "amount",
            "wishlist",
            "brand",
            "prdQty",
            "isAdded",
            "newamount",
            "name2"
    };

    //Link Your Account PHP Constants
    public static final String linkYourAccountPHP = "p_user_SignupCheck.php";
    public static final String linkYourAccountTag = "linkYourAccount";
    public static final String[] linkYourAccountRequestKeys = new String[]{
            "mobile",
            "datakey"
    };
    public static final String[] linkYourAccountJson = new String[]{
            "Title",
            "Descr",
            "CusID",
            "mob"
    };

    //Verify Link Your Account PHP Constants
    public static final String VerifySignUpPHP = "p_user_VerifySignUp.php";
    public static final String VerifySignUpTag = "VerifySignUp";
    public static final String[] VerifySignUpRequestKeys = new String[]{
            "mob",
            "otp",
            "datakey"
    };
    public static final String[] VerifySignUpJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };

    //Get User Profile PHP Constants
    public static final String getUserProfilePHP = "p_user_profile.php";
    public static final String getUserProfileTag = "getUserProfile";
    public static final String[] getUserProfileRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] getUserProfileJson = new String[]{
            "cus_ID",
            "cus_Name",
            "cus_Addr1",
            "cus_Addr2",
            "dlo_Name",
            "jla_Name",
            "jla_Name2",
            "cus_MinOrderValue",
            "cus_OrderPlacingType",
            "cus_DelCharge",
            "cus_MobileNumber",
            "cus_PhoneCode",
            "cus_Addr3",
            "cus_DeliveryDay",
            "cus_LoyaltyState",
            "cus_LoyaltyNumber"
    };

    //Promo Slider PHP Constants
    public static final String promoSliderPHP = "p_user_PromoSlider.php";
    public static final String promoSliderTag = "promoSlider";
    public static final String[] promoSliderRequestKeys = new String[]{
            "datakey"
    };
    public static final String[] promoSliderJson = new String[]{
            "prm_ID",
            "prm_Name",
            "prm_Image"
    };

    //Cart Count PHP Constants
    public static final String cartCountPHP = "p_user_CartCount.php";
    public static final String cartCountTag = "cartCount";
    public static final String[] cartCountRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] cartCountJson = new String[]{
            "crt_Count"
    };

    //Pickup Dates PHP Constants
    public static final String pickupDateTimePHP = "p_user_SelPickDates.php";
    public static final String pickupDateTimeTag = "pickupDateTime";
    public static final String[] pickupDatesRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] pickupDateTimeJson = new String[]{
            "Dates",
            "Time",
            "MinTime",
            "MaxTime"
    };

    //Delivery Dates PHP Constants
    public static final String deliveryDatesPHP = "p_user_DelDates.php";
    public static final String deliveryDatesTag = "deliveryDates";
    public static final String[] deliveryDatesRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] deliveryDatesJson = new String[]{
            "Dates"
    };

    //Delivery Times PHP Constants
    public static final String deliveryTimesPHP = "p_user_DelTimes.php";
    public static final String deliveryTimesTag = "deliveryTimes";
    public static final String[] deliveryTimesRequestKeys = new String[]{
            "Date",
            "CusID",
            "datakey"
    };
    public static final String[] deliveryTimesJson = new String[]{
            "Time",
            "MinTime",
            "MaxTime"
    };

    //Quick Re Order PHP Constants
    public static final String quickReOrderPHP = "p_user_Favorites.php";
    public static final String quickReOrderTag = "quickReOrder";
    public static final String[] quickReOrderRequestKeys = new String[]{
            "CusID",
            "pagenum",
            "datakey"
    };
    public static final String[] quickReOrderJson = new String[]{
            "prdID",
            "name",
            "name2",
            "currency",
            "amount"
    };

    //Insert New Request PHP Constants
    public static final String insertNewRequestPHP = "p_user_InsNewReq.php";
    public static final String insertNewRequestTag = "insertNewRequest";
    public static final String[] insertNewRequestRequestKeys = new String[]{
            "CusID",
            "Title",
            "Note",
            "datakey"
    };
    public static final String[] insertNewRequestJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };

    //Image Upload PHP Constants
    public static final String imageUploadPHP = "p_user_ImageUpload.php";
    public static final String imageUploadTag = "imageUpload";
    public static final String[] imageUploadRequestKeys = new String[]{
            "data",
            "CusID",
            "datakey"
    };
//    public static final String[] imageUploadRequestKeys = new String[]{
//        "data",
//        "userID",
//        "orderID",
//        "custID",
//        "mode"
//};

    //Image Attach PHP Constants
    public static final String imageAttachPHP = "p_user_NewImages.php";
    public static final String imageAttachTag = "imageAttach";
    public static final String[] imageAttachRequestKeys = new String[]{
            "CusID",
            "RnpID",
            "Image",
            "mode",
            "datakey"
    };
    public static final String[] imageAttachJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };

    //Sub Category PHP Constants
    public static final String subCategoryPHP = "p_user_SubCategory.php";
    public static final String subCategoryTag = "subCategory";
    public static final String[] subCategoryRequestKeys = new String[]{
            "CatID",
            "datakey"
    };
    public static final String[] subCategoryJson = new String[]{
            "suc_ID",
            "suc_Name"
    };

    //Contact Us PHP Constants
    public static final String contactUsPHP = "p_user_Contact.php";
    public static final String contactUsTag = "contactUs";
    public static final String[] contactUsRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] contactUsJson = new String[]{
            "jla_Name",
            "Jla_Name2",
            "jla_ContactPerson",
            "jla_Phone",
            "jla_Whatsapp",
            "jla_GeoCode"
    };

    //Suggestion List PHP Constants
    public static final String suggestionListPHP = "p_user_sugglist.php";
    public static final String suggestionListTag = "suggestionList";
    public static final String[] suggestionListRequestKeys = new String[]{
            "CusID",
            "text",
            "datakey"
    };
    public static final String[] suggestionListJson = new String[]{
            "prdName"
    };

    //Item By Barcode PHP Constants
    public static final String itemByBarcodePHP = "p_user_ItemByBarcode.php";
    public static final String itemByBarcodeTag = "itemByBarcode";
    public static final String[] itemByBarcodeRequestKeys = new String[]{
            "CusID",
            "text",
            "datakey"
    };
    public static final String[] itemByBarcodeJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };

    //Insert Quick ReOrder PHP Constants
    public static final String insertQuickReOrderPHP = "p_user_InsQuickReOrder.php";
    public static final String insertQuickReOrderTag = "insertQuickReOrder";
    public static final String[] insertQuickReOrderRequestKeys = new String[]{
            "CusID",
            "jsonValue",
            "datakey"
    };
    public static final String[] insertQuickReOrderJson = new String[]{
            "Title",
            "Descr",
            "CusID"
    };

    //Insert Quick ReOrder PHP Constants
    public static final String updateTokenPHP = "p_user_UpdToken.php";
    public static final String updateTokenTag = "updateToken";
    public static final String[] updateTokenRequestKeys = new String[]{
            "CusID",
            "token",
            "version",
            "datakey"
    };
    public static final String[] updateTokenJson = new String[]{
            ""
    };

    //Delivery Days PHP Constants
    public static final String deliveryDaysPHP = "p_user_DelDays.php";
    public static final String deliveryDaysTag = "deliveryDays";
    public static final String[] deliveryDaysRequestKeys = new String[]{
            "CusID",
            "datakey"
    };
    public static final String[] deliveryDaysJson = new String[]{
            "wda_Name",
            "wda_ID"
    };

    //Delivery Day Times PHP Constants
    public static final String deliveryDayTimesPHP = "p_user_DelDayTimes.php";
    public static final String deliveryDayTimesTag = "deliveryDayTimes";
    public static final String[] deliveryDayTimesRequestKeys = new String[]{
            "WdaID",
            "CusID",
            "datakey"
    };
    public static final String[] deliveryDayTimesJson = new String[]{
            "Time"
    };

}
