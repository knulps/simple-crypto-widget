package jake.data.remote;

import java.util.List;

import jake.data.model.GetUpbitTickerResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Retrofit2 http request Service
 */
public interface APIServiceInterface {

    @GET("ticker")
    Call<List<GetUpbitTickerResponse>> getTicker(@Query("markets") String markets);
}
