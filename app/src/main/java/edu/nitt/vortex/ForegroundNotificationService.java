package edu.nitt.vortex;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by HP INDIA on 30-01-2017.
 */
public class ForegroundNotificationService extends FirebaseMessagingService {
        @Override
        public void onMessageReceived(RemoteMessage remoteMessage) {
            super.onMessageReceived(remoteMessage);
            Log.d("msg", "onMessageReceived: " + remoteMessage.getData().get("message"));
            NotificationCompat.Builder builder = new  NotificationCompat.Builder(this)
                    .setSmallIcon(R.mipmap.logo)
                    .setContentTitle("Vortex")
                    .setContentText(remoteMessage.getNotification().getBody());
            NotificationManager manager = (NotificationManager)     getSystemService(NOTIFICATION_SERVICE);
            manager.notify(0, builder.build());


    }
}
