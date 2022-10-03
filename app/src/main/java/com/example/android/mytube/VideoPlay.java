package com.example.android.mytube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoPlay extends AppCompatActivity {
    private TextView textView;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);
        textView = findViewById(R.id.name);
        videoView = findViewById(R.id.video);

        Intent intent = getIntent();
        String videoURL = intent.getStringExtra("Video");
        String videoName = intent.getStringExtra("VideoName");

        textView.setText(videoName);
        Log.d("nitesh" , videoURL);

        videoView.setVideoURI(Uri.parse(videoURL));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        videoView.start();

    }

}