package com.shivam.course_selector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ThirdScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.third);

        Intent activitthat = getIntent();

        String prevacg = activitthat.getExtras().getString("callAct");
    }



}
