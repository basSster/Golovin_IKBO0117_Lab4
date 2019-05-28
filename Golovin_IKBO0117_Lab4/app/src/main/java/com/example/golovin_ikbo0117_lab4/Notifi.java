package com.example.golovin_ikbo0117_lab4;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.example.laboratorynumber4.R;
import android.support.v4.app.NotificationCompat;

public class Notifi extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent notificationIntent = new Intent(context, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "notification_id")
                .setAutoCancel(true)
                .setContentTitle("Current day")
                .setContentText("Wake up")
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.mipmap.ic_launcher);


        Notification notification = builder.build();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Service.NOTIFICATION_SERVICE);
        notificationManager.notify(1, notification);
    }
}
