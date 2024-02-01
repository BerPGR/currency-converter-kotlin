package br.com.bernardo.currencyconvertey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.com.bernardo.currencyconvertey.databinding.ActivityMainBinding
import br.com.bernardo.currencyconvertey.fragments.CurrencyFragment
import br.com.bernardo.currencyconvertey.fragments.ExchangeFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menu ->
            when (menu.itemId) {
                R.id.navigation_exchange ->{
                    loadFragment(ExchangeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_currency -> {
                    loadFragment(CurrencyFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}