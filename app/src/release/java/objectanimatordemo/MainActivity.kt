//package com.example.objectanimatordemo
//
//import android.animation.AnimatorSet
//import android.animation.ObjectAnimator
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.Toast
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var tabIndicatorLine : View
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        tabIndicatorLine = findViewById(R.id.tabIndicatorLine)
//        findViewById<Button>(R.id.button2).setOnClickListener { view ->
//            var tabAnimatorSet = AnimatorSet()
//            val moveX = ObjectAnimator.ofFloat(tabIndicatorLine, View.TRANSLATION_X, tabIndicatorLine!!.translationX, 0.0F)
////                moveX.interpolator = FastOutSlowInInterpolator()
//            moveX.duration = 300L
//            tabAnimatorSet.play(moveX)
//            tabAnimatorSet.start()
//        }
//
//        findViewById<Button>(R.id.button).setOnClickListener { view ->
////            Toast.makeText(applicationContext, "Hello!", Toast.LENGTH_SHORT).show()
//
//            var tabAnimatorSet = AnimatorSet()
//            val moveX = ObjectAnimator.ofFloat(tabIndicatorLine, View.TRANSLATION_X, tabIndicatorLine!!.translationX, 100.0F)
////                moveX.interpolator = FastOutSlowInInterpolator()
//            moveX.duration = 300L
//            tabAnimatorSet.play(moveX)
//            tabAnimatorSet.start()
//        }
//    }
//}