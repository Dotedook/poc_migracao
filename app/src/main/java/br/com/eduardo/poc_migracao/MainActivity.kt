package br.com.eduardo.poc_migracao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController

class ExampleFragment : Fragment(R.layout.NavHostFragment)


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById<View>(R.id.button) as Button
        btn.setOnClickListener { view ->
            ExampleFragment.findNavController(view).navigate(R.id.pokemon)
        }
    }


}

