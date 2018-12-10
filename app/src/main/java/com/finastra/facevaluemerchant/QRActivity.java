package com.finastra.facevaluemerchant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class QRActivity extends AppCompatActivity {

    private Button mFinishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mFinishButton = (Button) findViewById(R.id.btnQRFinish);
        mFinishButton.setOnClickListener(mFinishButtonListener);
    }

    private View.OnClickListener mFinishButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            finish();
        }
    };

    public boolean onOptionsItemSelected(MenuItem item){
          finish();
          return true;
    }

}
