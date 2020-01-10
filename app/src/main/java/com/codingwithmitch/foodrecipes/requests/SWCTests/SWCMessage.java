package com.codingwithmitch.foodrecipes.requests.SWCTests;

import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface SWCMessage {
    @Headers({
            "User-Agent : UnityPlayer/2017.2.1p4 (UnityWebRequest/1.0, libcurl/7.51.0-DEV)",
            "Accept : */*"
    })

    @FormUrlEncoded
    @POST("")
    Response test(

            @Field("body") GenerateNewPlayerJson generateNewPlayerJson
    );
}
