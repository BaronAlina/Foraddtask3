package com.example.forittestmodul3;

import android.content.Context;
        import android.content.Intent;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.graphics.Path;
        import android.graphics.Rect;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.MotionEvent;
        import android.view.Surface;
        import android.view.SurfaceHolder;
        import android.view.SurfaceView;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

public class MainForCanvas extends AppCompatActivity {

    public float x;
    public float y;
    public String string, action;
    public  int colorPaint;
    public  int colorCanvas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Canvas(this));
        string=getIntent().getStringExtra("string");
        colorPaint=getIntent().getIntExtra("colorPaint", 0);
        colorCanvas=getIntent().getIntExtra("colorCanvas", 0);
        if ((colorCanvas!=0) && (colorPaint!=0)){
            Toast.makeText(this, "YES", Toast.LENGTH_SHORT).show();
        }
    }


    class Canvas extends SurfaceView implements SurfaceHolder.Callback {

        MyThread myThread;
        int stringInt;

        public Canvas(Context context) {
            super(context);
            getHolder().addCallback(this);
        }

        @Override
        public void surfaceCreated (@NonNull SurfaceHolder holder){
            myThread = new MyThread();
            myThread.start();
        }

        @Override
        public void surfaceChanged (@NonNull SurfaceHolder holder,int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed (@NonNull SurfaceHolder holder){

        }

        class MyThread extends Thread implements View.OnTouchListener {

            Path path=new Path();
            Paint paint = new Paint();

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                x=event.getX();
                y=event.getY();

                stringInt=Integer.parseInt(string);
                paint.setStrokeWidth(stringInt);
                paint.setTextSize(stringInt);
                paint.setAntiAlias(true);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStyle(Paint.Style.STROKE);

                if (colorPaint == 1) {
                    paint.setColor(Color.argb(250, 0, 0, 0));//black
                }if (colorPaint == 2) {
                    paint.setColor(Color.argb(250, 128, 128, 128));//grey
                }if (colorPaint == 3) {
                    paint.setColor(Color.argb(250, 255, 0, 0));//red
                }if (colorPaint == 4) {
                    paint.setColor(Color.argb(250, 255, 99, 99));//red light
                }if (colorPaint == 5) {
                    paint.setColor(Color.argb(250, 255, 128, 0));//orange
                }if (colorPaint == 6) {
                    paint.setColor(Color.argb(250, 255, 171, 25));//orange light
                }if (colorPaint == 7) {
                    paint.setColor(Color.argb(250, 0, 255, 8));//green light
                }if (colorPaint == 8) {
                    paint.setColor(Color.argb(250, 0, 168, 5));//green
                }if (colorPaint == 9) {
                    paint.setColor(Color.argb(250, 0, 255, 247));//bright
                }if (colorPaint == 10) {
                    paint.setColor(Color.argb(250, 0, 187, 255));//blue light
                }if (colorPaint == 11) {
                    paint.setColor(Color.argb(250, 0, 128, 255));//blue
                }if (colorPaint == 12) {
                    paint.setColor(Color.argb(250, 170,0,255));//purple
                }

                if (event.getAction()==MotionEvent.ACTION_MOVE){
                    path.moveTo(x, y);
                }
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    path.lineTo(x, y);
                }
                return true;
            }

            @Override
            public void run(){
                android.graphics.Canvas canvas;
                SurfaceHolder holder = getHolder();
                canvas = holder.lockCanvas();

                if (colorCanvas == 1) {
                    canvas.drawColor(Color.argb(250, 255, 255, 255));//white canvas
                }if (colorCanvas == 2) {
                    canvas.drawARGB(250, 0, 0, 0);//black
                }if (colorCanvas == 3) {
                    canvas.drawARGB(250, 255, 0, 0);//red
                }if (colorCanvas == 4) {
                    canvas.drawColor(Color.argb(250, 255, 99, 99));//red light
                }if (colorCanvas == 5) {
                    canvas.drawColor(Color.argb(250, 255, 128, 0));//orange
                }if (colorCanvas == 6) {
                    canvas.drawColor(Color.argb(250, 255, 171, 25));//orange light
                }if (colorCanvas == 7) {
                    canvas.drawColor(Color.argb(250, 0, 255, 8));//green light
                }if (colorCanvas == 8) {
                    canvas.drawColor(Color.argb(250, 0, 168, 5));//green
                }if (colorCanvas == 9) {
                    canvas.drawColor(Color.argb(250, 0, 255, 247));//bright
                }if (colorCanvas == 10) {
                    canvas.drawColor(Color.argb(250, 0, 187, 255));//blue light
                }if (colorCanvas == 11) {
                    canvas.drawColor(Color.argb(250, 0, 128, 255));//blue
                }if (colorCanvas == 12) {
                    canvas.drawColor(Color.argb(250, 170,0,255));//purple
                }

                Rect myRect = new Rect();
                myRect.set(0, 0, canvas.getWidth(), canvas.getHeight() / 8);
                paint.setColor(Color.argb(250, 255, 255, 255));//white
                paint.setStyle(Paint.Style.FILL);
                canvas.drawRect(myRect, paint);

                canvas.drawPath(path, paint);

                holder.unlockCanvasAndPost(canvas);
            }
        }
    }
}