package com.application.digitalent.myapps.apiHelper;

/**
 * Created by Teke on 01/11/2017.
 */

public class UtilsApi {
      public static final String BASE_URL_API = "http://54.251.83.205/api/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
