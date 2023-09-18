package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LifeFragmentB.newInstance] factory method to
 * create an instance of this fragment.
 */
class LifeFragmentB : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

        override fun onStart() {
            super.onStart()
            Log.i("LifeFragmentB", "onStart called")
        }

        override fun onResume() {
            super.onResume()
            Log.i("LifeFragmentB", "onResume called")
        }

        override fun onPause() {
            super.onPause()
            Log.i("LifeFragmentB", "onPause called")
        }

        override fun onStop() {
            super.onStop()
            Log.i("LifeFragmentB", "onStop called")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.i("LifeFragmentB", "onDestroyView called")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.i("LifeFragmentB", "onDestroy called")
        }
    }