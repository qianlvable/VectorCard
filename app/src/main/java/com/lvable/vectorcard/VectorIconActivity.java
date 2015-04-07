package com.lvable.vectorcard;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class VectorIconActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_icon);

        final ImageView play = (ImageView)findViewById(R.id.icon_play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable drawable = play.getDrawable();
                if ( drawable instanceof Animatable){
                    ((Animatable) drawable).start();
                }
            }
        });
    }


}
