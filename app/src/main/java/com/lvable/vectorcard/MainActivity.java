package com.lvable.vectorcard;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout layout = (RelativeLayout)findViewById(R.id.card_content);
        final TextView textView = (TextView)findViewById(R.id.tv_content);
        final Button btn = (Button)findViewById(R.id.button);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable drawable = layout.getBackground();
                if ( drawable instanceof Animatable){
                    textView.setVisibility(View.INVISIBLE);
                    ((Animatable) drawable).start();
                    btn.setVisibility(View.VISIBLE);
                    btn.animate().alpha(1).scaleX(1.1f).scaleY(1.1f).setInterpolator(new AccelerateInterpolator()).setDuration(350).start();
                    
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,VectorIconActivity.class);
                startActivity(intent);
            }
        });

    }



}
