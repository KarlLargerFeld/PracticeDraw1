package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice8DrawArcView : View {

    val paint =  Paint()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        paint.style = Paint.Style.STROKE

        canvas.drawArc(100f,100f,500f,300f,200f,40f,false,paint)

        paint.style = Paint.Style.FILL
        canvas.drawArc(100f,100f,500f,300f,10f,160f,false,paint)

        canvas.drawArc(100f,100f,500f,300f,-20f,-90f,true,paint)

    }
}
