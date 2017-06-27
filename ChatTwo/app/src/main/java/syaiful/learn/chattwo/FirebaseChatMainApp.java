package syaiful.learn.chattwo;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirebaseChatMainApp extends Application {

    private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        FirebaseChatMainApp.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
