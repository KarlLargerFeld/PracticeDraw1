package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class Practice9DrawPathView : View {

    val paint =  Paint()
    val path = Path()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawPath() 方法画心形


        paint.style = Paint.Style.FILL_AND_STROKE
        path.addArc(100f, 100f, 200f, 200f, -225f, 225f);
        path.arcTo(200f, 100f, 300f, 200f, -180f, 225f,false);


        path.lineTo(200f, 250f)

        canvas.drawPath(path,paint)

    }
}
