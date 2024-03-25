package com.muen.shootgame

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint

abstract class GameItem {
    lateinit var _bitmap: Bitmap
    var _pointX = 0
    var _pointY = 0
    abstract fun draw(canvas: Canvas, paint: Paint)
    abstract fun logic()
}