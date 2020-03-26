package eliezer.youtubeapp.youtube.api;

import eliezer.youtubeapp.youtube.model.Resultado;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeService {


    /*
    https://www.googleapis.com/youtube/v3/
    search?part=snippet
    &order=date
    &maxResults=20
    &AIzaSyAgUxY1-_V2kXjOwx-36seVspvyUFhWfvs
    &chanelId=UCpf7-LhTbmKk11p4nqw5LYA
    &q=desenvolvimento+android

     https://www.googleapis.com/youtube/v3/search?part=snippet&order=date&maxResults=20&key=AIzaSyAgUxY1-_V2kXjOwx-36seVspvyUFhWfvs&chanelId=UCpf7-LhTbmKk11p4nqw5LYA
     */

    @GET("search")
    Call<Resultado> recuperarVideos(
            @Query("part") String part,
            @Query("order") String order,
            @Query("maxResults") String maxResults,
            @Query("key") String key,
            @Query("channelId") String channelId,
            @Query("q") String q
    );

}
