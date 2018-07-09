import android.app.Application;

import okhttp3.OkHttpClient;

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // monitoring the parse network traffic
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

    }
}
