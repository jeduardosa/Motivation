package learn.project.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import learn.project.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNewPhrase.setOnClickListener(this)

        supportActionBar?.hide()

    }

    override fun onClick(v: View?) {
        if (v.id == R.id.button_new_phrase){

        }
    }
}