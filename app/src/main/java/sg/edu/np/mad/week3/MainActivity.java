package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.ImageView;
import  android.widget.VideoView;
import android.widget.MediaController;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //play music
        MediaPlayer media = MediaPlayer.create(this,R.raw.baby_laughing);
        media.start();
        //once done with playback
        media.release();
        media = null;


        //play video
        VideoView view = findViewById(R.id.videoShow);
        view.setVideoURI(Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.rabbid));
        view.start();
    }
}
