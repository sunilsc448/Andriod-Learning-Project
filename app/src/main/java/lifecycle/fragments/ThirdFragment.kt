package lifecycle.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlintutorial.R
import kotlinx.android.synthetic.main.fragment_second.*
import lifecycle.fragments.listener.FragmentClickListener

class ThirdFragment(val clickListener:FragmentClickListener) : Fragment() {
    private val TAG = "Third Fragment"
    override fun onAttach(context: Context) {
        Log.i(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG, "onCreateView")
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i(TAG, "onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i(TAG, "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(TAG, "onDetach")
        super.onDetach()
    }

    companion object {
        @JvmStatic
        fun newInstance(clickListener: FragmentClickListener) = ThirdFragment(clickListener)
    }
}