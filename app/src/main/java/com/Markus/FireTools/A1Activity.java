package com.Markus.FireTools;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Bundle;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.io.IOException;
import java.util.List;

public class A1Activity extends Activity {

    Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        Intent localIntent = new Intent();
        try {
            Runtime.getRuntime().exec("su -c input keyevent 223");
        } catch (IOException e) {
            e.printStackTrace();
        }
        startActivity(localIntent);

        finish();
        super.onCreate(savedInstanceState);
    }

}
