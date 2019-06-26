package jake.data.remote;

import jake.data.model.GetTickerResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Retrofit2 http request Service
 */
public interface APIServiceInterface {

    @GET("ticker")
    Call<GetTickerResponse> getTicker(@Query("currency") String currency, @Query("format") String format);
}
