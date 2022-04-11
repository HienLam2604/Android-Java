package com.example.btandroid5_bai1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class GraphicsView extends View {
    int x=0,y=0,d=100,r=50;
    String[] colors = {"#c0392b","#f1c40f","#2980b9","#1abc9c","#bdc3c7"};
    public GraphicsView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        int randomColor = new Random().nextInt(colors.length);
        if(x!=0 && y!=0){
            int right= x+d;
            int bottom= y+r;
            Rect r = new Rect(x,y,right,bottom);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.parseColor(colors[randomColor]));
            canvas.drawRect(r,paint);
        }
        invalidate();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        x = (int) event.getX();
        y = (int) event.getY();
        return  super.onTouchEvent(event);
    }

}
