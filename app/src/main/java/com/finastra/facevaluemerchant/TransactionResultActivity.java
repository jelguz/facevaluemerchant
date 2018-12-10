package com.finastra.facevaluemerchant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransactionResultActivity extends AppCompatActivity {

    private Button mFinishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_result);

        mFinishButton = (Button) findViewById(R.id.btnFinish);
        mFinishButton.setOnClickListener(mFinishButtonListener);
    }

    private View.OnClickListener mFinishButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(TransactionResultActivity.this, NavActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }
    };

}
