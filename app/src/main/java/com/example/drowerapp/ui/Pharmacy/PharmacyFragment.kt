package com.example.drowerapp.ui.Pharmacy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.drowerapp.R
import com.example.drowerapp.databinding.FragmentLaboratoryBinding
import com.example.drowerapp.databinding.FragmentPharmacyBinding


class PharmacyFragment : Fragment() {
    private var _binding: FragmentPharmacyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentPharmacyBinding.inflate(inflater, container, false)
        val root: View = binding.root
//        val weblab: WebView = binding.weblab
//        weblab.loadUrl("file:///android_asset/lab.html")
        return root
    }
//token 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
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}