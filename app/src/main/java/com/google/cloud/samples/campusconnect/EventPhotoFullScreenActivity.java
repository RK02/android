package com.google.cloud.samples.campusconnect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by RK on 04/11/2015.
 */
public class EventPhotoFullScreenActivity extends AppCompatActivity {

    ImageView event_photo_fs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_photo_full_screen);
        event_photo_fs = (ImageView) findViewById(R.id.iv_event_photo_fs);

        Bundle bundle = getIntent().getExtras();
        Integer e_Photo = bundle.getInt("E_PHOTO");
        event_photo_fs.setImageResource(e_Photo);
    }
}
