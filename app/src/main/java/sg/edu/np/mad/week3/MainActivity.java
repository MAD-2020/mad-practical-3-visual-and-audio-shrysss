package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView babyImage = (ImageView) findViewById(R.id.babyImage);
        babyImage.setImageResource(R.drawable.cute_baby);
    }
}
