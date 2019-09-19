/**
 * https://blog.csdn.net/anhenzhufeng/article/details/78913341
 */

package com.ty.android.ndkdemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ty.android.ndkdemo.NdkLib;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView = null;
    private NdkLib   mNdkLib   = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNdkLib = new NdkLib();
        mTextView = findViewById(R.id.ID_MAIN_TEXTVIEW);
        mTextView.setText(mNdkLib.getStringFromNdk());
    }
}
