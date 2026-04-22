package duskis.fruityvice.unsplace;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface UnsplaceService {

    @GET("/search/photos")
    Single<Photos> search(@Query("query") String query);
}
