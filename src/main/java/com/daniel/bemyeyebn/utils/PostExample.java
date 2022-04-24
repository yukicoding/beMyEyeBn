package com.daniel.bemyeyebn.utils;

import okhttp3.*;

public class PostExample {
    public static  MediaType JSON = MediaType.get("application/json;charset=utf-8");
     OkHttpClient  client = new OkHttpClient();
    public String post(String url,String json) throws Exception{
        RequestBody body = RequestBody.create(json,JSON);
        Request request = new Request.Builder().url(url).post(body).build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
}
