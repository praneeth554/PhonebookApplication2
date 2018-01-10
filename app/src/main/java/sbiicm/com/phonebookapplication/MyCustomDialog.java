package sbiicm.com.phonebookapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MyCustomDialog extends AppCompatActivity {

    TextView phone,number;
    String sphone,snumber;
    Button buttonOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

         try

         {
             requestWindowFeature(Window.FEATURE_NO_TITLE);
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_my_custom_dialog);
             phone = (TextView)findViewById(R.id.phone);
             number = (TextView)findViewById(R.id.number);
             sphone = getIntent().getExtras().getString("incomingNumber");
             snumber = getIntent().getExtras().getString("data");
             phone.setText(sphone);
             number.setText(snumber);
             buttonOK.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     MyCustomDialog.this.finish();
                     System.exit(0);
                 }
             });
         }
         catch(Exception e)
         {
             Log.d("Exception",e.toString());
             e.printStackTrace();
         }


    }
}
