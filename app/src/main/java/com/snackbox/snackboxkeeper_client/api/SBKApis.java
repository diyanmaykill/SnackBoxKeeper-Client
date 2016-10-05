package com.snackbox.snackboxkeeper_client.api;

import com.snackbox.snackboxkeeper_client.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by dalejulian on 10/5/16.
 */

public interface SBKApis {
    /* Sample only */
    @GET("posts")
    Call<List<Post>> getPosts();
}
