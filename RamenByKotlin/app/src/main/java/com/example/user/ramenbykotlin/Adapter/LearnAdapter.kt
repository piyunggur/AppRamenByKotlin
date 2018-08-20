package com.example.user.ramenbykotlin.Adapter

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import com.example.user.ramenbykotlin.R
import kotlinx.android.synthetic.main.learn_slide.view.*

class LearnAdapter: PagerAdapter {

    var context:Context
    var images:Array<Int>
    lateinit var inflater: LayoutInflater

    constructor(context: Context,images: Array<Int>):super(){
        this.context=context
        this.images=images
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == "object" as RelativeLayout

    override fun getCount(): Int = images.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var image:ImageView
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view:View = inflater.inflate(R.layout.learn_slide,container,false)
        image=view.findViewById(R.id.learn_image)
        image.setBackgroundResource(images[position])
        container!!.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container!!.removeView("object" as RelativeLayout)
    }
}