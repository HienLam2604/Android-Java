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
        frames[0] = BitmapFactory.decodeResource(getResources(),R.drawable.win_1);
        frames[1] = BitmapFactory.decodeResource(getResources(),R.drawable.win_2);
        frames[2] = BitmapFactory.decodeResource(getResources(),R.drawable.win_3);
        frames[3] = BitmapFactory.decodeResource(getResources(),R.drawable.win_4);
        frames[4] = BitmapFactory.decodeResource(getResources(),R.drawable.win_5);
        frames[5] = BitmapFactory.decodeResource(getResources(),R.drawable.win_6);
        frames[6] = BitmapFactory.decodeResource(getResources(),R.drawable.win_7);
        frames[7] = BitmapFactory.decodeResource(getResources(),R.drawable.win_8);
        frames[8] = BitmapFactory.decodeResource(getResources(),R.drawable.win_9);
        frames[9] = BitmapFactory.decodeResource(getResources(),R.drawable.win_10);
        frames[10] = BitmapFactory.decodeResource(getResources(),R.drawable.win_11);
        frames[11] = BitmapFactory.decodeResource(getResources(),R.drawable.win_12);
        frames[12] = BitmapFactory.decodeResource(getResources(),R.drawable.win_13);
        frames[13] = BitmapFactory.decodeResource(getResources(),R.drawable.win_14);
        frames[14] = BitmapFactory.decodeResource(getResources(),R.drawable.win_15);
        frames[15] = BitmapFactory.decodeResource(getResources(),R.drawable.win_16);
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
