package space.beka.myapplication

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val animation_1 = AnimationUtils.loadAnimation(this, R.anim.scole)
        val animation_2 = AnimationUtils.loadAnimation(this, R.anim.translate)
        val animation_3 = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val animation_4 = AnimationUtils.loadAnimation(this, R.anim.alpha)
        val animation_5 = AnimationUtils.loadAnimation(this, R.anim.animation1)
        val animation_6 = AnimationUtils.loadAnimation(this, R.anim.animations)
        val animation_7 = AnimationUtils.loadAnimation(this, R.anim.animations2)
        val animation_8 = AnimationUtils.loadAnimation(this, R.anim.animations3)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            var rando = 0
            rando = Random.nextInt(8)
                when (rando) {
                    0 -> img.startAnimation(animation_1)
                    1 -> img.startAnimation(animation_2)
                    2 -> img.startAnimation(animation_3)
                    3 -> img.startAnimation(animation_4)
                    4 -> img.startAnimation(animation_5)
                    5 -> img.startAnimation(animation_6)
                    6 -> img.startAnimation(animation_7)
                    7 -> img.startAnimation(animation_8)
                }

        }
//        anim.setAnimationListener(object :Animation.AnimationListener{
//            override fun onAnimationStart(animation: Animation?) {
//
//            }
//
//            override fun onAnimationEnd(animation: Animation?) {
//
//            }
//
//            override fun onAnimationRepeat(animation: Animation?) {
//
//            }
//        })

    }

}
