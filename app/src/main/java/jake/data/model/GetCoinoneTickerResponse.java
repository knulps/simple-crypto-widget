package jake.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Version Response
 * Created by Jake on 2019-06-26
 */
public class GetCoinoneTickerResponse {
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("volume")
    @Expose
    private String volume;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("yesterday_last")
    @Expose
    private String yesterdayLast;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("yesterday_low")
    @Expose
    private String yesterdayLow;
    @SerializedName("errorCode")
    @Expose
    private String errorCode;
    @SerializedName("yesterday_volume")
    @Expose
    private String yesterdayVolume;
    @SerializedName("high")
    @Expose
    private String high;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("yesterday_first")
    @Expose
    private String yesterdayFirst;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("yesterday_high")
    @Expose
    private String yesterdayHigh;
    @SerializedName("low")
    @Expose
    private String low;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getYesterdayLast() {
        return yesterdayLast;
    }

    public void setYesterdayLast(String yesterdayLast) {
        this.yesterdayLast = yesterdayLast;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getYesterdayLow() {
        return yesterdayLow;
    }

    public void setYesterdayLow(String yesterdayLow) {
        this.yesterdayLow = yesterdayLow;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getYesterdayVolume() {
        return yesterdayVolume;
    }

    public void setYesterdayVolume(String yesterdayVolume) {
        this.yesterdayVolume = yesterdayVolume;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getYesterdayFirst() {
        return yesterdayFirst;
    }

    public void setYesterdayFirst(String yesterdayFirst) {
        this.yesterdayFirst = yesterdayFirst;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getYesterdayHigh() {
        return yesterdayHigh;
    }

    public void setYesterdayHigh(String yesterdayHigh) {
        this.yesterdayHigh = yesterdayHigh;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

}