package app.coco.com.coolweather.util;

/**
 * Created by CoCo on 2017/2/22.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
