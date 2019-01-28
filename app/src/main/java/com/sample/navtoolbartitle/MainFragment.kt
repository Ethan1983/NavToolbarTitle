package com.sample.navtoolbartitle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val button = Button( inflater.context )
        button.text = "Launch Nested Fragment"

        button.setOnClickListener {
            findNavController().navigate( R.id.secondFragment, null, null )
        }

        return button
    }
}