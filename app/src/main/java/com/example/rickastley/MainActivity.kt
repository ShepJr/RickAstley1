package com.example.rickastley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import android.net.Uri
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fileName = "nevergonnagiveyouup"

        val filePlace = "android.resource://"+ packageName + "/raw/" + R.raw.nevergonnagiveyouup

        val videoView = findViewById<View>(R.id.videoView) as VideoView

        videoView.setVideoURI(Uri.parse(fileName))

        videoView.setMediaController(MediaController(this))

        videoView.start()
    }
}
