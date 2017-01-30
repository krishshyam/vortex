package edu.nitt.vortex;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int[] layoutIds={R.id.ll_events,R.id.ll_workshops,R.id.ll_hospitality,R.id.ll_contacts};

    public void setupTouchListeners()
    {
        for(int i=0;i<4;i++)
            ((LinearLayout)findViewById(layoutIds[i])).setOnTouchListener(new customOnTouchListener(i));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, ForegroundNotificationService.class));

        setupTouchListeners();

    }

    public class customOnTouchListener implements View.OnTouchListener
    {

        int cur_layout_index;

        customOnTouchListener(int cur_layout_index)
        {
            this.cur_layout_index=cur_layout_index;
        }
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            switch (event.getAction())
            {

                case MotionEvent.ACTION_DOWN:
                    //((ImageView)findViewById(layoutIds[cur_layout_index]).findViewWithTag("icon")).setImageResource(R.mipmap.events_clicked);
                    ((ImageView)findViewById(layoutIds[cur_layout_index]).findViewWithTag("icon")).setColorFilter(Color.parseColor("#3498db"));
                    return true;


                case MotionEvent.ACTION_UP:
                    //((ImageView)findViewById(layoutIds[cur_layout_index]).findViewWithTag("icon")).setImageResource(R.mipmap.events);
                    ((ImageView)findViewById(layoutIds[cur_layout_index]).findViewWithTag("icon")).setColorFilter(Color.parseColor("#000000"));

                    switch (cur_layout_index)
                    {
                        case 0:
                            startActivity(new Intent(getApplicationContext(),EventsActivity.class));
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }


                    return true;
            }
            return false;
        }
    }
}



