package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice2DrawCircleView : View {

     val mPaint = Paint()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        mPaint.style = Paint.Style.FILL
        mPaint.isAntiAlias = true

        canvas.drawCircle(220f,100f,100f,mPaint)

        mPaint.style = Paint.Style.STROKE
        canvas.drawCircle(440f,100f,100f,mPaint)

        mPaint.color = Color.BLUE
        mPaint.style = Paint.Style.FILL
        canvas.drawCircle(220f,320f,100f,mPaint)

        mPaint.color = Color.BLACK
        mPaint.style = Paint.Style.STROKE
        mPaint.strokeWidth = 20f;
        canvas.drawCircle(440f,320f,100f,mPaint)


    }
}
