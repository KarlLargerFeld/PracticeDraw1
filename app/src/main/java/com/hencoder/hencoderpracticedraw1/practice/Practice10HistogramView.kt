package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class Practice10HistogramView : View {

    val mPaint = Paint()
    val mPaintRect = Paint()
    val mPaintText = Paint()

    val mPath = Path()

    val items : Array<String> = arrayOf("Froyo", "GB", "ICS", "JB", "KitKat", "L", "M")

    val TITLE : String = "直方图"


    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //绘制坐标轴
        mPath.moveTo(100f,100f)
        mPath.lineTo(100f,500f)
        mPath.lineTo(800f,500f)

        mPaint.strokeWidth = 10f
        mPaint.style = Paint.Style.STROKE
        mPaint.color = Color.BLACK
        canvas.drawPath(mPath,mPaint)





    }
}
