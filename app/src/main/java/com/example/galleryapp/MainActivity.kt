package com.example.galleryapp

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var imageView = ArrayList<Image>(10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun imagedrawable() {
            imageView[0].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.abstract_abstract_expressionism_art_2505693
                )
            )
            imageView[1].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.aerial_photography_aerial_shot_aerial_view_2583847
                )
            )
            imageView[2].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.alley_architecture_buildings_2526517
                )
            )
            imageView[3].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.architectural_design_architecture_bridge_2540653
                )
            )
            imageView[4].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.beautiful_breathtaking_canada_day_2526105
                )
            )
            imageView[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
            imageView[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
            imageView[7].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.clouds_coconut_trees_daylight_2486168
                )
            )
            imageView[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))
            imageView[9].setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.wallpaper_astronomy_astrophotography_2538107
                )
            )
        }
    }

    private fun Image.setImageDrawable(drawable: Drawable?) {
    }

    ///       <item name="android:layout_width">0dp</item>
//        <item name="android:layout_height">wrap_content</item>
//        <item name="android:layout_weight">1</item>
//        <item name="android:orientation">vertical</item>
    val layoutParams =
        LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

    inline fun <T> Iterable<T>.forEachIndexed(action: (index: Int, T) -> Unit): Unit {
        var imageDefault = 0
        val image = Array(10) { ImageView(this) }

            if (index > 5)
                if (index > 5) {
                    right_image.setImageDrawable(ImageView)
                    imageViews.forEachIndexed { index, i -> i.layoutParams = layoutParams }
                    imageViews.forEach { it.layoutParams = layoutParams }



                    //if(index > 5){right_image.addView(imageView[T])
                    //        else(left_image.addView(imageView[T]))}
                    left_image.layoutParams = layoutParams
                    left_image.setPadding(5, 4, 5, 4)
                    left_image.adjustViewBounds = true

                    right_image.layoutParams = layoutParams
                    right_image.setPadding(5, 4, 5, 4)
                    right_image.adjustViewBounds = true
                }
        }
    }
}


