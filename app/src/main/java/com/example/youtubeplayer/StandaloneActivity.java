package com.example.youtubeplayer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo=findViewById(R.id.btnPlayVideo);
        Button btnPlaylist=findViewById(R.id.btnPlaylist);

        btnPlaylist.setOnClickListener(this);
        btnPlayVideo.setOnClickListener(this);

//        View.OnClickListener onClickListener=new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        };
//
//        btnPlaylist.setOnClickListener(onClickListener);
//        btnPlayVideo.setOnClickListener(onClickListener);
//
//        btnPlaylist.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


    }
    @Override
    public void onClick(View view) {
    Intent intent= null;

    switch(view.getId())
    {
        case R.id.btnPlayVideo:
            intent= YouTubeStandalonePlayer.createVideoIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_VIDEO_ID,0,true,false);
            break;
        case R.id.btnPlaylist:
            intent = YouTubeStandalonePlayer.createPlaylistIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_PLAYLIST,0,0,true,true);
            break;
            default:
    }
    if(intent!=null){
        startActivity(intent);
    }
    }


}
