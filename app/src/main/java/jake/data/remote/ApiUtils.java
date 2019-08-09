package jake.data.remote;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * API Utility for Retrofit2
 */
public class ApiUtils {
    private static final String BASE_URL = "http://api.upbit.com/v1/";

    public static APIServiceInterface getAPIService() {
        return jake.data.remote.RetrofitClient.getClient(BASE_URL).create(APIServiceInterface.class);
    }

    public static RequestBody toRequestBody(String value) {
        return RequestBody.create(MediaType.parse("text/plain"), value);
    }
}
