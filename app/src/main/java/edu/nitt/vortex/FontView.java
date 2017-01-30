package edu.nitt.vortex;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by HP on 06-01-2017.
 */

public class FontView extends AppCompatTextView {

    private int type=2;
    public FontView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs,context);
    }

    public FontView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs,context);
    }

    public FontView(Context context) {
        super(context);
        init(null,context);
    }

    public void init(AttributeSet attrs,Context context) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.FontView,
                0, 0);

        try {
            type = a.getInteger(R.styleable.FontView_type, 1);
        } finally {
            a.recycle();
        }
        if (type==1){
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/mb.ttf");
            setTypeface(tf ,1);
        }

        else if (type==2){
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/mr.ttf");
            setTypeface(tf ,1);
        }



    }

}