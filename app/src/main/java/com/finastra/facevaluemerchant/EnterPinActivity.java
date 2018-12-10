package com.finastra.facevaluemerchant;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class EnterPinActivity extends AppCompatActivity {

    private Button mBtnEnterPin;
    private EditText mEtPin;
    private LinearLayout mLinearLayoutEnterPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_pin);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mLinearLayoutEnterPin = (LinearLayout) findViewById(R.id.linearLayoutEnterPin);
        mEtPin = (EditText) findViewById(R.id.etPin);
        mBtnEnterPin = (Button) findViewById(R.id.btnEnterPin);

        mBtnEnterPin.setOnClickListener(mBtnEnterPinListener);
    }

    private View.OnClickListener mBtnEnterPinListener = new View.OnClickListener() {
        public void onClick(View v) {
            if(isEmpty(mEtPin)) {
                Snackbar snackbar = Snackbar.make(mLinearLayoutEnterPin, "Please enter your pin", Snackbar.LENGTH_LONG);
                snackbar.show();
            } else {
                Intent intent = new Intent(EnterPinActivity.this, TransactionResultActivity.class);
//            intent.putExtra("MerchantName", "Jollibee");
                startActivity(intent);
            }
        }
    };

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }

    private boolean isEmpty(EditText et){
        return et.getText().toString().trim().length()==0;
    }
}
