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
 * Use the [LifeFragmentA.newInstance] factory method to
 * create an instance of this fragment.
 */
class LifeFragmentA : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onStart() {
        super.onStart()
        Log.i("LifeFragmentA", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeFragmentA", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeFragmentA", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeFragmentA", "onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LifeFragmentA", "onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeFragmentA", "onDestroy called")
    }
}
