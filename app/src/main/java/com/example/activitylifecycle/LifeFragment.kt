package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activitylifecycle.databinding.FragmentLifeBinding


class LifeFragment : Fragment() {

    private lateinit var binding : FragmentLifeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LifeFragment", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLifeBinding.inflate(inflater)

        Log.i("LifeFragment", "onCreateView called")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LifeFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeFragment", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeFragment", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeFragment", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeFragment", "onStop called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("LifeFragment", "onSaveInstanceState called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LifeFragment", "onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeFragment", "onDestroy called")
    }

}