package edu.nitt.vortex;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class EventsActivity extends AppCompatActivity {
    public GridView gridview;
    public GridViewAdapter gridViewAdapter=null;
    private int SCROLL_LOCK=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);


        gridview = (GridView) findViewById(R.id.gridview);
        gridViewAdapter=new GridViewAdapter(this);
        gridview.setAdapter(gridViewAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent toDetails=new Intent(getApplicationContext(),DetailsActivity.class);
                toDetails.putExtra("event_id",position);
                toDetails.putExtra("from_id",0);
                startActivity(toDetails);

                overridePendingTransition(R.anim.splash_in,R.anim.splash_out);
            }
        });



       //gridview.setOnTouchListener(new customOnTouchListener());

    }

    public class GridViewAdapter extends BaseAdapter {

        private final Context mContext;
        private Integer[] icons = {
                R.mipmap.code_surf,
                R.mipmap.ospc,
                R.mipmap.ml,
                R.mipmap.paper_presentation,
                R.mipmap.triathlon,
                R.mipmap.clueless,
                R.mipmap.hunt_the_code,
                R.mipmap.webbed,
                R.mipmap.main_quiz,
                R.mipmap.tech_dumb_c,
                R.mipmap.mathzz,
                R.mipmap.ctf

        };





        public GridViewAdapter(Context context) {
            this.mContext = context;

        }

        @Override
        public int getCount() {
            return 12;
        }



        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            if (convertView == null) {
                final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
                convertView = layoutInflater.inflate(R.layout.event_grid_item, null);

                final ImageView imageViewCoverArt = (ImageView) convertView.findViewById(R.id.iv_events);
                final TextView nameTextView = (TextView) convertView.findViewById(R.id.iv_label);

                final ViewHolder viewHolder = new ViewHolder(nameTextView, imageViewCoverArt);
                convertView.setTag(viewHolder);

            }

            final ViewHolder viewHolder = (ViewHolder)convertView.getTag();

                viewHolder.nameTextView.setText(DetailsActivity.labels[position]);
                viewHolder.imageViewCoverArt.setImageResource(icons[position]);

             return convertView;
        }

        private class ViewHolder {
            private final TextView nameTextView;
            private final ImageView imageViewCoverArt;

            public ViewHolder(TextView nameTextView,ImageView imageViewCoverArt) {
                this.nameTextView = nameTextView;
                this.imageViewCoverArt = imageViewCoverArt;

            }
        }

    }


    public class customOnTouchListener implements View.OnTouchListener
    {

        float startX,startY,endX,endY;

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            switch (event.getAction())
            {
/*
                case MotionEvent.ACTION_DOWN:

                    SCROLL_LOCK=gridview.pointToPosition((int) event.getX(), (int) event.getY());
                    if(SCROLL_LOCK>-1) {
                        startY=event.getY();

                        //((ImageView)findViewById(layoutIcds[cur_layout_index]).findViewWithTag("icon")).setImageResource(R.mipmap.events_clicked);
                        ((ImageView) gridview.getChildAt(SCROLL_LOCK).findViewById(R.id.iv_events)).setColorFilter(Color.parseColor("#3498db"));
                    }
                    return true;


                case MotionEvent.ACTION_UP:
                    if(SCROLL_LOCK>-1) {
                        int pos=gridview.pointToPosition((int) event.getX(), (int) event.getY());
                        Log.e("grid","s:"+SCROLL_LOCK+"<-->p:"+pos);
                        //((ImageView)findViewById(layoutIds[cur_layout_index]).findViewWithTag("icon")).setImageResource(R.mipmap.events);
                        ((ImageView) gridview.getChildAt(SCROLL_LOCK).findViewById(R.id.iv_events)).setColorFilter(Color.parseColor("#000000"));
                        if (Math.abs(event.getY()-startY)<30)
                            Toast.makeText(getApplicationContext(), gridViewAdapter.labels[SCROLL_LOCK], Toast.LENGTH_SHORT).show();
                    }
                    return true;
*/

                case MotionEvent.ACTION_UP:
                    int pos_u=gridview.pointToPosition((int) event.getX(), (int) event.getY());
                    Log.e("grid",""+pos_u);
                    return true;

                case MotionEvent.ACTION_DOWN:
                    int pos_d=gridview.pointToPosition((int) event.getX(), (int) event.getY());
                    Log.e("grid",""+pos_d);
                    ((ImageView) gridview.getChildAt(pos_d).findViewById(R.id.iv_events)).setColorFilter(Color.parseColor("#3498db"));

                    return true;
            }

            return false;
        }
    }


}
