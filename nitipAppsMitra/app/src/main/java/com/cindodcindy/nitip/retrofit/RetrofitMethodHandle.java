package com.cindodcindy.nitip.retrofit;

import com.cindodcindy.nitip.pojo.pojo_bagasi.get_jasa.NitipGetLuggageRespon;
import com.cindodcindy.nitip.pojo.pojo_bagasi.post_jasa.NitipPostLuggageRespon;
import com.cindodcindy.nitip.pojo.pojo_konfirm.pojo_post_confirm.NitipResponPostConfirm;
import com.cindodcindy.nitip.pojo.pojo_regis_login.pojo_login.NitipLoginRespon;
import com.cindodcindy.nitip.pojo.pojo_regis_login.pojo_regis.NitipRegisRespon;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitMethodHandle {

    @Headers({
            "Content-Type:application/json"
    })
    @POST("auth/registration")
    Call<NitipRegisRespon> sellerRegistration(@Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("auth/login")
    Call<NitipLoginRespon> sellerLogin(@Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("luggages/users/{userId}/luggages")
    Call<NitipPostLuggageRespon> sellerPostJasa(@Path("userId") Long user_id, @Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @GET("luggages/users/{userId}/luggages")
    Call<NitipGetLuggageRespon> sellerGetOwnLuggage(@Path("userId") Long user_id);


    @Headers({
            "Content-Type:application/json"
    })
    @POST("confirmation/users/{userId}/confirmations")
    Call<NitipResponPostConfirm> sellerPostConfirmToOwn(@Path("userId") Long user_id, @Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("confirmation/users/{userId}/confirmations")
    Call<NitipResponPostConfirm> sellerPostConfirmToBuyer(@Path("userId") Long user_id, @Body JsonObject body);




/*






    @Headers({
            "Content-Type:application/json"
    })
    @POST("item/users/{userId}/items")
    Call<FoodTrashMitraPostItemRespon> isPostDataItem(@Path ("userId") Long id, @HeaderMap Map<String,String > Map, @Body JsonObject body);




    @Headers({
            "Content-Type:application/json"
    })
    @GET("item/users/{userId}/items")
    Call<FoodTrashMitraGetItemRespon> getItem(@Path ("userId") Long id, @HeaderMap Map<String,String > Map);


    @Headers({
            "Content-Type:application/json"
    })
    @POST("confirm/users/{userId}/confirm")
    Call<PostConfirmRespon> postConfirmToMySelf(@Path ("userId") Long id, @HeaderMap Map<String,String > Map, @Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("confirm/users/{userId}/confirm")
    Call<PostConfirmRespon> postConfirmToBuyer(@Path ("userId") Long id, @HeaderMap Map<String,String > Map, @Body JsonObject body);




    @Headers({
            "Content-Type:application/json"
    })
    @GET("confirm/users/{userId}/confirm")
    Call<GetConfirmRespon> getListConfirm(@Path ("userId") Long id, @HeaderMap Map<String,String > Map);


    //edit delete

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("item/users/{userId}/items/{itemId}")
    Call<MitraEditItemRespon> editItem(@Path ("userId") Long id, @Path ("itemId") Long idEditItem, @HeaderMap Map<String,String > Map, @Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })


    //@HeaderMap Map<String,String > Map,
    @PUT("confirm/users/{userId}/confirm/{confirmId}")
    Call<EditConfirmRespon> editConfirm(@Path ("userId") Long id, @Path ("confirmId") Long idConfirmEdit,@HeaderMap Map<String,String > Map,  @Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("confirm/users/{userId}/confirm/{confirmId}")
    Call<EditConfirmRespon> editConfirmToOwnSelf(@Path ("userId") Long id,@Path ("confirmId") Long idConfirmEdit, @HeaderMap Map<String,String > Map,@Body JsonObject body);



    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("item/users/{userId}/items/{itemId}")
    Call<String> deleteItem(@Path ("userId") Long id,@Path ("itemId") Long idItem, @HeaderMap Map<String,String > Map);


    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("order/users/{userId}/orders/{orderId}")
    Call<String> deleteOrderForMe(@Path ("userId") Long id, @Path ("orderId") Long idOrder,@HeaderMap Map<String,String > Map);



    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("confirm/users/{userId}/confirm/{confirmId}")
    Call<String> deleteConfirm(@Path ("userId") Long id, @Path ("confirmId") Long idConfirm, @HeaderMap Map<String,String > Map);

    //gabisa congs
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("confirm/users/{userId}/confirm/{confirmId}")
    Call<String> deleteConfirmForCustomer(@Path ("userId") Long id, @Path ("confirmId") Long idConfirm, @HeaderMap Map<String,String > Map);




 */



}
