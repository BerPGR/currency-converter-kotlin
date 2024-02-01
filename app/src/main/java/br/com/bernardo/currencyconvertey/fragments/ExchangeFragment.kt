package br.com.bernardo.currencyconvertey.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.bernardo.currencyconvertey.R
import br.com.bernardo.currencyconvertey.databinding.FragmentExchangeBinding

class ExchangeFragment : Fragment() {
    private val apikey = "fca_live_fVXFpFI7HTppbByEaiV85sfuKTXT9fMfw6mcTWUn"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_exchange, container, false)
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}