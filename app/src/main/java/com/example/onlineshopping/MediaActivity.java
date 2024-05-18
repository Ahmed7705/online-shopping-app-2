package com.example.onlineshopping;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        VideoView videoView = findViewById(R.id.videoView);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.my_video;
        Uri uri = Uri.parse(videoPath);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.setVideoURI(uri);

        videoView.start();
    }
}

