package com.mobvcasting.simpledrawexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawingView extends View {
    
	public DrawingView(Context context) {
        super(context);
    }
	
	public DrawingView(Context context, AttributeSet attrs) {
		super(context,attrs);
	}
	
	public DrawingView(Context context, AttributeSet attrs, int defStyle) {
		super(context,attrs,defStyle);
	}
    
	@Override
    protected void onDraw(Canvas canvas) {
		Paint p = new Paint();
		
		p.setColor(Color.BLUE);
		//p.setARGB(a, r, g, b)

		int width = getWidth();
		int height = getHeight();

		canvas.drawLine(0, 0, width, height, p);
  		
		canvas.drawText("HELLO", 5, 10, p);
	}		
}