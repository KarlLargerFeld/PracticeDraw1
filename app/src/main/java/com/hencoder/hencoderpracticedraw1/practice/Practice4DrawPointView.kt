package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice4DrawPointView : View {

    val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawPoint() 方法画点
        //        一个圆点，一个方点
        //        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        paint.strokeCap = Paint.Cap.ROUND
        paint.strokeWidth = (80f);
        paint.color = Color.BLACK
        canvas.drawPoint(100f,100f,paint);

        paint.strokeCap = Paint.Cap.SQUARE;
        canvas.drawPoint(200f,200f,paint);

        paint.strokeCap = Paint.Cap.BUTT;
        canvas.drawPoint(300f,300f,paint);
    }
}
