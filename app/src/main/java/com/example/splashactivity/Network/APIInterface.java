package com.example.splashactivity.Network;
import com.example.splashactivity.Model.EmailAddress;
import com.example.splashactivity.Model.LoginResponse;
import com.example.splashactivity.Model.SendData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIInterface {

   /* @POST("list")
    Call<LoginResponse> createUser(@Body LoginResponse login);

    @POST("list")
    Call<Object> getResponse(@Field("body") String body);
*/

    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @POST("register_api.php")
    Call<LoginResponse> getFriendsLocation(@Body SendData friendModel);


}
