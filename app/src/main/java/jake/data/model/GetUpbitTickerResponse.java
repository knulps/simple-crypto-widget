package jake.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUpbitTickerResponse {
    @SerializedName("market")
    @Expose
    private String market;
    @SerializedName("trade_date")
    @Expose
    private String tradeDate;
    @SerializedName("trade_time")
    @Expose
    private String tradeTime;
    @SerializedName("trade_date_kst")
    @Expose
    private String tradeDateKst;
    @SerializedName("trade_time_kst")
    @Expose
    private String tradeTimeKst;
    @SerializedName("trade_timestamp")
    @Expose
    private Long tradeTimestamp;
    @SerializedName("opening_price")
    @Expose
    private Double openingPrice;
    @SerializedName("high_price")
    @Expose
    private Double highPrice;
    @SerializedName("low_price")
    @Expose
    private Double lowPrice;
    @SerializedName("trade_price")
    @Expose
    private Double tradePrice;
    @SerializedName("prev_closing_price")
    @Expose
    private Double prevClosingPrice;
    @SerializedName("change")
    @Expose
    private String change;
    @SerializedName("change_price")
    @Expose
    private Double changePrice;
    @SerializedName("change_rate")
    @Expose
    private Double changeRate;
    @SerializedName("signed_change_price")
    @Expose
    private Double signedChangePrice;
    @SerializedName("signed_change_rate")
    @Expose
    private Double signedChangeRate;
    @SerializedName("trade_volume")
    @Expose
    private Double tradeVolume;
    @SerializedName("acc_trade_price")
    @Expose
    private Double accTradePrice;
    @SerializedName("acc_trade_price_24h")
    @Expose
    private Double accTradePrice24h;
    @SerializedName("acc_trade_volume")
    @Expose
    private Double accTradeVolume;
    @SerializedName("acc_trade_volume_24h")
    @Expose
    private Double accTradeVolume24h;
    @SerializedName("highest_52_week_price")
    @Expose
    private Double highest52WeekPrice;
    @SerializedName("highest_52_week_date")
    @Expose
    private String highest52WeekDate;
    @SerializedName("lowest_52_week_price")
    @Expose
    private Double lowest52WeekPrice;
    @SerializedName("lowest_52_week_date")
    @Expose
    private String lowest52WeekDate;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeDateKst() {
        return tradeDateKst;
    }

    public void setTradeDateKst(String tradeDateKst) {
        this.tradeDateKst = tradeDateKst;
    }

    public String getTradeTimeKst() {
        return tradeTimeKst;
    }

    public void setTradeTimeKst(String tradeTimeKst) {
        this.tradeTimeKst = tradeTimeKst;
    }

    public Long getTradeTimestamp() {
        return tradeTimestamp;
    }

    public void setTradeTimestamp(Long tradeTimestamp) {
        this.tradeTimestamp = tradeTimestamp;
    }

    public Double getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(Double openingPrice) {
        this.openingPrice = openingPrice;
    }

    public Double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }

    public Double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getPrevClosingPrice() {
        return prevClosingPrice;
    }

    public void setPrevClosingPrice(Double prevClosingPrice) {
        this.prevClosingPrice = prevClosingPrice;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public Double getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(Double changePrice) {
        this.changePrice = changePrice;
    }

    public Double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Double changeRate) {
        this.changeRate = changeRate;
    }

    public Double getSignedChangePrice() {
        return signedChangePrice;
    }

    public void setSignedChangePrice(Double signedChangePrice) {
        this.signedChangePrice = signedChangePrice;
    }

    public Double getSignedChangeRate() {
        return signedChangeRate;
    }

    public void setSignedChangeRate(Double signedChangeRate) {
        this.signedChangeRate = signedChangeRate;
    }

    public Double getTradeVolume() {
        return tradeVolume;
    }

    public void setTradeVolume(Double tradeVolume) {
        this.tradeVolume = tradeVolume;
    }

    public Double getAccTradePrice() {
        return accTradePrice;
    }

    public void setAccTradePrice(Double accTradePrice) {
        this.accTradePrice = accTradePrice;
    }

    public Double getAccTradePrice24h() {
        return accTradePrice24h;
    }

    public void setAccTradePrice24h(Double accTradePrice24h) {
        this.accTradePrice24h = accTradePrice24h;
    }

    public Double getAccTradeVolume() {
        return accTradeVolume;
    }

    public void setAccTradeVolume(Double accTradeVolume) {
        this.accTradeVolume = accTradeVolume;
    }

    public Double getAccTradeVolume24h() {
        return accTradeVolume24h;
    }

    public void setAccTradeVolume24h(Double accTradeVolume24h) {
        this.accTradeVolume24h = accTradeVolume24h;
    }

    public Double getHighest52WeekPrice() {
        return highest52WeekPrice;
    }

    public void setHighest52WeekPrice(Double highest52WeekPrice) {
        this.highest52WeekPrice = highest52WeekPrice;
    }

    public String getHighest52WeekDate() {
        return highest52WeekDate;
    }

    public void setHighest52WeekDate(String highest52WeekDate) {
        this.highest52WeekDate = highest52WeekDate;
    }

    public Double getLowest52WeekPrice() {
        return lowest52WeekPrice;
    }

    public void setLowest52WeekPrice(Double lowest52WeekPrice) {
        this.lowest52WeekPrice = lowest52WeekPrice;
    }

    public String getLowest52WeekDate() {
        return lowest52WeekDate;
    }

    public void setLowest52WeekDate(String lowest52WeekDate) {
        this.lowest52WeekDate = lowest52WeekDate;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
