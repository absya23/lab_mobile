package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver broadcastReceiver;
    private IntentFilter filter;
    public Button btn ;

    public void processReceive(Context context, Intent intent){
        Toast.makeText(context, getString(R.string.you_have_a_new_message), Toast.LENGTH_LONG).show();
        TextView tvContent = (TextView) findViewById(R.id.tv_content);

        Bundle bundle = intent.getExtras();
        SmsMessage[] msgs = null;

        String str = "";
        if (bundle != null){
            Object[] pdus = (Object[]) bundle.get("pdus");
            msgs = new SmsMessage[pdus.length];

            for (int i=0; i<msgs.length; i++){
                msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
                str += "SMS from" + msgs[i].getOriginatingAddress();

                str += ": ";
                str += msgs[i].getMessageBody().toString();
                str += "\n";
            }
        }
        tvContent.setText(str);
    }
    private void initBroadcastReceiver(){
        filter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        broadcastReceiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                processReceive(context,intent);
            }

        };

    }

    @Override
    protected void onResume() {
        super.onResume();
        if(broadcastReceiver == null)
            initBroadcastReceiver();
        registerReceiver(broadcastReceiver, filter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBroadcastReceiver();
//        bai 2

        final TextView textView = (TextView) findViewById(R.id.tv_content);

        IntentFilter filter = new IntentFilter();
        // Đăng ký lọc sự kiện cắm sạc và rút sạc cho intentfilter
        filter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        filter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");

        BroadcastReceiver receiver = new BroadcastReceiver() {

            // Phương thức này sẽ được hệ thống gọi khi nhận được sự kiện đang sạc pin
            @Override
            public void onReceive(Context context, Intent intent) {

                // nếu sự kiện nhận được là kết nối sạc
                if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
                    textView.setText(" Đang sạc pin");
                    Toast.makeText(context, "Power Connected", Toast.LENGTH_LONG).show();
                }
                // nếu sự kiện nhận đưọc là rút sạc
                if(intent.getAction().endsWith(Intent.ACTION_POWER_DISCONNECTED)){
                    textView.setText(" Đã rút sạc");
                    Toast.makeText(context, "Power Disconnected", Toast.LENGTH_LONG).show();
                }
            }
        };

        // Đăng ký nhận thông tin với hệ thống
        registerReceiver(receiver, filter);
    }
}