package com.example.user.ramenbykotlin.Custom

import android.content.Context
import android.graphics.Typeface

class CustomFont() {

    private lateinit var fontHead: Typeface
    private lateinit var fontData: Typeface

    fun getFontHead(context: Context): Typeface {
        if (fontHead == null) {
            fontHead = Typeface.createFromAsset(context.assets, "fonts/Kanit-Medium.ttf")
        }
        return fontHead
    }

    fun setFontHead(fontHead: Typeface) {
        this.fontHead = fontHead
    }

    fun getFontData(context: Context): Typeface {
        if (fontData == null) {
            fontData = Typeface.createFromAsset(context.assets, "fonts/Kanit-Light.ttf")
        }
        return fontData
    }

    fun setFontData(fontData: Typeface) {
        this.fontData = fontData
    }
}