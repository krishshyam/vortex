package edu.nitt.vortex;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class WorkshopActivity extends AppCompatActivity {
    public GridView gridview;
    public WorkshopActivity.GridViewAdapter gridViewAdapter=null;
    private int SCROLL_LOCK=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);


        gridview = (GridView) findViewById(R.id.gridview);
        gridViewAdapter=new WorkshopActivity.GridViewAdapter(this);
        gridview.setAdapter(gridViewAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent toDetails=new Intent(getApplicationContext(),DetailsActivity.class);
                toDetails.putExtra("event_id",position);
                toDetails.putExtra("from_id",1);
                startActivity(toDetails);

                overridePendingTransition(R.anim.splash_in,R.anim.splash_out);
            }
        });



        //gridview.setOnTouchListener(new customOnTouchListener());

    }

    public class GridViewAdapter extends BaseAdapter {

        private final Context mContext;
        private Integer[] icons = {
                R.mipmap.ppla,
                R.mipmap.django,
                R.mipmap.ethical,
                R.mipmap.game_dev,
                R.mipmap.ar,
                R.mipmap.cloud,
        };


        public GridViewAdapter(Context context) {
            this.mContext = context;

        }

        @Override
        public int getCount() {
            return 6;
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

                final WorkshopActivity.GridViewAdapter.ViewHolder viewHolder = new WorkshopActivity.GridViewAdapter.ViewHolder(nameTextView, imageViewCoverArt);
                convertView.setTag(viewHolder);

            }

            final WorkshopActivity.GridViewAdapter.ViewHolder viewHolder = (WorkshopActivity.GridViewAdapter.ViewHolder)convertView.getTag();

            viewHolder.nameTextView.setText(DetailsActivity.w_labels[position]);
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
}
