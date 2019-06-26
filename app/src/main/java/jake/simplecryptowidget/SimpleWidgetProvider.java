package jake.simplecryptowidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.RemoteViews;

import jake.data.model.GetTickerResponse;
import jake.data.remote.APIServiceInterface;
import jake.data.remote.ApiUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SimpleWidgetProvider extends AppWidgetProvider {
    public static final String TOUCH_ACTION = "jake.simplecryptowidget.TOUCH_ACTION";

    APIServiceInterface service;

    private final String TAG = SimpleWidgetProvider.class.getSimpleName();

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
    }

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        AppWidgetManager mgr = AppWidgetManager.getInstance(context);
        if (intent.getAction() != null && intent.getAction().equals(TOUCH_ACTION)) {
            int appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
            updateAppWidget(context, mgr, appWidgetId);
        }
        super.onReceive(context, intent);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // update each of the widgets with the remote adapter
        for (int appWidgetId : appWidgetIds) {
            Log.e(TAG, "onUpdate, appWidgetIds : " + appWidgetId);
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }

    /**
     * Update Widget
     */
    public void updateAppWidget(final Context context, final AppWidgetManager appWidgetManager, final int appWidgetId) {
        Log.e(TAG, "updateAppWidget, appWidgetId : " + appWidgetId);
        if (service == null) service = ApiUtils.getAPIService();
        service.getTicker("luna", "json").enqueue(new Callback<GetTickerResponse>() {
            @Override
            public void onResponse(Call<GetTickerResponse> call, Response<GetTickerResponse> response) {
                GetTickerResponse getTickerResponse = response.body();

                boolean updateFail = false;
                try {
                    if (getTickerResponse != null && getTickerResponse.getResult() != null && getTickerResponse.getResult().equals("success")) {
                        Log.e(TAG, "update price : " + getTickerResponse.getLast());
                        updateWidgetView(context, appWidgetManager, appWidgetId, getTickerResponse);
                    } else {
                        updateFail = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    updateFail = true;
                }

                if (updateFail) {
                    updateWidgetView(context, appWidgetManager, appWidgetId, null);
                }
            }

            @Override
            public void onFailure(Call<GetTickerResponse> call, Throwable t) {
                updateWidgetView(context, appWidgetManager, appWidgetId, null);
            }
        });
    }

    /**
     * update Widget UI
     */
    private void updateWidgetView(final Context context, final AppWidgetManager appWidgetManager, final int appWidgetId, GetTickerResponse getTickerResponse) {
        Log.e(TAG, "updateView, id : " + appWidgetId);
        RemoteViews updateViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
        updateViews.setTextViewText(R.id.txt_widget_exchange, "Coinone");
        if (getTickerResponse == null) {
            updateViews.setTextViewText(R.id.txt_widget_date, DateFormat.format("HH:mm:ss", System.currentTimeMillis()));
            updateViews.setTextViewText(R.id.txt_widget_price, "-");
        } else {
            updateViews.setTextViewText(R.id.txt_widget_date, DateFormat.format("HH:mm:ss", Long.parseLong(getTickerResponse.getTimestamp()) * 1000));
            updateViews.setTextViewText(R.id.txt_widget_price, Utility.setMoneyFormat(getTickerResponse.getLast()));
            updateViews.setTextViewText(R.id.txt_widget_ticker, String.format("%1$S | KRW", getTickerResponse.getCurrency().toUpperCase()));
        }
        updateViews.setOnClickPendingIntent(R.id.layout_widget_body, getPendingSelfIntent(context, TOUCH_ACTION, appWidgetId));
        appWidgetManager.updateAppWidget(appWidgetId, updateViews);
    }

    /**
     * Get Pending Self Intent
     */
    public PendingIntent getPendingSelfIntent(Context context, String action, int appWidgetId) {
        Log.e(TAG, "getPendingSelfIntent");
        Intent intent = new Intent(context, SimpleWidgetProvider.class);
        intent.setAction(action);
        intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }
}