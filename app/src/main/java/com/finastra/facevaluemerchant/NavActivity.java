package com.finastra.facevaluemerchant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NavActivity extends AppCompatActivity {

    private Button mBuyerHasPhoneBtn;
    private Button mBuyerHasNoPhoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mBuyerHasPhoneBtn = (Button) findViewById(R.id.btnBuyerHasPhone);
        mBuyerHasNoPhoneBtn = (Button) findViewById(R.id.btnBuyerHasNoPhone);

        mBuyerHasPhoneBtn.setOnClickListener(mBuyerHasPhoneBtnListener);
        mBuyerHasNoPhoneBtn.setOnClickListener(mBuyerHasNoPhoneBtnListener);
    }

    private View.OnClickListener mBuyerHasPhoneBtnListener = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(NavActivity.this, QRActivity.class);
//            intent.putExtra("MerchantName", "Jollibee");
            startActivity(intent);

        }
    };

    private View.OnClickListener mBuyerHasNoPhoneBtnListener = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(NavActivity.this, EnterAmountActivity.class);
//            intent.putExtra("MerchantName", "Jollibee");
            startActivity(intent);

        }
    };

}
