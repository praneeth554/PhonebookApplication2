package sbiicm.com.phonebookapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;



/**
 * Created by praneeth on 1/5/2018.
 */

public class PhoneStateReceiver extends BroadcastReceiver {

    DBHelper mydb ;

    @Override
    public void onReceive(final Context context, Intent intent) {
        TelephonyManager telephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        telephony.listen(new PhoneStateListener() {
            @Override
            public void onCallStateChanged(int state, String incomingNumber) {
                super.onCallStateChanged(state, incomingNumber);
               //Toast.makeText(context, "" + incomingNumber, Toast.LENGTH_SHORT).show();
                mydb = new DBHelper(context);
                Toast.makeText(context, mydb.getName(incomingNumber)+" "+ incomingNumber+" ", Toast.LENGTH_LONG).show();
                /*String data = mydb.getName(incomingNumber);
                final Intent intents = new Intent(context,MyCustomDialog.class);
                intents.putExtra(data,data);
                intents.putExtra(incomingNumber,incomingNumber);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        context.startActivity(intents);
                    }
                },200);*/




            }
        }, PhoneStateListener.LISTEN_CALL_STATE);


    }



}
