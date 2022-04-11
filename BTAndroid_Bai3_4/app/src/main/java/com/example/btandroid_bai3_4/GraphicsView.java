package com.example.btandroid_bai3_4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[2];
    int i =0;
    long last_tick=0, period=200;
    Context ctext;

    public GraphicsView(Context context){
        super(context);
        ctext = context;
        MediaPlayer mediaPlayer = MediaPlayer.create(ctext,R.raw.gangnam_style);
        mediaPlayer.start();
        frames[0] = BitmapFactory.decodeResource(getResources(),R.drawable.left);
        frames[1] = BitmapFactory.decodeResource(getResources(),R.drawable.right);
    }

    @Override
    protected void onDraw(Canvas canvas){
        if(i<frames.length){
            long time = (System.currentTimeMillis()-last_tick);
            if(time >= period) {
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(frames[i], 0, 00, new Paint());
                i++;
                postInvalidate();
            }else{
                canvas.drawBitmap(frames[i], 0, 00, new Paint());
                postInvalidate();
            }
        }else{
            i=0;
            postInvalidate();
        }
        invalidate();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        i++;
        return true;
    }


}
