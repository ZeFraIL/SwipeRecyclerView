package zeev.fraiman.swiperecyclerview;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FullscreenImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_image);

        ImageView ivFullImage = findViewById(R.id.ivFullImage);
        int imageResId = getIntent().getIntExtra("imageResId", R.drawable.ic_launcher_background);
        ivFullImage.setImageResource(imageResId);
    }
}
