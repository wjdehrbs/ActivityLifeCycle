package com.example.activitylifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.e(TAG, "onCreate")

        binding.run {
            fragment1Btn.setOnClickListener {
                setFragment(LifeFragmentA())
            }
            fragment2Btn.setOnClickListener {
                setFragment(LifeFragmentB())
            }
        }
    }

    private fun setFragment(frag: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.frameLayout, frag)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }
}
